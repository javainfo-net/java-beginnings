package net.javainfo.basics;

import java.math.BigInteger;

//Przykład zastosowania dużych liczb
public class BigNumber {

    public  static void main(String[] args){

        BigInteger n = new BigInteger("999999999999999999999999999999999999999999999999999999999999999999999");

        BigInteger k = n;

        System.out.printf("Liczba n: %s%n",n);
        System.out.printf("Liczba k: %s%n",n);

        n = n.add(BigInteger.valueOf(1));

        System.out.printf("Liczba n po dodaniu liczby 1: %s%n",n);

        n = n.subtract(BigInteger.valueOf(1));

        System.out.printf("Liczba n po odjęciu liczby 1: %s%n",n);

        if(n.compareTo(k) == 0)
            System.out.println("Liczby n i k są znowu równe.");
    }
}
