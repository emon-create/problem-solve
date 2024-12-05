public class tailing {
    public static int tailin(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        //vertical (n-1)
        // horizontal (n-1)
        int frn = n-1;
        int frn1 = n-2;

        int result = frn + frn1;

        return result;
    }

    public static void main(String [] args){
        int n = 4;
        int m = tailin(n);
        System.out.println("Enter output: "+ m);
    }
}