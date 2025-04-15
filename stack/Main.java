package stack;

public class Main {
    public static void main(String[] args) {
        Stack s1 = new Stack(5);

        double[] values = { 10.1, 20.1, 30.1, 40.1, 50.1 };

        for (int i = 0; i <= 4; i++) {
            s1.push(values[i]);
        }

        System.out.println(s1.peek());
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.peek());
    }
}
