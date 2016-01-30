package com.ab.mycompany.my_calculator;

/**
 * Created by AayushB on 1/29/2016.
 */
public class InputNumbers {

    /*InputNumber will convert string inputs to double value we
      can work with*/

    private double number1;
    private double number2;

    public InputNumbers(){
        number1 = 0;
        number2= 0;
    }

    public void convertNumbers(String input1, String input2){
        number1 = Double.parseDouble(input1);
        number2 = Double.parseDouble(input2);
    }

    //returns double values

    public double getNumber1(){
        return number1;
    }
    public double getNumber2(){
        return number2;
    }
}
