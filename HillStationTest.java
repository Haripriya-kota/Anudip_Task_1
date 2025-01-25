/*2.Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print accordingly.*/

// Superclass HillStations
class HillStations {
    // Method location() in the superclass
    public void location() {
        System.out.println("Location information is not available.");
    }

    // Method famousFor() in the superclass
    public void famousFor() {
        System.out.println("Famous for details are not available.");
    }
}

// Subclass Manali extends HillStations
class Manali extends HillStations {
    // Overriding location() method in Manali subclass
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    // Overriding famousFor() method in Manali subclass
    @Override
    public void famousFor() {
        System.out.println("Manali is famous for its snow-capped mountains and adventure sports.");
    }
}

// Subclass Mussoorie extends HillStations
class Mussoorie extends HillStations {
    // Overriding location() method in Mussoorie subclass
    @Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }

    // Overriding famousFor() method in Mussoorie subclass
    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its scenic views and pleasant climate.");
    }
}

// Subclass Gulmarg extends HillStations
class Gulmarg extends HillStations {
    // Overriding location() method in Gulmarg subclass
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }

    // Overriding famousFor() method in Gulmarg subclass
    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for skiing and its lush green meadows.");
    }
}

// Main class to demonstrate method calls
public class HillStationTest {
    public static void main(String[] args) {
        // 1. Calling the location() and famousFor() methods using the Parent class (HillStations)
        HillStations hillStation = new HillStations();
        hillStation.location();  // Parent class method
        hillStation.famousFor(); // Parent class method

        // 2. Calling the location() and famousFor() methods using the Subclass objects
        HillStations manali = new Manali();
        manali.location();   // Manali's overridden method
        manali.famousFor();  // Manali's overridden method

        HillStations mussoorie = new Mussoorie();
        mussoorie.location();   // Mussoorie's overridden method
        mussoorie.famousFor();  // Mussoorie's overridden method

        HillStations gulmarg = new Gulmarg();
        gulmarg.location();   // Gulmarg's overridden method
        gulmarg.famousFor();  // Gulmarg's overridden method
    }
}

/*
Output:
Location information is not available.
Famous for details are not available.
Manali is located in Himachal Pradesh.
Manali is famous for its snow-capped mountains and adventure sports.
Mussoorie is located in Uttarakhand.
Mussoorie is famous for its scenic views and pleasant climate.
Gulmarg is located in Jammu and Kashmir.
Gulmarg is famous for skiing and its lush green meadows.
*/