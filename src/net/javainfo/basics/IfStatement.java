package net.javainfo.basics;


import java.util.Scanner;

// Przykład użycia pętli warunkowych
public class IfStatement {

    public static void main(String[] args){

        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wiek: ");
        age = scanner.nextInt();

        if(age < 18){
            System.out.printf("Masz %d lat - %s",age,"nie jesteś pełnoletni/a.");
        }
        else if (age == 18){
            System.out.println("Właśnie osiągnąłeś/aś pełnoletność.");
        }
        else{
            System.out.printf("Jesteś pełnoletni/a już od %d lat", age - 18);
        }
    }
}
