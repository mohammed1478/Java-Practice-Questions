public class Main {

    public static void main(String[] args) {
	    Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Resolution resolution = new Resolution(2540, 1440);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27,resolution);
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getTheCase().pressPowerButton();
        thePC.getMonitor().drawPixelAt(1500, 1200, "red" );
        thePC.getMotherboard().loadProgram("Windows 10");

        System.out.println("Loading information about PC");

        System.out.println("Case Model: " + theCase.getModel());
        System.out.println("Case Manufacturer: " + theCase.getManufacturer());
        System.out.println("Power Supply: " + theCase.getPowerSupply() + " watts");
        System.out.println("Monitor Model: " + theMonitor.getModel());
        System.out.println("Monitor Manufacturer: " + theMonitor.getManufacturer());
        System.out.print("Monitor Resolution: "  );
        resolution.theResolution();

        

    }
}
