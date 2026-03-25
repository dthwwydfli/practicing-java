public class Student {
    private String name;
    private String ID;
    // 1. Add the array attribute
    private Module[] modules;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
        // 2. Initialize the array with 6 empty slots
        this.modules = new Module[6];
    }

    // 2. Method to add a module into an empty slot
    public void addModule(Module m) {
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) { // Find the first "empty" slot
                modules[i] = m;
                System.out.println("Module added successfully!");
                return; // Stop looking once we've added it
            }
        }
        System.out.println("No space left in the array!");
    }

    // 3. Method to check passes for all modules
    public void showPass() {
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] != null) { // Only check if the slot isn't empty
                boolean passed = modules[i].pass();
                System.out.println("Module " + modules[i].getModuleCode() + " Pass: " + passed);
            }
        }
    }

    public static void main(String[] args) {
        // 1. Create the first Student (Alex)
        Student s1 = new Student("Alex", "W1001");

        // 2. Create modules for Alex and add them
        // Passing marks: (50 + 60) / 2 = 55 (Pass)
        Module m1 = new Module("CS101", 50.0, 60.0);
        // Failing marks: (20 + 30) / 2 = 25 (Fail)
        Module m2 = new Module("MATH10", 20.0, 30.0);

        s1.addModule(m1);
        s1.addModule(m2);

        // 3. Create a second Student (Bob)
        Student s2 = new Student("Bob", "W1002");

        // 4. Create modules for Bob and add them
        Module m3 = new Module("ENG20", 80.0, 90.0); // Pass
        s2.addModule(m3);

        // 5. Final Report: Check everyone's results
        System.out.println("--- ALEX'S REPORT ---");
        s1.showPass();

        System.out.println("\n--- BOB'S REPORT ---");
        s2.showPass();
    }
}
