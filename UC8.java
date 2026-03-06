import java.util.HashMap;

public class OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('*', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        charMap.put('*', new String[]{
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        charMap.put('S', new String[]{
                " **** ",
                "*     ",
                "*     ",
                " ***  ",
                "    * ",
                "    * ",
                "****  "
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                String[] pattern = charMap.get(ch);

                System.out.print(pattern[line] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}