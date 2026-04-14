import java.util.HashMap;
import java.util.Map;

public class StudentMarksDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap (Student ID -> Student Marks)
        HashMap<Integer, Integer> studentMarks = new HashMap<>();

        // 2. Add student records using put()
        studentMarks.put(1001, 85);
        studentMarks.put(1002, 90);
        studentMarks.put(1003, 75);
        studentMarks.put(1004, 88);
        studentMarks.put(1005, 92);

        // 3. Display all student records
        System.out.println("--- Student Records ---");
        for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Marks: " + entry.getValue());
        }

        // 4. Get mark of one specific student
        System.out.println("\nMark of Student ID 1003: " + studentMarks.get(1003));

        // 5. Check if a student ID exists
        boolean exists = studentMarks.containsKey(1002);
        System.out.println("Does Student ID 1002 exist? " + exists);

        // 6. Update mark of one student using put()
        studentMarks.put(1003, 80);

        // 7. Display updated HashMap
        System.out.println("\n--- After Updating Marks ---");
        for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Marks: " + entry.getValue());
        }

        // 8. Remove one student record
        studentMarks.remove(1001);

        // 9. Display after removal
        System.out.println("\n--- After Removing Student 1001 ---");
        for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Marks: " + entry.getValue());
        }

        // 10. Display total number of students
        System.out.println("\nTotal Students Left: " + studentMarks.size());
    }
}