/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.awt.AWTException;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException, AWTException {
        
        // This is to remove unnecessary warnings from your console
        System.setProperty("java.util.logging.config.file", "logging.properties");
        
   
        Nested_Frame_Text printtext= new Nested_Frame_Text();      // Initialize your Nested_Frame_Text class
   
        //TODO: call your test case functions one after other here


   
        //END Tests

        printtext.endTest();              //End your test by clearning connections and closing browse


    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException, AWTException {
        new App().getGreeting();
    }
    
}
