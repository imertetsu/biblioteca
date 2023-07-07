package com.example.proyecto_biblioteca_virtual;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump {

    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> grupoA = new ArrayList<String>();
        grupoA.add("Algebra 1");
        grupoA.add("Calculo 1");
        grupoA.add("Fisica General");
        grupoA.add("Ingles 1");
        grupoA.add("Introduccion A La Programacion");
        grupoA.add("Metodologia De Investigacion");

        List<String> grupoB = new ArrayList<String>();
        grupoB.add("Algebra 2");
        grupoB.add("Arquitectura De Computadoras 1");
        grupoB.add("Calculo 2");
        grupoB.add("Elementos de Programacion Y Estructura De Datos");
        grupoB.add("Matematica Discreta");

        List<String> grupoC = new ArrayList<String>();
        grupoC.add("Estadistica 1");
        grupoC.add("Ecuaciones Diferenciales");
        grupoC.add("Calculo Numerico");
        grupoC.add("Metodos, Tecnicas Y Taller de Programacion");
        grupoC.add("Base De Datos 1");
        grupoC.add("Circuitos Electronicos");

        List<String> grupoD = new ArrayList<String>();
        grupoD.add("Estadistica 2");
        grupoD.add("Investigacion Operativa");
        grupoD.add("Contabilidad Basica");
        grupoD.add("Sistemas De Informacion");
        grupoD.add("Base De Datos 2");
        grupoD.add("Taller de Sistemas Operativos");


        List<String> grupoE = new ArrayList<String>();
        grupoE.add("Mercadotecnia");
        grupoE.add("Investigacion Operativa 2");
        grupoE.add("Sistemas 1");
        grupoE.add("Sistemas De Informacion 2");
        grupoE.add("Taller De Base De Datos");
        grupoE.add("Aplicacion De Sistemas Operativos");
        grupoE.add("Ingles 2");

        List<String> grupoF = new ArrayList<String>();
        grupoF.add("Sistemas Economicos");
        grupoF.add("Simulacion De Sistemas");
        grupoF.add("Sistemas 2");
        grupoF.add("Ingenieria De Software");
        grupoF.add("Inteligencia Artificial");
        grupoF.add("Redes De Computadoras");
        grupoF.add("Telefonia Ip");

        List<String> grupoG = new ArrayList<String>();
        grupoG.add("Planifificacion Y Evalucion De Proyectos");
        grupoG.add("Dinamica De Sistemas");
        grupoG.add("TOPICOS SELECTOS I");
        grupoG.add("Taller De Ingenieria De Software");
        grupoG.add("Gestion de Calidad De Sowtware");
        grupoG.add("Redes Avanzadas De Computadoras");

        List<String> grupoH = new ArrayList<String>();
        grupoH.add("Gestion Estrategica De Empresas");
        grupoH.add("Taller De Simulacion De Sistemas");
        grupoH.add("Ingles 3");
        grupoH.add("Metodologia Y Planificacion De Proyecto De Grado");
        grupoH.add("Evaluacion y Auditoria De Sistemas");
        grupoH.add("Seguridad De Sistemas");

        List<String> grupoI = new ArrayList<String>();
        grupoI.add("Aplicacines Web Avanzadas");
        grupoI.add("Costos Industriales");
        grupoI.add("Practica Empresarial");
        grupoI.add("Planificacion Y Control De La Produccion 1");
        grupoI.add("Planificacion Y Control De La Produccion 2");
        grupoI.add("Programacion Movil");
        grupoI.add("Proyecto Final");


        List<String> grupoElec = new ArrayList<String>();
        grupoElec.add("INGLES I");
        grupoElec.add("INGLES II");
        grupoElec.add("INGLES III");
        grupoElec.add("SistemasColaborativos");


        expandableListDetail.put("Nivel A", grupoA);
        expandableListDetail.put("Nivel B", grupoB);
        expandableListDetail.put("Nivel C", grupoC);
        expandableListDetail.put("Nivel D", grupoD);
        expandableListDetail.put("Nivel E", grupoE);
        expandableListDetail.put("Nivel F", grupoF);
        expandableListDetail.put("Nivel G", grupoG);
        expandableListDetail.put("Nivel H", grupoH);
        expandableListDetail.put("Nivel I", grupoI);
        expandableListDetail.put("Electivas", grupoElec);

        return expandableListDetail;
    }
}


