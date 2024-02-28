public class DataType{
    
    static int staticIntValue;
    static double staticDoubleValue;
    static float staticFloatValue;
    static char staticCharValue;
    static boolean staticBooleanValue;
    static long staticLongValue;
    static short staticShortValue;
    static byte staticByteValue;

    public static void main(String[] args) {
        
        System.out.println("\nDefault values for class variables (static):");
        System.out.println("int: " + staticIntValue);
        System.out.println("double: " + staticDoubleValue);
        System.out.println("float: " + staticFloatValue);
        System.out.println("char: " + staticCharValue);
        System.out.println("boolean: " + staticBooleanValue);
        System.out.println("long: " + staticLongValue);
        System.out.println("short: " + staticShortValue);
        System.out.println("byte: " + staticByteValue);
    }
}
