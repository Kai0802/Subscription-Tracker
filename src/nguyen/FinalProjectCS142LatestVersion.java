package nguyen;

import javafx.application.Application;

/**
 * I don't know why this is working (testing)
 * 
 * @author Phuoc Nguyen {@literal <h.phuoc137@gmail.com>}
 */
public class FinalProjectCS142LatestVersion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(ProjectUI.class);
        System.out.println("Maybe print this line just for fun");
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Another line just for fun");
    }
    
}
