package IPA_5;

import java.util.Scanner;

public class motel_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        motel[] motels = new motel[5];

        for (int i = 0; i < 5; i++) {
            motels[i] = new motel(sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLine(),
                    sc.nextDouble());
        }

        String cabFacility = sc.nextLine();

        int count = totalNoOfRoomsBooked(motels, cabFacility);

        if (count != 0) {
            System.out.println(count);
        } else {
            System.out.println("No such rooms booked");
        }

    }

    public static int totalNoOfRoomsBooked(motel[] arr, String cabFacility) {
        int count = 0;

        for (motel motel : arr) {
            if (motel.getCabFacility().equalsIgnoreCase(cabFacility) && motel.getNoOfBookedRooms() > 5) {
                count += motel.getNoOfBookedRooms();
            }
        }

        return count;
    }
}
