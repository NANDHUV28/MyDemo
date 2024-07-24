import java.util.List;

public class Student1 {
    String studentName;
    String city;
    int studentId;
    int marks1;
    int marks2;
    int marks3;
    float feePerMonth;
    boolean isEligibleForScholorship;

    public Student1(String studentName, String city, int studentId, int marks1, int marks2, int marks3, float fee,boolean isEligibleForScholorship) {
        this.studentName = studentName;
        this.city = city;
        this.studentId = studentId;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.feePerMonth = fee;
        this.isEligibleForScholorship = isEligibleForScholorship;
    }

    float getAnnualFee(){
        return feePerMonth*12;
    }
    int getTotalmarks(){
        return marks1+marks2+marks3;
    }
    double getAverage(){
        return (marks1+marks2+marks3/3);
    }
    String getResults(){
        String res="";
        if(marks1>60 && marks2>60 && marks3>60){
            res="pass";
        }
        else{
            res="fail";
        }
        return res;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public float getFeePerMonth() {
        return feePerMonth;
    }

    public void setFeePerMonth(float feePerMonth) {
        this.feePerMonth = feePerMonth;
    }

    public boolean isEligibleForScholorship() {
        return isEligibleForScholorship;
    }

    public void setEligibleForScholorship(boolean eligibleForScholorship) {
        isEligibleForScholorship = eligibleForScholorship;
    }

    public static Student1 findStudentWithHighestTotalMarks(List<Student1> students) {
        Student1 highestStudent = null;
        int highestMarks = Integer.MIN_VALUE;
        for (Student1 student : students) {
            int totalMarks = student.getTotalmarks();
            if (totalMarks > highestMarks) {
                highestMarks = totalMarks;
                highestStudent = student;
            }
        }
        return highestStudent;
    }

    public static Student1 findStudentWithLeastMonthlyFee(List<Student1> students) {
        Student1 leastFeeStudent = null;
        float leastFee = Float.MAX_VALUE;
        for (Student1 student : students) {
            float fee = student.getFeePerMonth();
            if (fee < leastFee) {
                leastFee = fee;
                leastFeeStudent = student;
            }
        }
        return leastFeeStudent;
    }
}
