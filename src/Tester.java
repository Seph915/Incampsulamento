import java.util.Arrays;
import java.util.Scanner;


public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house1 = new House();

        house1.setFloorNumbers(scanner.nextInt());
        scanner.nextLine();
        house1.setAddress(scanner.nextLine());

        String residents = scanner.nextLine();
        String[] residentsName = residents.split(",");
        house1.setResidentsName(residentsName);

        String house1Details = String.format("House1Details: floors: %d, address: %s, residents: %s", house1.getFloorNumbers(),
                house1.getAddress(), Arrays.toString(house1.getResidentsName()));

        System.out.println(house1Details);
    }
}
