import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[World Traveler Checklist] Have you been to Africa?");
        char africa = scanner.next().charAt(0);

        System.out.println("Have you been to Antarctica?");
        char antarctica = scanner.next().charAt(0);

        System.out.println("Have you been to Asia?");
        char asia = scanner.next().charAt(0);

        System.out.println("Have you been to Australia?");
        char australia = scanner.next().charAt(0);

        System.out.println("Have you been to Europe?");
        char europe = scanner.next().charAt(0);

        System.out.println("Have you been to North America?");
        char northAmerica = scanner.next().charAt(0);

        System.out.println("Have you been to South America?");
        char southAmerica = scanner.next().charAt(0);

        int continentsVisited = 0;

        if (africa == 'Y' || africa == 'y') {
            continentsVisited++;
        }

        if (antarctica == 'Y' || antarctica == 'y') {
            continentsVisited++;
        }

        if (asia == 'Y' || asia == 'y') {
            continentsVisited++;
        }

        if (australia == 'Y' || australia == 'y') {
            continentsVisited++;
        }

        if (europe == 'Y' || europe == 'y') {
            continentsVisited++;
        }

        if (northAmerica == 'Y' || northAmerica == 'y') {
            continentsVisited++;
        }

        if (southAmerica == 'Y' || southAmerica == 'y') {
            continentsVisited++;
        }

        System.out.println("You have visited " + continentsVisited + " continents:");

        switch (continentsVisited) {
            case 0:
                System.out.println("How is that possible? Are you having in space?");
                break;
            case 1:
                System.out.println("That's a good start. Time to explore the world!");
                break;

            case 2:
                System.out.print("You can do it");
            case 3:
                System.out.println("You've just started your journey to see the world.");
                break;
            case 4:
            case 5:
                System.out.println("You are an experienced traveler now.");
                break;
            case 6:
                System.out.println("Wow, you have been almost everywhere!");
                break;
            default:
                System.out.println("You are a true world traveler!");
                break;
        }

        scanner.close();
    }
}

