/* GCIS-124-600 - Assignment 1 
 * Group 6 : Mohamed Ahmed, Omar Dardas, Sahana Muralikrishnan
 */

package assignment_01;

import java.util.Scanner;

/* Main Client Class */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        try {
            System.out.println("Please enter your choice of car : ");
            char choice = scanner.next().charAt(0);
            CarSelector carSelector = new CarSelector(choice);
            LuxuryCar selectedCar = carSelector.getCarType();
    
            if (selectedCar != null) {
                selectedCar.buildCar();
                selectedCar.inspectCar();
                selectedCar.printCarReport();
            } else {
                System.out.println("Invalid car choice");
            }
        } finally {
            scanner.close(); 
        }
    }
    

}
