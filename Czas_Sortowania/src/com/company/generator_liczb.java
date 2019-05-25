package com.company;

import java.util.List;
import java.util.Random;

public class generator_liczb {


    public static  List<Integer> generowanie_losowych(List<Integer> tablica, int konkretnie_ile)
    {
        for(int i=0; i<konkretnie_ile;i++)
        {
            Random zbior_losowy = new Random();
            tablica.set(i, zbior_losowy.nextInt(100));
            System.out.println(tablica.get(i)+ " ");
        }
        return tablica;
    }
}
