package com.oop.interface01;

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int soma = 1;

        for (int i = 2; i <= n; i++) {
            if ((n % i) == 0) {
                soma += i;
            }
        }

        return soma;
    }
}
