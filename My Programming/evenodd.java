import java.util.Scanner;
public class evenodd {
    public static void main(String[]args){
        evenodd m = new evenodd();
        m.eveod();
    }
    public void eveod(){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number : ");
      int num = sc.nextInt();
      sc.close();
      if(num%2==0){
        System.out.println( num +  " is even"); 
      }
      else{
        System.out.println( num +  " is odd");
      }

    }    
}
