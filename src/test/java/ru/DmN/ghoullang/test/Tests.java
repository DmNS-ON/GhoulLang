package ru.DmN.ghoullang.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.DmN.ghoullang.Compiler;
import ru.DmN.ghoullang.Decompiler;

public class Tests {
    @Test
    public void main() {
        var input = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.";
        var decompiled = Decompiler.decompile(input);
        var compiled = Compiler.compile(decompiled);
        Assertions.assertEquals(input, compiled);
        System.out.println(decompiled);
    }
}
