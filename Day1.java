class Father{
    public String initial ="Palla";
    public void NativePlace(){
        System.out.println("Velangi");
    }

}
class Daughter extends Father{
    private String name="Revathi";
    public static void main (String args[]){
        Daughter d1=new Daughter();
        d1.NativePlace();
        System.out.println(d1.NativePlace()+" "d1.name());


    }
}
//Polymorphism
class Animal{ //parent class
    public void animalSound(){
        System.out.println("Animal Sounds");
    }
}
class Dog extends Animal{   //extension of animal class i.e., child class
    public void animalSound(){
        System.out.println("Bow Bow");
    }
}
class Cat extends Animal{ //child class
    public void animalSound(){
        System.out.println("Meow Meow");
    }
}
public class Main{ //main class
    public static void main(String args[]){
        Animal a1=new Animal();
        Dog d1=new Dog();
        Cat c1=new Cat();
        System.out.println(d1.animalSound+" "+c1.animalSound);
    }
}
//InnerOuter classes in Java
class a{  //outer class
    int x=10;
    class b{ //inner class
        int y=5;
    }
}
public class main{
    a outer=new a(); //same as normal object creation
    a.b inner=outer.new b(); //the object was created by taking ref from outer class
    System.out.println(outer.x+inner.y);
}
