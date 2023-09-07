import java.util.Scanner;
public class calci {
   char o;
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no. 1 : ");
    int x= sc.nextInt();
    System.out.println("Enter no. 2 : ");
    int y= sc.nextInt();
    System.out.println("Enter Operator : ");
    char o = sc.next().charAt(0);
    int a;
    switch(o){
        case'+':
         a=x+y;
        System.out.println("Sum is : "+a);
        break;
         case'-':
         a=x-y;
        System.out.println("Difference is : "+a);
        break;
         case'*':
         a=x*y;
        System.out.println("Product is : "+a);
        break;
         case'/':
         a=x/y;
        System.out.println("Quotient is : "+a);
        break;
    }
   } 
}
