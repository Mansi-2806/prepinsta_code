public class automorphic_number {
    public static void main(String[] args) {
        int n=25;
        int temp=n;
        int square=n*n;
        int divisor=1;
        while(temp>0){
            divisor=divisor*10;
            temp=temp/10;
        }
        if(square%divisor==n){
            System.out.println("the number is automorphic  number ");
        }
        else{
            System.out.println("it is not a automorphic number ");
        }
    }
}
