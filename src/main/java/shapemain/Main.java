package shapemain;

import shapeswitch.Switch;
import java.util.Scanner;
import java.util.logging.Logger;
public class Main {
    private static int choice=0;
    public static void main(String[] args) {
        Logger log=Logger.getLogger("Main");
        Scanner sc=new Scanner(System.in);
       while (choice!=4){
            log.info("1.Triangle        2.Rectangle          3.Circle           4.Exit");
            choice = sc.nextInt();
            new Switch(choice);
        }
    }
}