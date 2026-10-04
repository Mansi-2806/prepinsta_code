public class armstrong_no {
    public static void main(String[] args) {
        int n=153;
        int original=n;
        int count=0;
        int arm=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
       n=original;
       while(n!=0){
           int digit=n%10;
           arm=arm+ (int) Math.pow(digit,count);
           n=n/10;
       }
       if(original==arm){
           System.out.println("it is a  arm strong number");
       }
       else{
           System.out.println("it is not a arms strong number");

       }
    }
}
