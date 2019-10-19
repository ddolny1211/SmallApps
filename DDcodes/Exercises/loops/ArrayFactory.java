package Exercises.loops;

public class ArrayFactory {

    private int argument;

    public ArrayFactory(int argument) {
        this.argument = argument;
    }

    public int[] oneDimension(){
        return new int[argument];
    }

    public int[][] twoDimensions(){
        return new int[argument][argument];
    }
}
