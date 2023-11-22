public class ml2 {
  public static void main(String[] args) {
    
    //Create an instance of MyClass
    MyClass myObj = new MyClass();
    
    //Call the action1 method
    myObj.action1();
    
    //Call the action2 method
    myObj.action2();
  }
}
interface InterfaceX {
  void action1();
}

interface InterfaceY {
  void action2();
}


class MyClass implements InterfaceX, InterfaceY {
  public void action1() {
    System.out.println("Executing action1 command...");
  }

  public void action2() {
    System.out.println("Executing action2 command...");
  }
}

