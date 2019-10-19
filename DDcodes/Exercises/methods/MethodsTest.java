package Exercises.methods;

public class MethodsTest {
    public static void main(String[] args) {

        SampleMethods sampleMethods = new SampleMethods();

        sampleMethods.getCurrentAge(24);
        sampleMethods.getName("Dawid");
        sampleMethods.addSubAndMultiply(5, 3);
        System.out.println(sampleMethods.isNumberEven(10));
        System.out.println(sampleMethods.isNumberAbleToDivide(15));
        System.out.println(sampleMethods.powerTo3(5));
        System.out.println(sampleMethods.sqrtOfArgument(4));
        System.out.println(sampleMethods.isTriangleRectangular(3,4,5));

    }
}
