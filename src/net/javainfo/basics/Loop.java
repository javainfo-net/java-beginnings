package net.javainfo.basics;

//Przykład zastosowania pętli nieokreślonej ilością wykonania
public class Loop {

    public static void main(String[] args){

        int amount = 1;

        while (amount <= 3){
            System.out.println(amount++);
        }

        do{
            System.out.println(amount++);
        }while(amount <= 6);
    }
}
