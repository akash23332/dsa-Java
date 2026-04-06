package OOPS;

public class Polymorphism {
    public  static  class Dog{
        void speak(){
            System.out.println("bhau");
        }
    }
    public  static  class Cat{
        void speak(){
            System.out.println("meau");
        }
    }
    public  static  class Lion{
        void speak(){
            System.out.println("sher");
        }
    }

    public static void main(String[] args) {
       Dog tommy=new Dog();
       Cat bili=new Cat();
       Lion sheru=new Lion();
        tommy.speak();
        bili.speak();
        sheru.speak();
    }
}
