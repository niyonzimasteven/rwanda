public class hie1 {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Child1 child1Obj = new Child1();
        Child2 child2Obj = new Child2();
        Child3 child3Obj = new Child3();

        // Calling methods from the Parent and Child classes
        parentObj.parentMethod();
        child1Obj.parentMethod();
        child1Obj.child1Method();
        child2Obj.parentMethod();
        child2Obj.child2Method();
        child3Obj.parentMethod();
        child3Obj.child3Method();
    }
}
// Parent class
class Parent {
    void parentMethod() {
        System.out.println("This is a method from the Parent class.");
    }
}

// Child1 class, extends Parent
class Child1 extends Parent {
    void child1Method() {
        System.out.println("This is a method from Child1 class.");
    }
}

// Child2 class, extends Parent
class Child2 extends Parent {
    void child2Method() {
        System.out.println("This is a method from Child2 class.");
    }
}

// Child3 class, extends Parent
class Child3 extends Parent {
    void child3Method() {
        System.out.println("This is a method from Child3 class.");
    }
}

