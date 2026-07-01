package datastructure;

public class TestStack {

    public static void main(String[] args) {

        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        System.out.println("Top Element: " + s.peek());

        System.out.println("Popped Element: " + s.pop());

        s.display();

        System.out.println("Is Stack Empty? " + s.isEmpty());

        System.out.println("Is Stack Full? " + s.isFull());

        s.push(50);
        s.push(60);

        s.display();

        s.push(70); 
    }
}