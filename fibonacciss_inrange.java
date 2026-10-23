public class fibonacciss_inrange {
        public static void main(String[] args) {
            int n = 20;
            int n1 = 400;

            int a = 0;
            int b = 1;

            while( a <= n1 ) {
                if (a >= n) {
                    System.out.println(a);
                }

                int c = a + b;
                a = b;
                b = c;
            }
        }
    }

