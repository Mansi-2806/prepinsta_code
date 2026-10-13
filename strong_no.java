public class strong_no {
    public static void main(String[] args) {
        int n = 145;
        int original = n;
        int digit = 0;
        int sum=0;
        while (n != 0) {
            digit = n % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum=sum+fact;
            n=n/10;

        }
        if(sum==original){
            System.out.println("it is a strong number");
        }
        else{
            System.out.println("it is not a strong number");
        }
    }
}
