import java.util.ArrayList;

import com.sun.tools.javac.util.List;
class Token {
    enum Type {
        IDENTIFIER, NUMBER, OPERATOR,  WHITESPACE, UNKNOWN
    }

    Type type;
    String value;

    Token(Type type, String value) {
        this.type = type;
        this.value = value;
    }

    public String toString() {
        return String.format("Token(%s, \"%s\")", type, value);

    }
}

public class Lexer {
    public static List<Token> tokenize(String input) {
        List<Token> tokens = new ArrayList<>();
        int i = 0;

        while (i < input.length()) {
            char current = input.charAt(i);

            //skip whitespace
            if (Character.isWhitespace(current)) {
                i++;
                continue;
            }

            //Identifier 
            if (Character.isLetter(current)) {
                StringBuilder sb = new StringBuilder();
                while ( i < input.length() && (Character.isLetterOrDigit(input.charAt(i)))) {
                    sb.append(input.charAt(i));
                    i++;
                }

                tokens.add(new Token(Token.Type.IDENTIFIER, sb.toString()));
                continue;
            }

            //number
            if (Character.isDigit(current)) {
                StringBuilder sb = new StringBuilder();
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    sb.append(input.charAt(i));
                    i++;
                }

                tokens.add(new Token(Token.Type.NUMBER, sb.toString()));
                continue;
            }

            //operator
            if ("+=*/".indexOf(current) != -1) {
                tokens.add(new Token(Token.Type.OPERATOR, Character.toString(current)));
                i++;
                continue;
            }

            // Unknown character
            tokens.add(new Token(Token.Type.UNKNOWN, Character.toString(current)));
            i++;
        }

        return tokens;
    }

    public static void main(String[] args) {
        String input = "x1 = a + 20 * b2";
        List<Token> tokens = tokenize(input);

        for (Token token : tokens) {
            System.out.println(token);
    
    }
        }
    }

    
}
