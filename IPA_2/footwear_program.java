package IPA_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class footwear_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        footwear[] ft = new footwear[5];

        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();

            ft[i] = new footwear(a, b, c, d);
        }

        String ftType = sc.nextLine();
        String ftName = sc.nextLine();

        int count = getCountByType(ft, ftType);
        if (count != 0) {
            System.out.println(count);
        } else {
            System.out.println("Footwear not available");
        }

        footwear obj = getSecondHighestPriceByBrand(ft, ftName);
        if (obj != null) {
            System.out.println(obj.getFootWearId());
            System.out.println(obj.getFootWearName());
            System.out.println(obj.getFootWearType());
            System.out.println(obj.getFootWearPrice());
        } else {
            System.out.println("Brand not available");
        }
    }

    public static int getCountByType(footwear[] arr, String type) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getFootWearType().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }

    public static footwear getSecondHighestPriceByBrand(footwear[] arr, String name) {
        // footwear[] filteredByBrand = Arrays.stream(arr)
        // .filter(footwear -> footwear.getFootWearName().equalsIgnoreCase(name))
        // .sorted(Comparator.comparingInt(footwear::getFootWearPrice).reversed())
        // .toArray(footwear[]::new);

        footwear[] filteredByBrand = Arrays.stream(arr)
                .filter(footwear -> footwear.getFootWearName().equalsIgnoreCase(name))
                .sorted(Comparator.comparingInt(footwear -> footwear.getFootWearPrice()).reversed())
                .toArray(size -> new footwear[size]);

        // If less than two footwears are available for the brand, return null
        if (filteredByBrand.length < 2) {
            return null;
        } else {
            return filteredByBrand[1]; // Return the second highest priced footwear
        }
    }

}
