package ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);

            int arr[]={ 10,20,30};
            System.out.println(arr[0]);

            String str="123";
            System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array exception");

        }
        catch(ArithmeticException a){
            System.out.println("Airtmetic exception");
        }
        catch (Exception x){
            System.out.println("All type exceprion");
        }
    }
}
