import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {
        Scanner filePathScanner = new Scanner(System.in);

        System.out.print("Enter directory path : ");
        String directoryPath = filePathScanner.nextLine();

        System.out.print("Enter Program Name (eg ChocolateMilk) : ");
        String filePath = filePathScanner.nextLine();

        directoryPath =  directoryPath.trim();

        FoodProcessorEnvironment foodProcessorEnvironment = new FoodProcessorEnvironment(directoryPath);
        foodProcessorEnvironment.run(filePath);
    }
}
