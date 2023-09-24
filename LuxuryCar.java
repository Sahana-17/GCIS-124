/* GCIS-124-600 - Assignment 1 
 * Group 6 : Mohamed Ahmed, Omar Dardas, Sahana Muralikrishnan
 */

package assignment_01;

/* Parent Class */
abstract class LuxuryCar {
    abstract void buildCar();
    abstract void inspectCar();
    void printCarReport() {
        System.out.println("Our Luxury car is " + this.getClass().getSimpleName());
    }
}

/* Child Class */
class Bugatti extends LuxuryCar {
    void buildCar() {
        System.out.println("Building Bugatti");
    }

    void inspectCar() {
        System.out.println("Inspecting Bugatti");
    }
}

/* Child Class */
class Lamborghini extends LuxuryCar {
    void buildCar() {
        System.out.println("Building Lamborghini");
    }

    void inspectCar() {
        System.out.println("Inspecting Lamborghini");
    }
}

/* Child Class */
class NissanPetrol extends LuxuryCar {
    void buildCar() {
        System.out.println("Building NissanPetrol");
    }

    void inspectCar() {
        System.out.println("Inspecting NissanPetrol");
    }
}

/* Child Class */
class Tesla extends LuxuryCar {
    void buildCar() {
        System.out.println("Building Tesla");
    }

    void inspectCar() {
        System.out.println("Inspecting Tesla");
    }
}

class CarSelector {
    private char carType;

    CarSelector(char carType) {
        this.carType = carType;
    }

    LuxuryCar getCarType() {
        LuxuryCar car;

        char lowerCaseCarType = Character.toLowerCase(carType); // Convert to lowercase

        switch (lowerCaseCarType) {
            case 'b':
                car = new Bugatti();
                break;
            case 'l':
                car = new Lamborghini();
                break;
            case 'n':
                car = new NissanPetrol();
                break;
            case 't':
                car = new Tesla();
                break;
            default:
                car = null;
                break;
        }

        return car;
    }
}
