import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Age{
    int calculateAge(String birthDate , String currentDate)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate birth = LocalDate.parse(birthDate , formatter); 
        LocalDate current = LocalDate.parse(currentDate , formatter); 

        int age = current.getYear() - birth.getYear();

        return age;
    }
}

public class Dates
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String birthDate = scanner.nextLine();
        String currentDate = scanner.nextLine();

        Age a = new Age();
        int age = a.calculateAge(birthDate , currentDate);
        System.out.println(age);

        scanner.close();
    }
}