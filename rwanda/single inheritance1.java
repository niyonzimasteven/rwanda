class single inheritance1 {
  public static void main(String[] args) {

    // create an object of the subclass
    man labrador = new man();

    // access field of superclass
    labrador.name = "gati";
    labrador.display();

    // call method of superclass
    // using object of subclass
    labrador.eat();

  }
}
Class PetAnimal {

  // field and method of the parent class
  String name;
  public void eat() {
    System.out.println("I can not eat");
  }
}

// inherit from PetAnimal
class man extends PetAnimal {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}

