package net.javainfo.basics;

public class WritingFormatted {

    public static void main(String[] args){

        double x = 123456.123456;

        System.out.printf("%3.3f",x);

        System.out.printf("%n%s ma %d godziny. - %b%n","Doba",24,true);

        String message = String.format("%, .2f",x);

        //dostępna metoda od Javy 15
        String messageToPrint = "Zakup kosztował: %s euro.".formatted(message);

        System.out.println(messageToPrint);
    }
}
