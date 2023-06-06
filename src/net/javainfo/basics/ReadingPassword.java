package net.javainfo.basics;

import java.io.Console;

/*
* uruchamiamy nie z IDE tylko z konsoli/terminala
* przechodzimy do katalogu src
* kompilujemy komendą:
* $javac net/javainfo/basics/ReadingPassword.java
* uruchamiamy potem następująco:
* $java net.javainfo.basics.ReadingPassword
* */
public class ReadingPassword {

    public static void main(String[] args){

        Console console = System.console();
        StringBuilder passwordConst = new StringBuilder();

        System.out.println("Podaj nazwe uzytkownika");
        String userName = console.readLine();

        System.out.println("Podaj haslo");
        char[] password = console.readPassword();

        for(int i = 0; i < password.length; ++i){
            passwordConst.append(password[i]);
        }


        System.out.println("Nazwa uzytkownika: " + userName + "\nHasło: " + passwordConst);



    }
}
