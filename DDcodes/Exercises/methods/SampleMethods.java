package Exercises.methods;

public class SampleMethods {

    //Method returning your current age
    public void getCurrentAge(int age) {
        System.out.println("You're " + age + " years old!");
    }

    //Method returning your name
    public void getName(String name){
        System.out.println("Hi "+name+"!");
    }

    //Method returning add, sub and multiply of two parameters
    public void addSubAndMultiply(double firstParam, double secondParam) {
        System.out.println(firstParam + " + " + secondParam + " = " + (firstParam + secondParam));
        System.out.println(firstParam + " - " + secondParam + " = " + (firstParam - secondParam));
        System.out.println(firstParam + " x " + secondParam + " = " + (firstParam * secondParam));
    }

    //Method checking if number is even
    public boolean isNumberEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }

    //Method checking if number is able to division by 3 and 5
    public boolean isNumberAbleToDivide(int number){
        if(number%3==0 && number%5==0){
            return true;
        }else{
            return false;
        }
    }
}
