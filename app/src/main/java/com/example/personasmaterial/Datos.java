package com.example.personasmaterial;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Datos {

    private static String bd = "Personas";

    private static DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

    public static ArrayList<Persona> personas = new ArrayList<>();

    public static String getId(){
        return  databaseReference.push().getKey();
    }

    public static ArrayList<Persona> obtener() {
        return personas;
    }

    public static void setPersonas(ArrayList<Persona> personas) {
        Datos.personas = personas;
    }

    public static void guardar (Persona p ){
        databaseReference.child(bd).child(p.getId()).setValue(p);
    }


}

