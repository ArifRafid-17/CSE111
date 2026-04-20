public class Animalkeepers {
    static String[] Animals = {"Lion", "Tiger", "Seal", "Gorilla", "Deer"};
    String name;
    static int id = 101;
    int ID;
    static int keeperCount = 0;
    static String[] names = new String[100];
    static String[] tasks = new String[100];
    static int taskCount = 0;

    public Animalkeepers(String a) {
        name = a;
        ID = id++;
        keeperCount++;
        System.out.println(name + " with ID " + ID + " got the job!");
    }

    public static void printTasks() {
        if (taskCount == 0) {
            System.out.println("No tasks assigned.");
            return; 
        }
        for (int i = 0; i < Animals.length; i++) {
            if (tasks[i] != null) {
                System.out.println(tasks[i] + " (Keeper - " + names[i] + ") === " + Animals[i]);
            }
        }
    }

    public static void details() {
        if (taskCount == 0) {
            System.out.println("No Animal Keepers working yet.");
            return; 
        }
        System.out.println("Total Animal Keeper: " + keeperCount);
        System.out.println("Total Task assigned: " + taskCount);
        printTasks();
    }

    public void doTask(String a, String b) {
        boolean flag = false;
        int index = -1;

        for (int i = 0; i < Animals.length; i++) {
            if (a.equals(Animals[i])) {
                flag = true;
                index = i;
            }
        }

        if (flag) {
            if (tasks[index] == null) {
                taskCount++;
            }
            tasks[index] = b;
            names[index] = name; 
            System.out.println("Task assigned to " + name);
        } else {
            System.out.println("Animal not in the Safari");
        }
    }
}