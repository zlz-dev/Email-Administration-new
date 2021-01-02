import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "sandi.com";
    private String email;

    //Constructor to receive the first name and last name
    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        //Call a method asking for the department,return the department
        this.department = setDepartment();
        

        //Call a method that return a random password
         this.password = randomPassword(defaultPasswordLength);
        

        //Combine elements to generate email
        if(department==""){
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() +"@" + companySuffix;
        }else{
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() +"@" + department +"." + companySuffix;
        }
        
        //Call a method that show infomation
        System.out.print(showInfo());
    }

    //Ask for the department
    private String setDepartment(){
        System.out.print("New worker: "+firstName+"\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        in.close();
        if (depChoice == 1){
            return "sales";
        }else if (depChoice == 2){
            return "dev";
        }else if (depChoice == 3){
            return "acct";
        }else{
            return "";
        }
    }

    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@$%";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    //Get the mailbox capacity
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //Get the alternate email
    public String getAlternateEmail(){
        return alternateEmail;
    }
    //Change the password
    public void changePassword(String password){
        this.password = password;
    }
    //Get the password
    public String getPassword(){
        return password;
    }
    
    //Show infomation
    public String showInfo(){
        if(department == ""){
            department = "free department";
        }
        return "DISPLAY NAME: "+firstName+" "+lastName+
        "\nDEPARTMENT: "+department+
        "\nCOMPANY EMAIL:  " +email+
        "\nPASSWORD: "+password+
        "\nMAILBOX CAPACITY: "+mailboxCapacity;
    }
    
}
