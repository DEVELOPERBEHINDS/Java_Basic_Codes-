package string;
public class InsertSpacesBetweenCapitalWords {
    public static void main(String[] args) {
        String input = "ThisIsAJavaProgramToInsertSpacesBetweenWordsStartingWithCapitalLetters";
        String result = insertSpacesBetweenCapitalWords(input);
        System.out.println(result);
    }

    public static String insertSpacesBetweenCapitalWords(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            result.append(currentChar);

            if (i < input.length() - 1) {
                char nextChar = input.charAt(i + 1);

                if (Character.isUpperCase(currentChar) && Character.isLowerCase(nextChar)) {
                    // Insert a space before the next word
                    result.append(" ");
                }
            }
        }

        return result.toString();
    }
}
