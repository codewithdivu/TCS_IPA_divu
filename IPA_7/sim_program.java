package IPA_7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sim_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sim[] sims = new sim[5];

        for (int i = 0; i < 5; i++) {
            sims[i] = new sim(sc.nextInt(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextLine());
        }

        String circle1 = sc.nextLine();
        String cirlce2 = sc.nextLine();

        sim[] arr = transferCustomerCircle(sims, circle1, cirlce2);

        if (arr.length > 0) {
            for (sim sim : arr) {
                System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " "
                        + sim.getRatePerSecond());

            }
        }

    }

    public static sim[] transferCustomerCircle(sim[] arr, String circle1, String circle2) {

        for (sim sim : arr) {
            if (sim.getCircle().equalsIgnoreCase(circle1)) {
                sim.setCircle(circle2);
            }
        }

        sim[] filteredSims = Arrays.stream(arr)
                .filter(sim -> sim.getCircle().equalsIgnoreCase(circle2))
                .sorted(Comparator.comparingDouble(sim::getRatePerSecond).reversed())
                .toArray(size -> new sim[size]);

        return filteredSims;
    }
}