package net.javainfo.basics;

import java.util.Arrays;


//Przykład użycia i operacji na tablicach
public class Array {


    public static void oneDimensionArray(){
        int size = 5;
        int[] tab = new int[size];
        int[] tabCopy = new int[size];

        for(int i = 0 ; i < tab.length; ++i){
            tab[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Tablica tab:");
        for(int t : tab){
            System.out.println(t);
        }

        tabCopy = Arrays.copyOf(tab,tab.length);

        Arrays.sort(tabCopy);

        System.out.println("Posortowana kopia tablicy tab jako napis: " + Arrays.toString(tabCopy));

    }

    public static void manyDimensionArray(){

        int[][] tab = {
            {22 , 11, 3},
            {6 , 9, 14},
            {17, 26, 29}
        };

        //wypisanie zawartości tablicy wielowymiarowej
        for(int[] row : tab) {
            for (int value : row) {
                System.out.print(value + ", ");
            }
            System.out.println();
        }

        //wypisanie zawartości tablicy wielowymiarowej jako napis
        System.out.println(Arrays.deepToString(tab));
    }

    public static void jaggedArray(){

        int size = 5;
        int[][] tab = new int[size][];

        for(int i = 0; i < tab.length; ++i){
            tab[i] = new int[size--];
        }


        for(int i = 0; i < tab.length; ++i){
            for (int j = 0; j < tab[i].length; ++j){
                tab[i][j] = (int)(Math.random() * 100 + 1);
            }
        }


        System.out.println(Arrays.deepToString(tab));
    }
    public static void main(String[] args){

    //tablica jednowymiarowa
    oneDimensionArray();

    //tablica wielowymiarowa
    manyDimensionArray();

    //tablica postrzępiona - wielowymiarowa, o różnej długości
    jaggedArray();
    }
}
