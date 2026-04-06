package OOPS;

class ComplexNumber {
    int x;
    int y;

    ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;

    }
    void print(){
        if(y<0){
            System.out.println(x + "-" + (-y)+ "i");
        }
        else{
            System.out.println(x + "+" + "i" + y);

        }
    }
    void add(ComplexNumber z2){
        x=x+z2.x;
        y=y+z2.y;

    }
    void Mul(ComplexNumber z2){
        x=(x*z2.x)-(y*z2.y);
        y=(x*z2.y)+(y*z2.x);

    }
}

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1=new ComplexNumber(4,5);
        ComplexNumber z2=new ComplexNumber(4,5);
        z1.add(z2);
        z1.Mul(z2);
        z1.print();


    }
    }


