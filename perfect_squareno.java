public class perfect_squareno {
    public static void main(String[] args) {
        int n=5;
        boolean found=false;
        for(int i=1;i<=n;i++){
            if(i*i==n) {
                System.out.println("it is a perfect squre" + "   " + i * i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("it is not a perfcet square number");
        }
    }
}
