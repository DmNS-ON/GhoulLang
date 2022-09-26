package ru.DmN.ghoullang;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Console {
    public static void main(String[] args) throws IOException {
        if (args.length < 3)
            usageError();

        String input = new String(Files.readAllBytes(new File(args[1]).toPath()));
        try (FileOutputStream out = new FileOutputStream(args[2])) {
            switch (args[0]) {
                case "compile": {
                    out.write(Compiler.compile(input).getBytes(StandardCharsets.UTF_8));
                    break;
                }
                case "decompile": {
                    out.write(Decompiler.decompile(input).getBytes(StandardCharsets.UTF_8));
                    break;
                }
                default:
                    usageError();
            }
        }
    }

    public static void usageError() {
        System.out.println("Usage: <compile/decompile> <infile> <outfile>");
        System.exit(1);
    }
}
