public class swap {
    public static void main(String args[]){
        int a=45;
                int b=34;
                
                System.out.println("Value of a is " + a);
                System.out.println("Value of b is " + b);
        swap n= new swap();
        n.sswap(a,b);
    }
    
        public void sswap(int a,int b){
                int c;
                
                c=a;
                a=b;
                b=c;
                
                System.out.println("After swapping....");
                System.out.println("Value of a is " + a);
                System.out.println("Value of b is " + b);

        }
    
}
