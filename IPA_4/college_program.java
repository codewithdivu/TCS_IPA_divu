package IPA_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class college_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        college[] colleges = new college[4];

        for (int i = 0; i < 4; i++) {
            colleges[i] = new college(sc.nextInt(), sc.nextLine(), sc.nextInt(), sc.nextLine(), sc.nextInt());
        }

        String address = sc.nextLine();

        college clg = findCollegeWithMaximumPincode(colleges);

        if (clg != null) {
            System.out.println(clg.getName());
        } else {
            System.out.println("No college found with mentioned attribute");
        }

        college matchClg = searchCollegeByAddress(colleges, address);

        if (matchClg != null) {
            System.out.println(matchClg.getName());

        } else {

            System.out.println("No college found with mentioned attribute");
        }

    }

    public static college findCollegeWithMaximumPincode(college[] arr) {
        college[] filteredColleges = Arrays.stream(arr)
                .sorted(Comparator.comparingInt(college::getPincode).reversed())
                .toArray(size -> new college[size]);

        if (filteredColleges.length > 0) {
            // Return the first element, which will have the maximum pincode
            return filteredColleges[0];
        }
        return null;
    }

    public static college searchCollegeByAddress(college[] arr, String address) {

        for (college clg : arr) {
            if (clg.getAddress().equalsIgnoreCase(address)) {
                return clg;
            }
        }
        return null;
    }

}
