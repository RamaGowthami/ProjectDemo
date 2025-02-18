
/*Program to taking input as age in yyyy-MM-DD Format by using java.time.LocalDate class give output.*/
package TaskFive;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthdateToAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter birthdate (yyyy-MM-dd):");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
        LocalDate today = LocalDate.now();

        // Corrected Age Calculation
        Period age = Period.between(birthDate, today);

        System.out.println("your Age is: " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days.");

        scanner.close();
    }
}
/*Output:
 * Enter birthdate (yyyy-MM-dd): 1984-04-08
Age: 40 years 10 months 10 days.*/
