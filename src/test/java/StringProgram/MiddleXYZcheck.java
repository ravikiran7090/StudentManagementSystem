package StringProgram;
public class MiddleXYZcheck {
    public static void main(String[] args) {
        String input = "AAsddxyzcBBxyz"; // Change this to test other inputs

        boolean result = isXyzInMiddle(input);
        System.out.println("Is 'xyz' in the middle? " + result);
    }

    public static boolean isXyzInMiddle(String str) {
        int len = str.length();

        if (len < 3) return false; // "xyz" can't fit in strings shorter than 3

        for (int i = 0; i <= len - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int left = i;
                int right = len - (i + 3);
                if (Math.abs(left - right) <= 1) {
                    return true;
                }
            }
        }

        return false;
    }
}
