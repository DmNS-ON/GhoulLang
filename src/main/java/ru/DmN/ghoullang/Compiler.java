package ru.DmN.ghoullang;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Compiler extends ru.DmN.ghoullang.ghoulBaseListener {
    public final StringBuilder output = new StringBuilder();

    public Compiler(String code) {
        ru.DmN.ghoullang.ghoulLexer lexer = new ru.DmN.ghoullang.ghoulLexer(CharStreams.fromString(code));
        CommonTokenStream stream = new CommonTokenStream(lexer);
        ru.DmN.ghoullang.ghoulParser parser = new ru.DmN.ghoullang.ghoulParser(stream);
        ParseTreeWalker walker = new ParseTreeWalker();
        //
        walker.walk(this, parser.file());
    }

    public static String compile(String code) {
        return new Compiler(code).output.toString();
    }

    @Override
    public void enterWhile(ru.DmN.ghoullang.ghoulParser.WhileContext ctx) {
        this.output.append('[');
    }

    @Override
    public void exitWhile(ru.DmN.ghoullang.ghoulParser.WhileContext ctx) {
        this.output.append(']');
    }

    @Override
    public void enterOper0(ru.DmN.ghoullang.ghoulParser.Oper0Context ctx) {
        this.output.append('>');
    }

    @Override
    public void enterOper1(ru.DmN.ghoullang.ghoulParser.Oper1Context ctx) {
        this.output.append('<');
    }

    @Override
    public void enterOper2(ru.DmN.ghoullang.ghoulParser.Oper2Context ctx) {
        this.output.append('+');
    }

    @Override
    public void enterOper3(ru.DmN.ghoullang.ghoulParser.Oper3Context ctx) {
        this.output.append('-');
    }

    @Override
    public void enterOper4(ru.DmN.ghoullang.ghoulParser.Oper4Context ctx) {
        this.output.append('.');
    }
}
