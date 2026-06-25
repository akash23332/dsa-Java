package OOPS;
class fraction{
    int num;
    int dem;
    fraction(int num,int dem){
            this.num=num;
            this.dem=dem;
            simplify();
    }
    void print(){
        System.out.println(num/dem);
    }
    void add(fraction f2){
         num=num*f2.dem+dem*f2.num;
        dem=dem*f2.dem;
        simplify();

    }
    void divide(fraction f2){
        num=num*f2.dem;
        dem=dem*f2.num;
        simplify();
    }
    void multiply(fraction f2){
        num=num*f2.num;
        dem=dem*f2.dem;
        simplify();

    }
    void simplify(){
        int gcd=hcf(num,dem);
        int NewNum=num/gcd;
        int NewDem=dem/gcd;


    }

int hcf(int a,int b){
        if(a==0) return b;
        return hcf(b%a,a);
}
}
public class FractionClass {
    public static void main(String[] args) {
        fraction f1=new fraction(2, 2);
        fraction f2=new fraction(5, 2);

        f1.add(f2);
        f1.print();
    }

}
