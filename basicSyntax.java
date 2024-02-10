import java.util.Scanner;



public class basicSyntax {
    public static void main(String args[])
    {
        String Username;
        String Password;

        Password = "123";
        Username = "wisdom";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter password : ");
        String password = input2.next();

        if(username.equals(Username) && password.equals(Password))
        {
            System.out.println("Access Granted! Welcome!");
        }

        else if(username.equals(Username)){
            System.out.println("Invalid Password!");

        } else if (username.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }



    }


}
