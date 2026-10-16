public class automorphic_number {
    public static void main(String[] args) {
        int n=25;
      boolean found=false;
        for(int i=1;i<=n;i++){
            int s=i*i;
            int digit=s%10;
            if(digit==n){
                System.out.println("it is a automrphic number");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("it is not a automrphic number");
        }
    }
}
