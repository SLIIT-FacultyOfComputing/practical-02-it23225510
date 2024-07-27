import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //part1
        System.out.println("Enter your first name: ");
        String firstname = scanner.nextLine();
        System.out.println("Enter your middle name: ");
        String middlename = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastname = scanner.nextLine();
        
        String fullname1 = firstname + " " + middlename + " " +lastname;
        String replacedfullname1 = fullname1.replace("a", "@").replace("e", "3"); //part3
        String upperCasefullname1 = replacedfullname1.toUpperCase();
        System.out.printf("Full name is %s\n", fullname1);
        System.out.printf("Modified Full name is %s\n", upperCasefullname1);
        
        //part6
        int count1 = 0;
        String lowerCasefullname1 = fullname1.toLowerCase();
        for ( int i = 0; i < lowerCasefullname1.length(); i++) {
            if ( lowerCasefullname1.charAt(i) == 'a' || lowerCasefullname1.charAt(i) == 'e' || lowerCasefullname1.charAt(i) == 'i' || lowerCasefullname1.charAt(i) == 'o' || lowerCasefullname1.charAt(i) == 'u' ) {
                count1++;
            }
        }
        System.out.println("Total number of vowels in concatenated full name is: \n" +count1);
        
        //part4
        String[] splittedfullname1 = fullname1.split(", ");
        for (String a : splittedfullname1) {
            System.out.println(a);
            System.out.println("\n");
        }
        
        //part2
        System.out.println("Enter your first name: ");
        String Firstname = scanner.nextLine();
        System.out.println("Enter your middle name: ");
        String Middlename = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String Lastname = scanner.nextLine();
        
        String fullname2 = Firstname + " " + Middlename + " " +Lastname;
        String replacedfullname2 = fullname2.replace("a", "@").replace("e", "3"); //part3
        String upperCasefullname2 = replacedfullname2.toUpperCase();
        System.out.printf("Full name is %s\n", fullname2);
        System.out.printf("ModifiedFull name is %s\n", upperCasefullname2);
        
        //part6
        int count2 = 0;
        String lowerCasefullname2 = fullname2.toLowerCase();
        for ( int i = 0; i < lowerCasefullname2.length(); i++) {
            if ( lowerCasefullname2.charAt(i) == 'a' || lowerCasefullname2.charAt(i) == 'e' || lowerCasefullname2.charAt(i) == 'i' || lowerCasefullname2.charAt(i) == 'o' || lowerCasefullname2.charAt(i) == 'u' ) {
                count2++;
            }
        }
        System.out.println("Total number of vowels in concatenated full name is: \n" +count2);
        
        //part4
        String[] splittedfullname2 = fullname2.split(",");
        for (String b : splittedfullname2) {
            System.out.println(b);
            System.out.println("\n");
        }
        
        if( fullname1.equalsIgnoreCase(fullname2)){
            System.out.println("Both the names are equal\n");
            //part5
            System.out.println("Now enter a string with leading and trailing spaces....\n");
            String str = scanner.nextLine();
            String trimmedStr = str.trim();
            System.out.printf("Trimmed String is %s", trimmedStr);
        }
        else{
            System.out.println("Names are different");
        }
    }
}
