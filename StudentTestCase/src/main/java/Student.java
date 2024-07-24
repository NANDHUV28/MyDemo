
public class Student {
    String name;
    private double annualFee;
    private int[] marks;
    public Student(String name, double annualFee, int[] marks) {
        this.name = name;
        this.annualFee = annualFee;
        this.marks = marks;
    }

    public double getAnnualFee() {
        return annualFee;
    }
    public int getTotalMarks() {
        int totalMarks = 0;
        for (int mark: marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }
    public String getResults() {
        for (int mark : marks) {
            if(mark<60){
                return "Fail";
            }
        }
        return "Pass";
    }
    public double getAverageMarks() {
        int totalMarks = getTotalMarks();
        return (double) totalMarks/marks.length;
    }
}
