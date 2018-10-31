package ModuleTemplatePattern;


import java.util.Arrays;

public class DuckSortTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 1),
                new Duck("Howard", 4),
                new Duck("Louie", 7),
                new Duck("Donald", 2),
                new Duck("Huey", 2)
        };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck: ducks
             ) {
            System.out.println(duck);
        }
    }
}
