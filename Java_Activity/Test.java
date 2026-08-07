class Animal {
    void eat() {
        System.out.println("Animal is Eating....");
    }
}

class Dog extends Animal {
    void eat () {
        System.out.println("Dog is Eating....");
        super.eat();
    }
}

public class Test {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat();
    }
}
