public class Student {
    // 1. Attributes (The data)
    private String name;
    private String ID;

    // 2. Constructor (The creator)
    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    // 3. Getters and Setters (The gatekeepers)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 4. The Main Method (The "Start" button)
    public static void main(String[] args) {
        Student s1 = new Student("Alex", "w12345");
        System.out.println(s1.getName()); // Prints: Alex
        
        s1.setName("Bob");
        System.out.println(s1.getName()); // Prints: Bob
    }
}