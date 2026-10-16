public class harshad_number {
    //a number is called as the harshad number only when it is  dividible by its sum of its own digits//
    public static void main(String[] args) {
        int n=18;
        int sum=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        }
        if(n%sum==0){
            System.out.println("it is a harshad number");
        }
        else{
            System.out.println("it is not a harsad number");
        }
    }

}
