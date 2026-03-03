package com.mylang.tokenflow;

enum TokenType {

    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,
    PERCENT, AT, DOLLAR,

    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    IDENTIFIER, STRING, NUMBER,

    AND, CLASS, ELSE, FALSE, FUN, FOR,
    WHEN, DO, NIL, OR, PRINT, RETURN, SUPER, THIS,
    TRUE, VAR, WHILE,

    EOF
}

class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return "\nType of text: " + type + "\n" +
                "The actual lexeme: " + lexeme + "\n" +
                "The literal: " + literal;
    }
}
