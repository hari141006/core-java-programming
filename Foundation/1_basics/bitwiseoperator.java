
// Definition:
// Bitwise operators work directly on the binary representation of numbers.
// They include AND (&), OR (|), XOR (^), and NOT (~).

class bitwiseoperators {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        // Binary:
        // 5 = 0101
        // 3 = 0011

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));

        // Shift operators
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
    }
}