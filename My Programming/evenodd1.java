public class evenodd1 {
    public void eveod(int a){
        if(a%2==0){
            System.out.println( a +  " is even"); 
          }
          else{
            System.out.println( a +  " is odd");
          }
    }
    public static void main(String[] args) {
        int x=23;
        int y=44;
        evenodd1 n=new evenodd1();
        n.eveod(x);
        n.eveod(y);

    }
}
