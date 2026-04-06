package OOPS;

public class PassingClassesToMethods {
public static class Car{
    int seats;
    String name;
    double length;
    String type;
    int torque;

    void print(){
        System.out.println(seats);
        System.out.println(length);
        System.out.println(torque);

    }

}

    public static void main(String[] args) {
    Car c1=new Car();
    c1.seats=5;
    c1.length=7;
    c1.torque=190;
    c1.name="alto";
    c1.type="suv";
//    Change(c1);
//        System.out.println(c1.seats);
        c1.print();

    }

    public static void Change(Car c1){
    c1.seats=4;

    }
}
