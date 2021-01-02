import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args){
        String firstName;
        String lastName;
        System.out.print("ENTER YOUR NAME\n");
        System.out.print("First name: ");
        Scanner in = new Scanner(System.in);
        firstName = in.next();
        System.out.print("Last name: ");
        lastName = in.next();
        in.close();
        Email em1 = new Email(firstName,lastName);
        

    }


    
}
