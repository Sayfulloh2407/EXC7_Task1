import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);
    private String Surname;
    private String FirstName;
    private String Street;
    private String ZipCode;
    private String City;

    public void Input()
    {
        System.out.println("Please enter your Surname:");
        Surname=String.valueOf(scanner.next());
        System.out.println("Please enter your FirstName:");
        FirstName= String.valueOf(scanner.next());
        System.out.println("Please enter your Street name:");
        Street= String.valueOf(scanner.next());
        System.out.println("Please enter your ZipCode:");
        ZipCode= String.valueOf(scanner.next());
        System.out.println("Please enter your City name:");
        City= String.valueOf(scanner.next());
    }
    public void Output()
    {
        System.out.println("Information about the Person"+"\nSurname: "+Surname+"\nFirstName: "+FirstName+"\nStreet :"+Street+"\nZipCode: "+ZipCode+"\nCity: "+City);
    }
}
