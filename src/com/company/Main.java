package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main implements PrimeNumberGenerator {

    List<Integer> primes = new ArrayList<Integer>();
    List<Integer> printPrimes = new ArrayList<Integer>();

    public static void main(String[] args) {
        Main generator = new Main();

        List<Integer> generatedPrimes = generator.generate(7920, 7900);
        System.out.println(generatedPrimes.toString());
    }

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        if (startingValue > endingValue) {
            int temp = startingValue;
            startingValue = endingValue;
            endingValue = temp;
        }
        for (int i = 2; i <= endingValue; i++) {
            if (isPrime(i)) {
                primes.add(i);
                if (i >= startingValue && i<= endingValue) {
                    printPrimes.add(i);
                }
            }
        }
        return printPrimes;
    }

    @Override
    public boolean isPrime(int value) {
        for (int i = 0; i < primes.size(); i++) {
            if ( value % primes.get(i) == 0) {
                return false;
            }
        }
        return true;
    }
}
