import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------------- 1. INPUT SCHOOL DETAILS ------------------------
        System.out.print("Enter School Name: ");
        String schoolName = sc.nextLine();

        System.out.print("Enter Teacher Name: ");
        String teacherName = sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        System.out.print("Enter Year: ");
        String year = sc.nextLine();

        // ---------------------- 2. INPUT STUDENT RECORDS -----------------------
        int n = 12; // at least 12 students
        String[] names = new String[n];
        double[] english = new double[n];
        double[] math = new double[n];
        double[] history = new double[n];
        double[] geo = new double[n];
        double[] science = new double[n];
        double[] prog = new double[n];
        double[] total = new double[n];
        char[] rank = new char[n];

        System.out.println("\nEnter details for " + n + " students:\n");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " Name: ");
            sc.nextLine(); 
            names[i] = sc.nextLine();

            System.out.print(" English: ");  english[i] = sc.nextDouble();
            System.out.print(" Math: ");     math[i] = sc.nextDouble();
            System.out.print(" History: ");  history[i] = sc.nextDouble();
            System.out.print(" Geography: ");geo[i] = sc.nextDouble();
            System.out.print(" Science: ");  science[i] = sc.nextDouble();
            System.out.print(" Programming: ");prog[i] = sc.nextDouble();
            System.out.println();
        }

        // ----------------- 3. COMPUTE TOTALS + RANKS --------------------------
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (int i = 0; i < n; i++) {
            total[i] = english[i] + math[i] + history[i] + geo[i] + science[i] + prog[i];

            if (total[i] >= 540) { rank[i] = 'A'; countA++; }
            else if (total[i] >= 480) { rank[i] = 'B'; countB++; }
            else if (total[i] >= 420) { rank[i] = 'C'; countC++; }
            else if (total[i] >= 360) { rank[i] = 'D'; countD++; }
            else { rank[i] = 'F'; countF++; }
        }

        // ------------------ 4. SUBJECT TOTALS & AVERAGES -----------------------
        double totalEng = 0, totalMath = 0, totalHist = 0, totalGeo = 0,
               totalSci = 0, totalProg = 0;

        for (int i = 0; i < n; i++) {
            totalEng += english[i];
            totalMath += math[i];
            totalHist += history[i];
            totalGeo += geo[i];
            totalSci += science[i];
            totalProg += prog[i];
        }

        double avgEng = totalEng / n;
        double avgMath = totalMath / n;
        double avgHist = totalHist / n;
        double avgGeo = totalGeo / n;
        double avgSci = totalSci / n;
        double avgProg = totalProg / n;

        // --------------------------- 5. OUTPUT REPORT --------------------------
        System.out.println("===========================================================================");
        System.out.println("                        School Name: " + schoolName);
        System.out.println("                        Teacher: " + teacherName);
        System.out.println("                        Grade: " + grade);
        System.out.println("                        Year: " + year);
        System.out.println("===========================================================================");
        System.out.printf("%-20s %-8s %-8s %-8s %-10s %-10s %-12s %-10s %-5s\n",
                "Student Name", "English","Math","History","Geography","Science","Programming","Total","Rank");
        System.out.println("=========================================================================== ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-8.2f %-8.2f %-8.2f %-10.2f %-10.2f %-12.2f %-10.2f %-5s\n",
                    names[i], english[i], math[i], history[i], geo[i], science[i],
                    prog[i], total[i], rank[i]);
        }

        System.out.println("=========================================================================== ");
        System.out.printf("%-20s %-8.2f %-8.2f %-8.2f %-10.2f %-10.2f %-12.2f\n",
                "Subject Totals:", totalEng, totalMath, totalHist, totalGeo, totalSci, totalProg);

        System.out.printf("%-20s %-8.2f %-8.2f %-8.2f %-10.2f %-10.2f %-12.2f\n",
                "Subject Averages:", avgEng, avgMath, avgHist, avgGeo, avgSci, avgProg);

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Ranks   A's: " + countA + "   B's: " + countB +
                           "   C's: " + countC + "   D's: " + countD +
                           "   F's: " + countF);
        System.out.println("---------------------------------------------------------------------------");
    }
}
