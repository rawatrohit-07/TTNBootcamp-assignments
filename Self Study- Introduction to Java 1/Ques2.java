import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder totalText= new StringBuilder();
        boolean flag=true;
        while(flag == true)
        {
            System.out.print("Enter Text: ");
            String i = sc.nextLine();
            if(i.equals("XDONE")) {
                flag = false;
            }
            totalText.append( "\n" +i);
        }
        System.out.println("Entered Text : "+ totalText);
    }
}