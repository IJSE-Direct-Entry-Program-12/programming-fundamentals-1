import java.util.Random;

void main(){
    final double PI = 22 / 7;   // This is a compile-time constant
    final double SOME_RANDOM_CONSTANT = Math.random();  // This is a run-time constant

    System.out.println(PI);
    System.out.println(SOME_RANDOM_CONSTANT);

    // Local Constant Declaration Statement
    final int DAYS_OF_WEEK = 3 + 6 - 4; // Compile-time constant
    final int SOME_RANDOM_INT = new Random().nextInt(); // Run-time constant

    byte myByte1 = DAYS_OF_WEEK;
    // byte myByte2 = SOME_RANDOM_INT;

    System.out.println(DAYS_OF_WEEK);
    // System.out.println(SOME_RANDOM_INT);

    String myStr;       // Local Variable Declaration Statement
    myStr = "DEP-12";   // Assignment Expression Statement
    System.out.println(myStr);  // Method Invocation Expression Statement

}