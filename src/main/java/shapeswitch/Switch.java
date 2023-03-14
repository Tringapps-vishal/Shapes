package shapeswitch;

import java.util.logging.Logger;
public class Switch {
    public Switch(int choice){
        Logger log=Logger.getLogger("Switch");
        Call c=new Call();
            switch (choice) {
                case 1 -> c.triangle();
                case 2 -> c.rectangle();
                case 3 -> c.circle();
                case 4 -> System.exit(0);
                default -> log.info("INVALID CHOICE!!!");
            }
    }
}
