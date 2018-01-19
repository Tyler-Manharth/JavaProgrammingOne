package Chapter4;

//Tyler Bynum
import java.util.Scanner;

/**
 * Program returns with a display of the major and level to the console
 *
 * @author Tyler Bynum
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters:");
        String in = input.nextLine();

        char major = in.charAt(0);
        char level = in.charAt(1);

        String sMajor = "";
        String sLevel = "";
        switch (major) {
            case 'M':
                sMajor = "Mathematics";
                break;
            case 'C':
                sMajor = "Computer Science";
                break;
            case 'I':
                sMajor = "Information Technology";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }
        switch (level) {
            case '1':
                sLevel = "Freshman";
                break;
            case '2':
                sLevel = "Sophomore";
                break;
            case '3':
                sLevel = "Junior";
                break;
            case '4':
                sLevel = "Senior";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }
        System.out.println(sMajor + " " + sLevel);
    }
}
