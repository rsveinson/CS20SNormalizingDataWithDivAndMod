import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

/* ****************************************
 * Name:        Sveinson
 * Class:       CS20S
 * 
 * Assignment:  Normalizing example
 * 
 * Descriptin:  Use div and mod to find the 
 *              total weight of two elephants
 **********************************************/
public class CS20SNormalizingExample001{
    public static void main(String[] args){
    // **** Constants ****
    
        final String nl = System.lineSeparator();
        
        // weight constants
        int GRAMSPERTONNE = 1000000;        // grams in one tonne
        int GRAMSPERKILO = 1000;            // grams in one kilo
    
    // **** variables ****
    
        String banner = "";         // output banner
        String prompt = "";         // prompt for input
        
        String strin = "";          // intput
        String strout = "";         // used for formatted output
        
        // elephat weight variables
        // weight of elephant 1
        int e1Tonnes = 0;
        int e1Kilos = 0;
        int e1Grams = 0;
        int e1TotalGrams = 0;
        
        // weight of elephant 2
        int e2Tonnes = 0;
        int e2Kilos = 0;
        int e2Grams = 0;
        int e2TotalGrams = 0;
        
        // total weight
        int totalWeightInGrams = 0;
        int totalTonnes = 0;
        int totalKilos = 0;
        int totalGrams = 0;
        
    // **** Objects ****
        // create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // **** banner ****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  Normalizing example" + nl;
        banner += "******************************";
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
    
        // get weight of elephant 1
        prompt = "Enter the weight of elephant 1 in tonnes kilos grams";
        System.out.println(prompt);
        e1Tonnes = scanner.nextInt();
        e1Kilos = scanner.nextInt();
        e1Grams = scanner.nextInt();
        
        // echo e1 weight
        System.out.println("Elephant 1: ");
        System.out.println(e1Tonnes + ":" + e1Kilos + ":" + e1Grams);
        System.out.println();
        
        // get weight of elephant 2
        prompt = "Enter the weight of elephant 2 in tonnes kilos grams";
        System.out.println(prompt);
        e2Tonnes = scanner.nextInt();
        e2Kilos = scanner.nextInt();
        e2Grams = scanner.nextInt();
        
        // echo e2 weight
        System.out.println("Elephant 2: ");
        System.out.println(e2Tonnes + ":" + e2Kilos + ":" + e2Grams);
        System.out.println();
        
    
    // **** processing ****
    
    //int GRAMSPERTONNE = 1000000;        // grams in one tonne
    //int GRAMSPERKILO = 1000;            // grams in one kilo
    
        // normalize weights of the two elephants
        // e1
        e1TotalGrams = e1Tonnes * GRAMSPERTONNE;
        e1TotalGrams += e1Kilos * GRAMSPERKILO;
        e1TotalGrams += e1Grams;
        //System.out.println("e1 total grams: " + e1TotalGrams);
        
        // e2
        e2TotalGrams = e2Tonnes * GRAMSPERTONNE;
        e2TotalGrams += e2Kilos * GRAMSPERKILO;
        e2TotalGrams += e2Grams;
        //System.out.println("e2 total grams: " + e2TotalGrams);
        
        // get total weight in grams
        totalWeightInGrams = e1TotalGrams + e2TotalGrams;
        //System.out.println("total grams: " + totalWeightInGrams);
        
        // de-normalize
        // int totalTonnes = 0;
        // int totalKilos = 0;
        // int totalGrams = 0;
        
        // get total tonnes
        totalTonnes = totalWeightInGrams / GRAMSPERTONNE;
        
        // re-set total Grams
        totalWeightInGrams = totalWeightInGrams % GRAMSPERTONNE;
        
        // get total kilos
        totalKilos = totalWeightInGrams / GRAMSPERKILO;
        
        // re-set total grams
        totalWeightInGrams = totalWeightInGrams % GRAMSPERKILO;
        
        // finally total grams
        totalGrams = totalWeightInGrams;
        
        //test computation
        System.out.println(totalTonnes + "t " + totalKilos + "Kg " + totalGrams + "g");
    
    // **** output ****
    
    // **** closing message ****
    
        System.out.println();
        System.out.println("end of program");
        
    }// end main

}// end class
