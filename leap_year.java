public class leap_year {
    public static void main(String[] args) {
        float year=2019;
        if((year%400==0) || (year%4==0 && year%100!=0)){
            System.out.println("it is a leap year");

        }
        else{
            System.out.println("not a leap year");
        }
    }
}
