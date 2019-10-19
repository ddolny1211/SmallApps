package Exercises.objects;

public class ObjectTestClass {

    public static void main(String[] args) {

        Human human = new Human(24, 86, 178, "David", "Male");

        Rectangle rectangle = new Rectangle(10,15);

        System.out.println(rectangle.getField());
        System.out.println(rectangle.getCircuit());
    }

}
