package ru.itmo.java.basics.lab2.lab2_1;

public class Calculator {

    public static int addition(int term1, int term2 ){
        return term1 + term2;
    }
    public static long addition(long term1, long term2 ){
        return term1 + term2;
    }

    public static double addition(double term1, double term2 ){
        return term1 + term2;
    }
    //-----------------------------------------------------------
    public static double division(int dividend, int divisor ){
        return (double) dividend / divisor;
    }
    public static double division(long dividend, long divisor ){
        return (double) dividend / divisor;
    }
    public static double division(double dividend, double divisor){
        return dividend / divisor;
    }
    //--------------------------------------------------------
    public static int subtraction(int minuend, int subtrahend ){
        return minuend - subtrahend;
    }
    public static long subtraction(long minuend, long subtrahend ){
        return minuend - subtrahend;
    }

    public static double subtraction(double minuend, double subtrahend ){
        return minuend - subtrahend;
    }
    //--------------------------------------------------------------------
    public static int multiplication(int factor1, int factor2 ){
        return factor1 * factor2;
    }

    public static long multiplication(long factor1, long factor2 ){
        return  factor1 * factor2;
    }

    public static double multiplication(double factor1, double factor2 ){
        return factor1 * factor2;
    }


}
