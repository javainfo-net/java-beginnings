package net.javainfo.basics;

//Przykład instrukcji przerwyających przepływ sterowania
public class BreakingInstruction {

    public static void main(String[] args){

        int n = 0;
        int[] tab = new int[21];
        boolean check = true;

        finish:
        while(check){

            for(int i = 0 ; i <= 20; ++i){
                n++;

                if(n == 5)
                    continue;
                if (n%2 != 0) {
                    tab[i] = n;
                }
                if(n == 11)
                    break finish;

            }
            check = false;
        }

        for(int i = 0; i < tab.length; ++ i){
            System.out.print(tab[i] + " ");
        }
    }
}
