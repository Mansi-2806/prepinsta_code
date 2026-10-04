public class primeno_inrange {
    public static void main(String[] args) {
        int n=10;
        int n1=20;
        for(int i=n;i<=n1;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println( i +" "+ "it is prime number");
            }
            else{
                System.out.println( i + " "+ "it is not");
            }

        }


    }
}
