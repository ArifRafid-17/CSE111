public class Spaceship {
    String name;
    double capacity;
    Cargo[] cargoList;
    int cargoCount;
    double currentWeight;

    public Spaceship(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
        this.cargoList = new Cargo[100];
        this.cargoCount = 0;
        this.currentWeight = 0;
    }

    public void loadCargo(Cargo cargo) {
        if (cargoCount >= 100) {
            System.out.println("Warning: Unable to load " + cargo.getName() + " inside " + name + ". Maximum cargo count reached.");
                               
            
        }
        double newWeight = currentWeight + cargo.getWeight();
        if (newWeight > capacity) {
            double excess = newWeight - capacity;
            System.out.println("Warning: Unable to load " + cargo.getName() + " inside " + name + ". Exceeds capacity by " + (int) excess + ".");
        }
        cargoList[cargoCount++] = cargo;
        currentWeight = newWeight;
    }

    public void displayDetails() {
        System.out.println("Spaceship Name: " + name);
        System.out.println("Capacity: " + (int) capacity);
        System.out.println("Current Cargo Weight: " + (int) currentWeight);
        System.out.print("Cargo:");

        for (int i = 0; i < cargoCount; i++) {
            System.out.print(cargoList[i].getName() + " ");
        }
        System.out.println();
    }
}