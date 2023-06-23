import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            String usr="user", pwd="admin";

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter Username: ");
            String iu=sc.next();

            System.out.println("Enter Password: ");
            String ip=sc.next();

            if(usr.equals(iu) && pwd.equals(ip)){

                System.out.println("Welcome");
            }

            else{
                System.out.println("Try Again");
            }

        }
    }
