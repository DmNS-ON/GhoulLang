package ru.DmN.ghoullang;

public class Decompiler {
    public static String decompile(String code) {
        StringBuilder sb = new StringBuilder();
        for (char c : code.toCharArray()) {
            String str;
            switch (c) {
                case '[': {
                    str = "канеки";
                    break;
                }
                case ']': {
                    str = "кен";
                    break;
                }
                case '.': {
                    str = "1000 - 7";
                    break;
                }
                case '>': {
                    str = "гуль гуль";
                    break;
                }
                case '<': {
                    str = "гуль SSS";
                    break;
                }
                case '+': {
                    str = "SSS SSS";
                    break;
                }
                case '-': {
                    str = "SSS гуль";
                    break;
                }
                default:
                    str = "";
            }
            sb.append(str);
            sb.append(' ');
        }
        return sb.toString();
    }
}
