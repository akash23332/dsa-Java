package OOPS;
class fraction{
    int num;
    int dem;
    fraction(int num,int dem){
            this.num=num;
            this.dem=dem;
    }
    void print(){
        System.out.println(num/dem);
    }
    void add(fraction f2){
         num+=f2.num;
        dem+=f2.dem;
    }

}
public class FractionClass {
    public static void main(String[] args) {
        fraction f1=new fraction(2, 2);
        fraction f2=new fraction(5, 2);
        f1.print();
        f1.add(f2);
    }

}
