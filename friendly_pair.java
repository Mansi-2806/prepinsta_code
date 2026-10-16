public class friendly_pair {
    public static void main(String[] args) {
        int n = 6;
        int n1 = 28;
        int sum = 0;
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        int res = sum / n;
        for (int j = 1; j <= n1; j++) {
            if (n1 % j == 0) {
                sum1 = sum1 + j;
            }
        }
        int res1 = sum1 / n1;
        if(res==res1){
            System.out.println("it is friendly pair number");
        }
        else{
            System.out.println("it is a not friendly pair");
        }
    }
}
