import java.util.Scanner;
public class IT22158840Lab9Q4 {
    
    public static void main (String []args) {

        String [][] information = new String [6][3];
        
        double assignmentMark,examMarks;
        information[0][0] = "Name";
        information[0][1] = "Final Mark";
        information[0][2] = "Grade";

        Scanner input = new Scanner(System.in);

        for (int i=0;i<5;i++)
        {
            System.out.print("Enter Name of Student "+(i+1)+": ");
            information[i][0] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for "+information[i][0]+": ");
            assignmentMark = input.nextDouble();

            if (assignmentMark<0 || assignmentMark>100)
            {
                System.out.println("Please enter the valid Assignment Mark.");
            }

            System.out.print("Enter Exam paper Mark (out of 100) for "+information[i][0]+": ");
            examMarks = input.nextDouble();

            if (examMarks<0 ||examMarks>100)
            {
                System.out.println ("Please enter the valid Exam Mark.");
            }

            double finalmark = calcFinalmark(assignmentMark, examMarks);
            information [i][1] = String.valueOf(finalmark);
            information [i][2] = String.valueOf(findGrades(finalmark));

            System.out.println();

        }
        printDetails(information);
    }
    public static double calcFinalmark(double assignmentMark,double examMarks)
    {
        return assignmentMark*0.3 + examMarks*0.7;
    }
    public static char findGrades (double finalmark)
    {
        if (finalmark >= 75)
        {
            return 'A';
        }
        else if (finalmark >=60)
        {
            return 'B';
        }
        else if (finalmark>=50)
        {
            return 'C';
        }
        else 
        {
            return 'F';
        }
    }
    
    public static void printDetails(String[][] array)
    {
        System.out.println("Name \t                Final Mark \t        Grade");
        for (int i=0;i<=4;i++)
        {
            for (int j=0;j<=2;j++)
            {
                
                System.out.print(array [i][j] + "\t\t\t");
            }
            System.out.println();
        }
    }
}