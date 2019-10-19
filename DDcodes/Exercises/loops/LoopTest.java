package Exercises.loops;

public class LoopTest {
    public static void main(String[] args) {

        Loop loop = new Loop();
        ArrayFactory arrayFactory = new ArrayFactory(5);

        loop.printFromZeroToArgument(10);
        loop.printFromZero(10);


        int[] oneDimTable = arrayFactory.oneDimension();
        int[][] twoDimTable = arrayFactory.twoDimensions();

    }
}
