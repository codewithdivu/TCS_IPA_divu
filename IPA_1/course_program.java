package IPA_1;

import java.util.Arrays;
import java.util.Scanner;

public class course_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        course[] arr = new course[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            int quiz = sc.nextInt();
            int handson = sc.nextInt();
            String name = sc.nextLine();
            String admin = sc.nextLine();

            arr[i] = new course(id, quiz, handson, name, admin);
        }

        String admin = sc.nextLine();
        int handson = sc.nextInt();

        int avg = findAvgOfQuizByAdmin(arr, admin);

        if (avg != 0) {
            System.out.println(avg);
        } else {
            System.out.println("No Course Found");
        }

        course[] courses = sortCourseByHandsOn(arr, handson);

        if (courses != null) {
            for (int i = 0; i < courses.length; i++) {
                System.out.println(courses[i].getCourseName());
            }
        } else {
            System.out.println("No Course found with mentioned attribute.");
        }

    }

    public static int findAvgOfQuizByAdmin(course[] courses, String str) {
        int count = 0, sum = 0;

        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getCourseAdmin().equalsIgnoreCase(str)) {
                count++;
                sum = sum + courses[i].getQuiz();
            }
        }

        if (count > 0) {
            return sum / count;
        }
        return 0;
    }

    public static course[] sortCourseByHandsOn(course[] courses, int handson) {
        course[] arr = new course[0];

        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getHandson() < handson) {
                arr = Arrays.copyOf(arr, arr.length + 1); // Resize the array to add one more element
                arr[arr.length - 1] = courses[i];

            }
        }

        course val;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getHandson() > arr[j].getHandson()) {
                    val = arr[i];
                    arr[i] = arr[j];
                    arr[j] = val;
                }
            }
        }

        if (arr.length > 0) {
            return arr;
        }
        return null;
    }
}
