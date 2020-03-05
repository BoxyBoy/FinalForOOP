package com.example.finalprojectminigame;

public enum Symbols {
    OPEN_BRACKET("["),
    CLOSE_BRACKET("]"),
    OPEN_BRACE("{"),
    CLOSE_BRACE("}"),
    OPEN_PARENTHESIS("("),
    CLOSE_PARENTHESIS(")"),
    SINGLE_QUOTE("'"),
    COMMA(","),
    FORWARD_SLASH("/"),
    EXCLAMATION_POINT("!"),
    DOLLAR_SIGN("$"),
    HASH_TAG("#"),
    GREATER_THAN(">"),
    LESS_THAN("<"),
    AMPERSAND("&"),
    CARET("^"),
    PERIOD("."),
    ASTERISK("*"),
    AT("@"),
    SEMICOLON(";"),
    COLON(":"),
    PERCENT("%"),
    EQUALS("="),
    PLUS("+"),
    MINUS("-"),
    PIPE("|"),
    QUESTION_MARK("?")

    ;
    private String symbol;
    Symbols(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() { return symbol;}
}
