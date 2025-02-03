package StringProgram;

public class Changing_Keys {

    public static void main(String[] args) {
        String word = "aabBCcDd";
        char lastKey = Character.toLowerCase(word.charAt(0)); 
        int count = 0;

        for (int i = 1; i < word.length(); i++) {
            char currentKey = Character.toLowerCase(word.charAt(i));
            if (currentKey != lastKey) {
                count++;
            }
            lastKey = currentKey;
        }

        System.out.println("Total number of keyChange: " + count);
    }
}