package com.codekul.java.brushup.exceptionhandling;

/**
 * Created by aniruddha on 4/2/17.
 */
public class Coffee {

    private int formula;

    public void espresso(int sugar, int bean) throws Exception{
        formula = sugar/bean; // new ArithmeticException()
        if(formula <= 0) throw new BadCoffeeException(formula);
        System.out.printf("\n Ur Espresso is " + (formula > 2 ? "Good " : "bitter"));
    }

    public void cappuccino(int sugar, int bean, int milk) {
        try {
            formula = milk * (sugar / bean);  // throw new ArithmeticException
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            formula = 2;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.printf("\n Ur cappuccino is " + (formula > 2 ? "Good " : "bitter"));
    }
}
