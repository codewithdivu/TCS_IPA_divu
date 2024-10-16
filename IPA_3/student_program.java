package IPA_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class student_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student[] students = new student[4];

        for (int i = 0; i < 4; i++) {
            students[i] = new student(sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextBoolean());
        }

        int count = findCountOfDayscholarStudents(students);
        if (count != 0) {
            System.out.println(count);
        } else {
            System.out.println("There are no such dayscholar students");
        }

        student secondHighest = findStudentwithSecondHighestScore(students);

        if (secondHighest != null) {
            System.out.println(
                    secondHighest.getRollNo() + "#" + secondHighest.getName() + "#" + secondHighest.getScore());

        } else {
            System.out.println("There are no student from non day scholar");
        }
    }

    public static int findCountOfDayscholarStudents(student[] arr) {
        int count = 0;
        for (student student : arr) {
            if (student.getScore() > 80 && student.getDayScholar()) {
                count++;
            }
        }
        return count;
    }

    public static student findStudentwithSecondHighestScore(student[] arr) {
        student[] filteredStudents = Arrays.stream(arr)
                .filter(student -> !student.getDayScholar())
                .sorted(Comparator.comparingDouble(student::getScore).reversed())
                .toArray(size -> new student[size]);

        if (filteredStudents.length >= 2) {
            return filteredStudents[1];
        }
        return null;
    }
}
