public class Base {
    int varDefault = 10;                // Default access
    public int varPublic = 20;          // Public access
    private int varPrivate = 30;        // Private access
    protected int varProtected = 40;    // Protected access

    void methodDefault() {
        System.out.println("Default access base class");
        System.out.println("Default variable: " + varDefault);
    }

    public void methodPublic() {
        System.out.println("Public access base class");
        System.out.println("Public variable: " + varPublic);
    }

    private void methodPrivate() {
        System.out.println("Private access base class");
        System.out.println("Private variable: " + varPrivate);
    }

    protected void methodProtected() {
        System.out.println("Protected access base class");
        System.out.println("Protected variable: " + varProtected);
    }
}
