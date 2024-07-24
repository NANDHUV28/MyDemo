import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Student1Test {

    private Student1 student1, student2, student3;

    @BeforeEach
    void setUp() {
        // Initialize student instances with different marks and fees
        student1 = new Student1("Nandhini", "Student One", 28, 70, 80, 90, 1000.0f, false);
        student2 = new Student1("Nandhuv", "Student Two", 12, 85, 90, 95, 800.0f, true);
        student3 = new Student1("Nands", "Student Three", 14, 60, 70, 80, 1200.0f, false);
    }

    @Test
    void testHighestTotalMarks() {
        // Assuming a static method findStudentWithHighestTotalMarks exists and returns a Student object
        Student1 highestMarksStudent = Student1.findStudentWithHighestTotalMarks(Arrays.asList(student1, student2, student3));
        assertEquals(student2, highestMarksStudent, "Student with the highest total marks should be Student Two");
    }

    @Test
    void testLeastMonthlyFee() {
        // Assuming a static method findStudentWithLeastMonthlyFee exists and returns a Student object
        Student1 leastFeeStudent = Student1.findStudentWithLeastMonthlyFee(Arrays.asList(student1, student2, student3));
        assertEquals(student2, leastFeeStudent, "Student with the least monthly fee should be Student Two");
    }

    @Test
    void testScholarshipEligibility() {
        // Assuming a method isEligibleForScholarship exists for each student instance
        student1.setEligibleForScholorship(student1.isEligibleForScholorship());
        student2.setEligibleForScholorship(student2.isEligibleForScholorship());
        student3.setEligibleForScholorship(student3.isEligibleForScholorship());

        assertTrue(student2.isEligibleForScholorship(), "Student Two should be eligible for a scholarship based on predefined criteria");
        assertFalse(student1.isEligibleForScholorship(), "Student One should not be eligible for a scholarship based on predefined criteria");
        assertFalse(student3.isEligibleForScholorship(), "Student Three should not be eligible for a scholarship based on predefined criteria");
    }
}