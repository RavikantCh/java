package lambdaExpression;
public class LambdaExample {

    /*
     * Lambda expression is an anonymous function.
     * Anonymous function: A method which doesn't have name, modifier or return type.
     * Functional Interface: The interface contains only one abstract method but
     * can have multiple default and static method.
     * e.g. Runnable -> run()
     * Callable -> call()
     * Comparable -> compareTo()
     * Comparator -> compare()
     */

    public static void main(String[] args) {
        Calculator calculator = () -> System.out.println("Switch on");
        calculator.switchOn();

        Interface1 interface1 = s ->  s.length();
        System.out.println(interface1.getLength("Hello"));
        System.out.println(interface1.getLength("World"));
    }

}

interface Calculator {
    void switchOn();
}

interface Interface1 {
    public int getLength(String str);
}