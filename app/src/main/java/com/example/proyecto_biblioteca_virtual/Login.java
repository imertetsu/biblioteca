package com.example.proyecto_biblioteca_virtual;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import javax.annotation.Nonnull;

public class Login extends AppCompatActivity implements View.OnClickListener{
    private Button btnLogin;
    private EditText emailText;
    private EditText passText;
    private ProgressDialog progressDialog;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();

        emailText = (EditText) findViewById(R.id.email);
        passText = (EditText) findViewById(R.id.pass);
        btnLogin = (Button) findViewById(R.id.btnIngresar);

        progressDialog = new ProgressDialog(this);

        btnLogin.setOnClickListener(this);
    }

    private void ingresarUsuario(){

        String email = emailText.getText().toString().trim();
        String password = passText.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "se debe ingresar un email", Toast.LENGTH_LONG).show();


            return;
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(this, "se debe ingresar una contrasenia", Toast.LENGTH_LONG).show();
            return;
        }

        progressDialog.setMessage("Ingresando...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@Nonnull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Login.this, "Bienvenido"+emailText.getText(),Toast.LENGTH_LONG).show();
                            FirebaseUser user = firebaseAuth.getCurrentUser();
                            Intent materiasAdm = new Intent(Login.this, Nivel_03_admin.class);
                            startActivity(materiasAdm);
                        }else{
                            Toast.makeText(Login.this, "No se pudo ingresar",Toast.LENGTH_LONG).show();
                        }
                        progressDialog.dismiss();
                    }
                });
    }
    @Override
    public void onClick(View view){

        ingresarUsuario();
    }
    /*public void materiasAdmn(View view){
        Intent materiasAdm = new Intent(this, Nivel_03_admin.class);
        startActivity(materiasAdm);
    }*/
}
