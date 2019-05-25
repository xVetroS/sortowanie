package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class sortowanie_zbioru {

    public static void swap(int[] array)
    {
        int start = 0;
        int end = array.length-1;
        while(start<end)
        {
            int zamiana = array[start];
            array[start] = array[end];
            array[end] = zamiana;
            start++;
            end--;

        }
    }

    public void wypisz_dane_z_pliku(String nazwa_pliku, int numer) throws FileNotFoundException
    {
        File file = new File("C:\\Users\\mateu\\Desktop\\Projests\\Czas_Sortowania\\src\\com\\company\\"+nazwa_pliku+numer+".txt");
        String nazwa="";
        Scanner scanner = new Scanner(file);
        try {
            nazwa = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringTokenizer token = new StringTokenizer(nazwa);
        int i = 0;
        List<Integer> wypis = new ArrayList<>();

        while(token.hasMoreTokens())
        {
            wypis.add(Integer.parseInt(token.nextToken()));
            System.out.print(wypis.get(i) + " ");
            i++;

        }
        System.out.println(" ");
        System.out.println("Dane po sortowaniu SelectionSort: ");
        double start = System.currentTimeMillis();
        System.out.println(selectionsort(wypis));
        double stop = System.currentTimeMillis();
        System.out.print("Czas: ");
        System.out.println((stop - start) + "s.");
        System.out.println(" ");


    }

    public List<Integer> selectionsort(List<Integer> arr)
    {
        int element = arr.size();

        for (int i = 0; i < element-1; i++)
        {
            //Znajduje minimalny element w tablicy.
            int min_idex = i;
            for (int j = i+1; j < element; j++)
                if (arr.get(j) < arr.get(min_idex))
                    min_idex = j;
            //Zamienia znaleziony minimalny element na pierwszy.
            int temp = arr.get(min_idex);
            arr.set(min_idex,arr.get(i));
            arr.set(i,temp);
        }
        return arr;
    }

}

