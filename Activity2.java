import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many students in the class? ");
        int num = scanner.nextInt();

        int[] studentID = new int[num];
        int[] Chemistry = new int[num];
        int[] Physics = new int[num];
        int[] Maths = new int[num];
        
        int totalChem = 0;
        int totalPhy = 0;
        int totalMath = 0;
        
        for (int i = 0; i < num; i++) {
            
            System.out.println("\n");
            
            System.out.println("Enter student id number: ");
            studentID[i] = scanner.nextInt();
            
            System.out.println("\n");
            
            System.out.println("Enter marks for Chemistry: ");
            Chemistry[i] = scanner.nextInt();
            totalChem += Chemistry[i];
            
            System.out.println("Enter marks for Physics: ");
            Physics[i] = scanner.nextInt();
            totalPhy += Physics[i];
            
            System.out.println("Enter marks for Maths: ");
            Maths[i] = scanner.nextInt();
            totalMath += Maths[i];
        }
        
        double avgChem = (double) totalChem/num;
        double avgPhy = (double) totalPhy/num;
        double avgMath = (double) totalMath/num;
        
        System.out.println("\nAverage marks for Chemistry: " +avgChem);
        System.out.println("Average marks for Physics: " +avgPhy);
        System.out.println("Average marks for Maths: " +avgMath);
        
        
        System.out.println("\nEnter student id to check marks: ");
        int checkID = scanner.nextInt();
       
        for (int i = 0; i < num; i++){
            if( studentID[i] == checkID) {
                int totalMarks = Chemistry[i] + Physics[i] + Maths[i];
                double studentAVG = (double) totalMarks/3;
                
                System.out.println("\n");
                System.out.println("Chemistry: "+Chemistry[i]);
                if (Chemistry[i] >= 90) {
                    System.out.println("Grade: A");
                }
                else if (Chemistry[i] >= 80) {
                    System.out.println("Grade: B");
                }
                else if (Chemistry[i] >= 70) {
                    System.out.println("Grade: C");
                }
                else if (Chemistry[i] >= 70) {
                    System.out.println("Grade: C");
                }
                else if (Chemistry[i] >= 60) {
                    System.out.println("Grade: D");
                }
                else{
                    System.out.println("Grade: Fail");
                }
                
                System.out.println("Physics: "+Physics[i]);
                if (Physics[i] >= 90) {
                    System.out.println("Grade: A");
                }
                else if (Physics[i] >= 80) {
                    System.out.println("Grade: B");
                }
                else if (Physics[i] >= 70) {
                    System.out.println("Grade: C");
                }
                else if (Physics[i] >= 70) {
                    System.out.println("Grade: C");
                }
                else if (Physics[i] >= 60) {
                    System.out.println("Grade: D");
                }
                else{
                    System.out.println("Grade: Fail");
                }
                
                System.out.println("Maths: "+Maths[i]);
                if (Maths[i] >= 90) {
                    System.out.println("Grade: A");
                }
                else if (Maths[i] >= 80) {
                    System.out.println("Grade: B");
                }
                else if (Maths[i] >= 70) {
                    System.out.println("Grade: C");
                }
                else if (Maths[i] >= 70) {
                    System.out.println("Grade: C");
                }
                else if (Maths[i] >= 60) {
                    System.out.println("Grade: D");
                }
                else{
                    System.out.println("Grade: Fail");
                }
                
                System.out.println("Average Marks: "+studentAVG);
                break;
            }
        }
    }
}
