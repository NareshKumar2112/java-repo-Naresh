package Day1;

import java.util.List;

public class LoopAndConditional {
    public static void main(String[] args) {

        int num1 = 10, num2 = 15;

        //conditional statements
        //if elseif else
        if (num1 > num2) {
            System.out.println("sum is greater");
        } else if (num1 == num2) {
            System.out.println("both are equal");
        } else {
            System.out.println("sum2 is greater");
        }

        //switch
        String brand = "apple";
        switch (brand) {
            case "apple":
                System.out.println("apple brand");
                break;
            case "vivo":
                System.out.println("vivo brand");
                break;
            default:
                System.out.println("no matching brand");
        }

        //looping statement
        //for loop
        for (int row = 1; row < 5; row++) {
            System.out.println(row);
        }

        //while loop
        int iteration = 1;
        while (true) {
            iteration++;
            if (iteration == 3) {
                continue;
            }
            if (iteration == 4) {
                break;
            }
            System.out.println(iteration);
        }

        //enhanced for loop
        String[] colors = {"blue", "orange"};
        for (String color : colors) {
            System.out.println(color);
        }

        //foreach loop
        List<String> brands = List.of("vivo", "apple");
        brands.forEach(System.out::println);

        //do-while loop
        iteration = 1;
        do {
            System.out.println(iteration);
            iteration++;
        } while (iteration < 5);

        //switch2
        String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        int randomValue = randomValueGenerator();
        System.out.println("random value is " + randomValue);
        switch (randomValue) {
            case 1, 2, 3, 4, 5, 6, 7 -> System.out.println(days[randomValue - 1]);

            default -> System.out.println("invalid value");
        }
    }

    static int randomValueGenerator() {
        return (int) (Math.random() * 7);
    }

}
