package com.deathlike.core.impl;

import com.deathlike.gen.DeathLikeGrammarParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import java.util.ArrayList;
import java.util.List;

public class DeathLikeGrammarParserImpl extends DeathLikeGrammarParser {

    public DeathLikeGrammarParserImpl(TokenStream input) {
        super(input);
    }

    public List<Token> getTokens(Token start, Token end) {
        List<Token> list = new ArrayList<>();
        for (int i = start.getTokenIndex(); i <= end.getTokenIndex(); i++) {
            list.add(getTokenStream().get(i));
        }
        return list;
    }

}