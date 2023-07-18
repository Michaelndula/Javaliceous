package leapyear;
import java.util.Scanner;

public class leap_year {

    static boolean isLeapYear(int year){
        // check if year divisible by 400
        if(year % 400 == 0){
            return true;
        }

        // check if year is divisible by 4 and not 100
        if(year % 4 == 0 && year % 100 != 0){
            return true;
        }

        // else return false
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the year: ");
        int year = sc.nextInt();

        boolean isLeapYear = isLeapYear(year);

        if(isLeapYear){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not leap year");
        }

    }
}
