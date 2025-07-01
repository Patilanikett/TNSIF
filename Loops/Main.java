public class Main {
    public static void ForloopExample() {
        System.out.println("\nfor loop example");
        int no_of_iteration = 10;

        for (int i = 1; i <= no_of_iteration; i++) {
            System.out.println("Iteration " + i);
        }
    }

    public static void WhileExample()
    {
        System.out.println("\nwhile loop example");
        int no_of_iteration=15;
        int count=1;
        while (count<no_of_iteration) {
            System.out.println("iteration"+ count);
            count++; 
            
        }
    }

    public static void main(String[] args) {
        ForloopExample();
        WhileExample();
    }
}