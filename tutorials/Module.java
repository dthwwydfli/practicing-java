public class Module {
    private String moduleCode;
    private double testMark;
    private double courseworkMark;

    public Module(String moduleCode, double testMark, double courseworkMark) {
        this.moduleCode = moduleCode;
        this.testMark = testMark;
        this.courseworkMark = courseworkMark;
    }

    // 1. Private method for calculation
    private double getFinalMark() {
        return (this.testMark * 0.5) + (this.courseworkMark * 0.5);
    }

    // 2. Public method to check pass/fail
    public boolean pass() {
        double finalMark = getFinalMark();
        if (finalMark >= 40) {
            return true;
        } else {
            return false;
        }
    }

    // 3. Getter for the module code
    public String getModuleCode() {
        return this.moduleCode;
    }

    public static void main(String[] args) {
        Module m1 = new Module("CS101", 30.0, 60.0);
        System.out.println("Module: " + m1.getModuleCode());
        System.out.println("Passed? " + m1.pass());
    }
}