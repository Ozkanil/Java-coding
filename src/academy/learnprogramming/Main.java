package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Plese enter your name and surname");
        String nameSurname = scan.nextLine();
        String trimmedNameSurname = nameSurname.trim();
        if (!trimmedNameSurname.contains(" ")) {
            System.out.println("Please put a space between your name and surname");
        } else {
            String firstLetter = trimmedNameSurname.substring(0,1).toUpperCase();
            String upName= firstLetter+(trimmedNameSurname.substring(1, trimmedNameSurname.indexOf(" "))).toLowerCase();
            String firstLetterSurname = trimmedNameSurname.substring(trimmedNameSurname.indexOf(" ")+1,trimmedNameSurname.indexOf(" ") + 2).toUpperCase();
            String upSurname= firstLetterSurname+ (trimmedNameSurname.substring(trimmedNameSurname.indexOf(" ")+2)).toLowerCase();
            System.out.println("Please enter your social security number");
            String socialSecurity= scan.next();
            String lastFourDigits= socialSecurity.substring(5);
            String firstFiveDigits= "*****";
            String newsocialsec= firstFiveDigits+lastFourDigits;
            System.out.print(upName +" "+ upSurname+" "+ newsocialsec);

        }
    }
}
