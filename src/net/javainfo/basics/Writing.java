package net.javainfo.basics;

public class Writing {

    static StringBuilder builder = new StringBuilder();
    public static void main(String[] args){

        String writing1 = "First writing";
        String writing3 = "Third writing";

        builder.append(writing1);
        builder.append(" ");
        builder.append("Second writing ");
        builder.append(writing3);

        String finalWriting =  builder.toString();

        System.out.println(finalWriting + " -> with length " + finalWriting.length() + " char(s)");


    }
}
