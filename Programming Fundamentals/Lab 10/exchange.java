public class exchange {

        public static void main (String[] args) {
        int a = 8;
        int b = 3;
        a = returnFirst(b, b = a); // try reading this as a = b; b = a;
        System.out.println("a: " + a + ", b: " + b); // prints a: 3, b: 8
        }
        public static int returnFirst(int x, int y) {
                return x;
        }
}






