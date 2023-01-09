public class Poggers {

    public static String swapFirstAndSecondHalf(String s) {
        int length = s.length();
        int halfLength = length / 2;
        String firstHalf = s.substring(0, halfLength);
        String secondHalf = s.substring(halfLength, length);
        return secondHalf + firstHalf;
    }
}
