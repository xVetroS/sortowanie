package com.company;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static int menu(){
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *                 MENU                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Zbior danych optymistycznych.");
        System.out.println("     2. Zbior danych losowych.");
        System.out.println("     3. Zbior danych pesymistycznych.");
        System.out.println("     4. POMIAR CZASU - BADANIE.");
        System.out.println("     ****************************************");

        Scanner wejscie = new Scanner(System.in);
        int w = wejscie.nextInt();

        return w;
    }

    public static int menu_next(){
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *               POMIAR CZASU           *");
        System.out.println("     ****************************************");
        System.out.println("     1. Wczytaj QuickSort z danymi: ");
        System.out.println("     2. Wczytaj SelectionSort z danymi: ");
        System.out.println("     3. Wczytaj InsertionSort z danymi: ");
        System.out.println("     4. Wczytaj BubbleSort z danymi: ");
        System.out.println("     0. Zakończ działanie programu:  ");
        System.out.println("     ****************************************");

        Scanner wejscie = new Scanner(System.in);
        int in = wejscie.nextInt();

        return in;
    }

    public static void main(String[] args) throws IOException {
        sortowanie_zbioru sz = new sortowanie_zbioru();
        int wybor;
        int ilosc_elementow1 = 0;
        int ilosc_elementow2 = 0;
        int ilosc_elementow3 = 0;
        int nr_plik;
        String nazwa_zbioru1 = "Pesymistycznie";
        String nazwa_zbioru2 = "Losowe";
        String nazwa_zbioru3 = "Optymistyczne";

        Scanner wprowadz = new Scanner(System.in);

        wybor = menu();
        while(wybor!=4){
            switch(wybor){
                case 1:
                    for (int liczba_pliku = 1; liczba_pliku <= 10; liczba_pliku++) {
                        try {
                            Files.createFile(Paths.get("C:\\Users\\mateu\\Desktop\\Projests\\Czas_Sortowania\\src\\com\\company\\" + nazwa_zbioru3 + liczba_pliku + ".txt"));
                            System.out.println("Plik " + liczba_pliku + " zbioru " + nazwa_zbioru3 + " zostal utworzony!");
                        } catch (FileAlreadyExistsException e) {
                            System.out.println("Plik " + liczba_pliku + " zbioru " + nazwa_zbioru3 + " już istnieje!");
                        }

                    }
                    int petla1;
                    System.out.println("Zbior danych losowy wygenerowany dziesięć razy: ");
                    for(petla1=1; petla1<11; petla1++) {
                        System.out.println("Podaj ilosc elementow do zapisu: ");
                        ilosc_elementow1 = wprowadz.nextInt();
                        int losowe1[] = new int[ilosc_elementow1];
                        System.out.println("Plik : " + petla1);
                        generator_liczb.generowanie_losowych(losowe1, ilosc_elementow1);
                        System.out.println();
                        PrintWriter zapisz = new PrintWriter("C:\\Users\\mateu\\Desktop\\Projests\\Czas_Sortowania\\src\\com\\company\\" + nazwa_zbioru3 + petla1 + ".txt");
                        for (int y = 0; y < losowe1.length; y++) {
                            zapisz.write(Integer.toString(losowe1[y]) + " ");
                        }
                        zapisz.close();
                    }
                    for(int y=1; y<=10; y++)
                    {
                        System.out.println(" ");
                        System.out.println("Plik "+y+" zbiór: "+nazwa_zbioru3+".");
                        System.out.print("Dane: ");

                        sz.wypisz_dane_z_pliku(nazwa_zbioru3, y);
                    }
                    break;
                case 2:
                    for (int liczba_pliku = 1; liczba_pliku <= 10; liczba_pliku++) {
                        try {
                            Files.createFile(Paths.get("C:\\Users\\mateu\\Desktop\\Projests\\Czas_Sortowania\\src\\com\\company\\" + nazwa_zbioru2 + liczba_pliku + ".txt"));
                            System.out.println("Plik " + liczba_pliku + " zbioru " + nazwa_zbioru2 + " zostal utworzony!");
                        } catch (FileAlreadyExistsException e) {
                            System.out.println("Plik " + liczba_pliku + " zbioru " + nazwa_zbioru2 + " już istnieje!");
                        }

                    }
                    int petla2;
                    System.out.println("Zbior danych losowy wygenerowany dziesięć razy: ");
                    for(petla2=1; petla2<11; petla2++) {
                        System.out.println("Podaj ilosc elementow do zapisu: ");
                        ilosc_elementow2 = wprowadz.nextInt();
                        int losowe2[] = new int[ilosc_elementow2];
                        System.out.println("Plik : " + petla2);
                        generator_liczb.generowanie_losowych(losowe2, ilosc_elementow2);
                        System.out.println();
                        PrintWriter zapisz = new PrintWriter("C:\\Users\\mateu\\Desktop\\Projests\\Czas_Sortowania\\src\\com\\company\\" + nazwa_zbioru2 + petla2 + ".txt");
                        for (int y = 0; y < losowe2.length; y++) {
                            zapisz.write(Integer.toString(losowe2[y]) + " ");
                        }
                        zapisz.close();
                    }
                    for(int y=1; y<=10; y++)
                    {
                        System.out.println(" ");
                        System.out.println("Plik "+y+" zbiór: "+nazwa_zbioru2+".");
                        System.out.print("Dane: ");
                        sz.wypisz_dane_z_pliku(nazwa_zbioru2, y);
                    }
                    break;
                case 3:
                    for (int liczba_pliku = 1; liczba_pliku <= 10; liczba_pliku++) {
                        try {
                            Files.createFile(Paths.get("C:\\Users\\mateu\\Desktop\\Projests\\Czas_Sortowania\\src\\com\\company\\" + nazwa_zbioru1 + liczba_pliku + ".txt"));
                            System.out.println("Plik " + liczba_pliku + " zbioru " + nazwa_zbioru1 + " zostal utworzony!");
                        } catch (FileAlreadyExistsException e) {
                            System.out.println("Plik " + liczba_pliku + " zbioru " + nazwa_zbioru1 + " już istnieje!");
                        }

                    }
                    int petla3;
                    System.out.println("Zbior danych losowy wygenerowany dziesięć razy: ");
                    for(petla3=1; petla3<11; petla3++) {
                        System.out.println("Podaj ilosc elementow do zapisu: ");
                        ilosc_elementow3 = wprowadz.nextInt();
                        int losowe3[] = new int[ilosc_elementow3];
                        System.out.println("Plik :" + petla3);
                        generator_liczb.generowanie_losowych(losowe3, ilosc_elementow3);
                        sortowanie_zbioru.swap(losowe3);
                        System.out.println();
                        PrintWriter zapisz = new PrintWriter("C:\\Users\\mateu\\Desktop\\Projests\\Czas_Sortowania\\src\\com\\company\\" + nazwa_zbioru1 + petla3 + ".txt");
                        for (int y = 0; y < losowe3.length; y++) {
                            zapisz.write(Integer.toString(losowe3[y]) + " ");
                        }
                        zapisz.close();
                    }
                        for(int y=1; y<=10; y++)
                        {
                            System.out.println(" ");
                            System.out.println("Plik "+y+" zbiór: "+nazwa_zbioru1+".");
                            System.out.print("Dane: ");
                            sz.wypisz_dane_z_pliku(nazwa_zbioru1, y);
                        }
                    break;

            }
            System.out.println("\nWciśnij Enter, aby kontynuować...");
            System.in.read();
            wybor = menu();
        }
        wybor = menu_next();
        while(wybor!=0){
            switch(wybor)
            {
                case 1:
                    break;
                case 2:
                    for(nr_plik=1; nr_plik<=10; nr_plik++) {
                        System.out.println("");
                        System.out.println("Dane przed sortowaniem: zbiór<"+nazwa_zbioru3+"> z pliku: "+nr_plik+".");
                        try {
                            sz.wypisz_dane_z_pliku(nazwa_zbioru3, nr_plik);
                        }
                        catch(FileNotFoundException e)
                        {
                            System.out.println("Nie ma takiego pliku!");
                        }
                        System.out.println("");
                        System.out.println("Dane przed sortowaniem: zbiór<"+nazwa_zbioru2+"> z pliku: "+nr_plik+".");
                        try {
                            sz.wypisz_dane_z_pliku(nazwa_zbioru2, nr_plik);
                        } catch(FileNotFoundException e)
                        {
                            System.out.println("Nie ma takiego pliku!");
                        }
                        System.out.println("");
                        System.out.println("Dane przed sortowaniem: zbiór<"+nazwa_zbioru1+"> z pliku: "+nr_plik+".");
                        try {
                            sz.wypisz_dane_z_pliku(nazwa_zbioru1, nr_plik);
                        }catch(FileNotFoundException e)
                        {
                            System.out.println("Nie ma takiego pliku!");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Nie ma takiej opcji!");
                    break;
            }
            System.out.println("\nWciśnij Enter, aby kontynuować...");
            System.in.read();
            wybor = menu_next();
        }
    }
}
