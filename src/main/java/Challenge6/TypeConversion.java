package Challenge6;

public class TypeConversion {
    public static void main(String[] args) {
        float myFloat = 5;
        System.out.println(myFloat); // Implicit conversion or widening

        int myInt = (int) 5.45f;   // Explicit conversion or Narrowing
        System.out.println(myInt);
    }
}
