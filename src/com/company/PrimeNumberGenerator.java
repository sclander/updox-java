package com.company;

import java.util.List;

/**
 * Created by stephen on 6/30/15.
 */
public interface PrimeNumberGenerator {

    List<Integer> generate(int startingValue, int endingValue);
    boolean isPrime(int value);

}
