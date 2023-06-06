package net.javainfo.basics;

import java.util.Scanner;

public class Reading {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imie/imiona");
        String names = scanner.nextLine();

        System.out.println("Podaj swoje nazwisko");
        String surname = scanner.next();

        System.out.println("I jeszcze podaj wiek");
        int age = scanner.nextInt();

        System.out.println("Witaj " + names + " " + surname + ". Twój wiek to " + age);





    }
}
