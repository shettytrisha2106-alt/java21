class Animal2 {
    void eat() {
        System.out.println("Animal eating...");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog barking...");
    }
}

class babyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

class TestInheritance2 {
    public static void main(String args[]) {
        babyDog     d = new babyDog();

        d.bark();
        d.weep();
        d.eat();
    }
}