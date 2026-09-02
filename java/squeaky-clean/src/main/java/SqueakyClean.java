class SqueakyClean {
    static String clean(String identifier) {

        StringBuilder sb = new StringBuilder();

        for(int index = 0; index < identifier.length(); index++) {
            char ch = identifier.charAt(index);

            if(Character.isWhitespace(ch)) {
                sb.append("_");
            } else if(ch == '-') {
                sb.append(String.valueOf(identifier.charAt(index + 1)).toUpperCase());
                index++;
            } else if(Character.isDigit(ch)) {
                char newChar = transformLeetToLetter(ch);
                sb.append(String.valueOf(newChar));
            } else if(Character.isLetter(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    static char transformLeetToLetter(char leet) {
        return switch (leet) {
            case '4' -> 'a';
            case '3' -> 'e';
            case '0' -> 'o';
            case '1' -> 'l';
            case '7' -> 't';
            default -> leet;
        };
    }
}
