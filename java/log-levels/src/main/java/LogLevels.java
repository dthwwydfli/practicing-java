public class LogLevels {
    
    public static String message(String logLine) {
        LogLevels.message("[ERROR]: Invalid operation");
        LogLevels.message("[WARNING]:  Disk almost full\r\n");
        
    }

    public static String logLevel(String logLine) {
        LogLevels.logLevel("[ERROR]: Invalid operation");
        
    }

    public static String reformat(String logLine) {
        LogLevels.reformat("[INFO]: Operation completed");
    }
}
