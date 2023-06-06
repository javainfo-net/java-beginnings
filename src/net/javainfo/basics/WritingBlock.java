package net.javainfo.basics;

public class WritingBlock {

    public static void main(String[] args){
        //od Javy 15
        String weekend = """
                Friday\
                ,
                Saturday\
                ,
                Sunday
                """;

        System.out.print(weekend);
    }
}
