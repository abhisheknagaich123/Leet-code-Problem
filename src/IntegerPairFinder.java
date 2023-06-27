public class IntegerPairFinder {

    public static void findIntegerPairs(int p, int x) {
        for (int i = 1; i < p; i++) {
            int j = p - i;
            if ((i ^ j) == x) {
                System.out.print(" "+i +" "+j);
                break;
            }
        }
}
    public static void main(String[] args) {
        int p = 100;
        int x = 4;
        findIntegerPairs(p, x);
    }}
