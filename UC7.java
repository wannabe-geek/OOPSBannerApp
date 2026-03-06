public class UC7{

    static class CharacterPatternMap {

        Character character;
        String[] pattern;

        // Constructor
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public Character getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Create predefined character pattern maps
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        };

        String[] P = {
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " **** ",
                "*     ",
                "*     ",
                " ***  ",
                "    * ",
                "    * ",
                "****  "
        };

        String[] space = {
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        };

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', O);
        maps[1] = new CharacterPatternMap('P', P);
        maps[2] = new CharacterPatternMap('S', S);
        maps[3] = new CharacterPatternMap(' ', space);

        return maps;
    }

    // Retrieve pattern for given character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }

        // return space pattern if not found
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                return map.getPattern();
            }
        }

        return new String[7];
    }

    // Print banner message
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        message = message.toUpperCase();

        for (int line = 0; line < 7; line++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);

                System.out.print(pattern[line] + "  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}