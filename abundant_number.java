public class abundant_number {
    public static void main(String[] args) {
        //  An Abundant Number is a number whose sum of its proper divisors is greater than the number itself.
        //Proper divisors are the numbers that divide a number exactly, excluding the number itself.//

        int n=12;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum>n){
            System.out.println("it is a abundant number");
        }
        else{
            System.out.println("it is not abundant number");
        }

    }
}

