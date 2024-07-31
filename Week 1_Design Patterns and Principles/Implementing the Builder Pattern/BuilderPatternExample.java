public class BuilderPatternExample {
    public static void main(String[] args) {
        // Creating a Computer using the Builder pattern
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setMotherboard("ASUS ROG")
                .setPowerSupply("850W")
                .setCoolingSystem("Liquid Cooling")
                .setCaseType("ATX")
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setMotherboard("Gigabyte")
                .setPowerSupply("600W")
                .setCaseType("Micro ATX")
                .build();

        // Print the configurations
        System.out.println("Gaming Computer Configuration: " + gamingComputer);
        System.out.println("Office Computer Configuration: " + officeComputer);
    }
}
