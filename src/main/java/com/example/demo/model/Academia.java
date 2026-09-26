package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Academia {

    public static void main(String[] args){

        System.out.println(Academia.idEsPerfecto(6));




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
