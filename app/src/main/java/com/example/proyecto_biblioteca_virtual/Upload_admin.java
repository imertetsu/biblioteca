package com.example.proyecto_biblioteca_virtual;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class Upload_admin extends AppCompatActivity {
    String zelda;
    Button upload;
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;
    StorageReference ref;

    String nivelUpload;
    String materiaUpload;
    int CODE=215;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_admin);
        //final String link = getIntent().getStringExtra("Url");
        final String niveladm = getIntent().getStringExtra("Nivel");
        final String materiaadm = getIntent().getStringExtra("Materia");

        nivelUpload = niveladm;
        materiaUpload = materiaadm;

        //zelda = link.substring(35);

        upload=findViewById(R.id.btnup);
        storageReference = FirebaseStorage.getInstance().getReference();

        upload.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),zelda,Toast.LENGTH_SHORT).show();
                selectFile();
            }
        });
    }

    public void selectFile()
    {

        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
        i.setType("*/*");
        startActivityForResult(Intent.createChooser(i,"Select a file"), CODE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String filePath = data.getDataString();
        Uri SelectedFileLocation=Uri.parse(filePath);
        UploadFile(SelectedFileLocation);

        Uri fileSelected = data.getData();
        super.onActivityResult(requestCode, resultCode, data);

    }

    public  void UploadFile(Uri file)
    {
        Toast.makeText(this, "Please wait.. the file is uploading!", Toast.LENGTH_SHORT).show();
        //final String descargaurl = zelda;

        //Toast.makeText(getApplicationContext(),descargaurl,Toast.LENGTH_SHORT).show();

        //storageReference = firebaseStorage.getInstance().getReference();
        //ref = storageReference.child("Algebra/"+file.getLastPathSegment()+".pdf");
        //ref = storageReference.child("Nivel A/Algebra I/"+file.getLastPathSegment()+".pdf");
        ref = storageReference.child(nivelUpload+"/"+materiaUpload+"/"+file.getLastPathSegment()+".pdf");


        ref.putFile(file)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        Toast.makeText(Upload_admin.this, "Archivo subido exitosamente", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                        Toast.makeText(Upload_admin.this, "Fallo al subir el archivo", Toast.LENGTH_SHORT).show();

                    }
                });
    }
}
