
// Definition:
// The else-if statement checks multiple conditions one after another.
// The first condition that is true will be executed.

public class elseif_statement {
    public static void main(String[] args) {

        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A+");
        } 
        else if (marks >= 75) {
            System.out.println("Grade A");
        } 
        else if (marks >= 60) {
            System.out.println("Grade B");
        } 
        else {
            System.out.println("Grade C");
        }
    }
}