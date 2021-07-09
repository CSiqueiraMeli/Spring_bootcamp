package br.com.meli.morse.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MorseService {
    public static String getCodigo(String codigoPassado) {
        List<String> codigo = new ArrayList<>();
        String palavra = "";

        for (int i = 0; i < codigoPassado.length(); i++) {
            if (codigoPassado.charAt(i) == ' ' && codigoPassado.charAt(i - 1) == ' ' && codigoPassado.charAt(i + 1) == ' ') {
                codigo.add(" ");
                i++;
            } else if (codigoPassado.charAt(i) != ' ') {
                palavra += codigoPassado.charAt(i);
            } else if (codigoPassado.charAt(i) == ' ') {
                codigo.add(palavra);
                palavra = "";
            }

        }
        if (palavra != "") {
            codigo.add(palavra);
        }

        Map<String, Character> morseMap;
        morseMap = new HashMap<>();
        morseMap.put(".-", 'A');
        morseMap.put("-...", 'B');
        morseMap.put("-.-.", 'C');
        morseMap.put("-..", 'D');
        morseMap.put(".", 'E');
        morseMap.put("..-.", 'F');
        morseMap.put("--.", 'G');
        morseMap.put("....", 'H');
        morseMap.put("..", 'I');
        morseMap.put(".---", 'J');
        morseMap.put("-.-", 'K');
        morseMap.put(".-..", 'L');
        morseMap.put("--", 'M');
        morseMap.put("-.", 'N');
        morseMap.put("---", 'O');
        morseMap.put(".--.", 'P');
        morseMap.put("--.-", 'Q');
        morseMap.put(".-.", 'R');
        morseMap.put("...", 'S');
        morseMap.put("-", 'T');
        morseMap.put("..-", 'U');
        morseMap.put("...-", 'V');
        morseMap.put(".--", 'W');
        morseMap.put("-..-", 'X');
        morseMap.put("-.--", 'Y');
        morseMap.put("--..", 'Z');
        morseMap.put(".----", '1');
        morseMap.put("..---", '2');
        morseMap.put("...--", '3');
        morseMap.put("....-", '4');
        morseMap.put(".....", '5');
        morseMap.put("-....", '6');
        morseMap.put("--...", '7');
        morseMap.put("---..", '8');
        morseMap.put("----.", '9');
        morseMap.put("-----", '0');

        StringBuilder fraseCodificada = new StringBuilder();
        for (String s : codigo) {
            if (s == " "){
                fraseCodificada.append(" ");
            }
            else
                fraseCodificada.append(morseMap.get(s.toString().trim()));
        }

        return fraseCodificada.toString();
    }
}