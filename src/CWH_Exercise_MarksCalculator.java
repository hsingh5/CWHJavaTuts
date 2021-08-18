import java.sql.SQLOutput;
import java.util.Scanner;
public class CWH_Exercise_MarksCalculator {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);

        System.out.println("Enter marks in Maths:");
        float marks_in_Maths=marks.nextFloat();
        System.out.println("Enter marks in English:");
        float marks_in_English=marks.nextFloat();
        System.out.println("Enter marks in Science:");
        float marks_in_Science=marks.nextFloat();
        System.out.println("Enter marks in Social Science:");
        float marks_in_SocialScience=marks.nextFloat();
        System.out.println("Enter marks in Hindi:");
        float marks_in_Hindi=marks.nextFloat();
        float TotalMarks=marks_in_English+marks_in_Hindi+marks_in_Maths+marks_in_Science+marks_in_SocialScience;
        float percentage=(TotalMarks*100)/500;
        System.out.println("Total Marks are " + TotalMarks);
        System.out.println("Percentage is "+ percentage+"%");

    }
}
