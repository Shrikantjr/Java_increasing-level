public class FibonacciSeries {
    
    public static void main(String []args) {

        int n1 = 0;
        int n2 = 1;

        int count = 10; //till 10 values

        System.out.print(n1 + " " + n2);

        for(int i =2; i<count; i++){
           int  n3= n1 + n2; // next num
            System.out.print(" " + n3);

            //swapping or initalize
            n1 = n2;
            n2 = n3;


        }
        
    }
}
