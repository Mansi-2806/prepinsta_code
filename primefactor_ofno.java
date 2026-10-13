public class primefactor_ofno {
    public static void main(String[] args) {
        int n=18;
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                while(n%i==0){
                    n=n/i;
                }
            }
        }

    }
}
