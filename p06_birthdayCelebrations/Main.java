package p06_birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> citizens = new ArrayList<>();

        String[] input = scanner.nextLine().split(" ");
        while (!"End".equals(input[0])) {
            if (input[0].equals("Citizen")) {
                String name = input[1];
                String age = input[2];
                String id = input[3];
                String birthday = input[4];
                Person citizen = new Citizen(name, age, id, birthday);
                citizens.add(citizen);
            } else if (input[0].equals("Pet")) {
                String name = input[1];
                String birthday = input[2];
                Person pet = new Pet(name, birthday);
                citizens.add(pet);
            }

            input = scanner.nextLine().split(" ");
        }
        String year = scanner.nextLine();

        citizens.stream()
                .filter(x -> x.getBirthday().endsWith(year))
                .forEach(x -> System.out.println(x.getBirthday().toString()));
    }
}
