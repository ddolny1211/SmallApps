package Exercises.loops;

public class Loop {

    public void printFromZeroToArgument(int param) {
        for (int i = 0; i <= param; i++) {
            System.out.println(i);
        }
    }

    public void printFromZero(int param){
        int iterator = 0;
        while(iterator<=param){
            System.out.println(iterator);
            iterator++;
        }
    }
}
