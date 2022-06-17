package com.subcalc.data;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Calculato calc = new Calculato();
        int sum = calc.sum(5,6);
        int diff = calc.sub(8,4);
        int mul = calc.mul(4,5);
        int div = calc.div(20,10);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);

    }
}
