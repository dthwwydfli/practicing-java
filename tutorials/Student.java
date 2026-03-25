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
    Student s1 = new Student("Alex", "w123");
    
    // Create a module
    Module m1 = new Module("CS101", 50, 60);
    
    // Give the module to the student
    s1.addModule(m1);
    
    // Check if they passed their modules
    s1.showPass();
}
}