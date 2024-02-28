interface AccessModifiersDemo {
    int DEFAULT_VARIABLE = 10;

    void defaultMethod();

    void publicAbstractMethod();
}

class ImplementingClass implements AccessModifiersDemo {
    int instanceVariable;

    public void defaultMethod() {
        System.out.println("Default method implementation.");
    }

    public void publicAbstractMethod() {
        System.out.println("Public abstract method implementation.");
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();

        System.out.println("Default variable: " + AccessModifiersDemo.DEFAULT_VARIABLE);
        obj.defaultMethod();
        obj.publicAbstractMethod();
    }
}
