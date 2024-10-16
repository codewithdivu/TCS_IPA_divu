package IPA_6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class rrt_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rrt[] arr = new rrt[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = new rrt(sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLine());
        }

        String project = sc.nextLine();

        rrt babu = getHighestPriorityTicket(arr, project);

        if (babu != null) {
            System.out.println(babu.getTicketNo());
            System.out.println(babu.getRaisedBy());
            System.out.println(babu.getAssignedTo());
            System.out.println(babu.getPriority());
            System.out.println(babu.getProject());
        } else {
            System.out.println("No such Ticket");
        }

    }

    public static rrt getHighestPriorityTicket(rrt[] arr, String project) {
        rrt[] filteredRRT = Arrays.stream(arr)
                .filter(rrt -> rrt.getProject().equalsIgnoreCase(project))
                .sorted(Comparator.comparingInt(rrt::getPriority))
                .toArray(size -> new rrt[size]);

        if (filteredRRT.length > 0) {
            return filteredRRT[0];
        }
        return null;
    }
}
