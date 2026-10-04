public class palidrome_no {

        public static void main(String[] args) {
            int n = 232;
            int original = n;
            int rev = 0;
            while (n != 0) {
                rev = rev * 10 + n % 10;
                n = n / 10;

            }
            if (original == rev) {
                System.out.println("it is a palidrome");
            }
            else{
                System.out.println("it is not");
            }
        }
    }


