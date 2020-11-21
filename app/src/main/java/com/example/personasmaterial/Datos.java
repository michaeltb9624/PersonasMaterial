package com.example.personasmaterial;

import java.util.ArrayList;

public class Datos {
    public static ArrayList<Persona> personas = new ArrayList<>();

    public static ArrayList<Persona> getPersonas() {
        return personas;
    }

    public static void setPersonas(ArrayList<Persona> personas) {
        Datos.personas = personas;
    }

    public static void guardar (Persona p ){
        personas.add(p);
    }
}

