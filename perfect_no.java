public class perfect_no {
    public static void main(String[] args) {
        int n=28;
        int original=n;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(sum==original){
            System.out.println("it is perfect  number");
        }
        else{
            System.out.println("it is not a perfect number ");
        }
    }
}
