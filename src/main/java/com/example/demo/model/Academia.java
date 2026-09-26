package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Academia {

    public static void main(String[] args){

        Estudiante estudiante1 = new Estudiante("Juan", 1, 300, "test", 17, "24/09/26");
        Estudiante estudiante2 = new Estudiante("Jose", 6, 300, "test", 12, "24/09/26");
        Estudiante estudiante3 = new Estudiante("Julian", 4, 300, "test", 15, "24/09/26");
        Estudiante estudiante4 = new Estudiante("Jhan", 28, 300, "test", 14, "24/09/26");
        Estudiante estudiante5 = new Estudiante("Jhon", 12, 300, "test", 18, "24/09/26");
        Estudiante estudiante6 = new Estudiante("Javelin", 13, 300, "test", 12, "24/09/26");

        System.out.println("El id del estudiante 1 es perfecto?: " + idEsPerfecto(estudiante1.documento()));
        System.out.println("El id del estudiante 2 es perfecto?: " + idEsPerfecto(estudiante2.documento()));
        System.out.println("El id del estudiante 3 es perfecto?: " + idEsPerfecto(estudiante3.documento()));
        System.out.println("El id del estudiante 4 es perfecto?: " + idEsPerfecto(estudiante4.documento()));
        System.out.println("El id del estudiante 5 es perfecto?: " + idEsPerfecto(estudiante5.documento()));
        System.out.println("El id del estudiante 6 es perfecto?: " + idEsPerfecto(estudiante6.documento()));




    }

    // metodo id es perfecto
    public static boolean idEsPerfecto (int n){
        if(n <= 1){
            return false;
        }

        int suma = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                suma += i;
            }
        }
        return suma == n;
    }



}
