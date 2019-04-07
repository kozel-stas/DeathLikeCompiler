package com.deathkile;

import com.deathkile.core.impl.DeathLikeGrammarParserImpl;
import com.deathkile.core.impl.DeathLikeGrammarVisitorImpl;
import com.deathkile.gen.DeathLikeGrammarLexer;
import com.deathkile.gen.DeathLikeGrammarVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) {
        try {
            String inputFilePath = System.getProperty("in.path", "src\\main\\resources\\test.deathlike");
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFilePath));
            DeathLikeGrammarLexer lexer = new DeathLikeGrammarLexer(input);
            DeathLikeGrammarParserImpl parser = new DeathLikeGrammarParserImpl(new CommonTokenStream(lexer));

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ParseTree tree = parser.global_program();
            if (!byteArrayOutputStream.toString().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Lexer error: " + byteArrayOutputStream.toString());
                return;
            }
            DeathLikeGrammarVisitor<String> listVisitor = new DeathLikeGrammarVisitorImpl(parser, "RunProgram");
            String output = listVisitor.visit(tree);
            FileWriter fileWriter = new FileWriter("RunProgram.java");
            fileWriter.write(output);
            fileWriter.close();

            runProcess("javac -cp . RunProgram.java");
            runProcess("java -cp ; RunProgram");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void runProcess(String command) throws Exception {
        Process pro = Runtime.getRuntime().exec(command);
        printLines(command + " stdout:", pro.getInputStream());
        printLines(command + " stderr:", pro.getErrorStream());
        pro.waitFor();
        System.out.println(command + " exitValue() " + pro.exitValue());
    }

    private static void printLines(String cmd, InputStream ins) throws Exception {
        String line = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(ins));
        while ((line = in.readLine()) != null) {
            System.out.println(cmd + " " + line);
        }
    }

}