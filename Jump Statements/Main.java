public class Main{

    // Continue Statement Example
    public static void ContinueDemo(){
        int no_of_iteration = 15;
        for (int i = 1; i < no_of_iteration; i++) {
            if (i%2!=0) {
                continue;
            }

            System.out.println("Even No." + i);
        }
    }

    public static void main(String[] args) {
        ContinueDemo();
    }
}