package aufgabenblatt03.morse;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Morse {
    private static String abc = "abcdefghijklmnopqrstuvwxyz1234567890";
    private static String[] morse = {".-", // A
            "-...", // B
            "-.-.", // C
            "-..", // D
            ".", // E
            "..-.", // F
            "--.", // G
            "....", // H
            "..", // I
            ".---", // J
            "-.-", // K
            ".-..", // L
            "--", // M
            "-.", // N
            "---", // O
            ".--.", // P
            "--.-", // Q
            ".-.", // R
            "...", // S
            "-", // T
            "..-", // U
            "...-", // V
            ".--", // W
            "-..-", // X
            "-.--", // Y
            "--..", // Z
            ".----", // 1
            "..---", // 2
            "...--", // 3
            "....-", // 4
            ".....", // 5
            "-....", // 6
            "--...", // 7
            "---..", // 8
            "----.", // 9
            "-----" // 0
    };

    private static HashMap<Character, String> map2morse;
    private static HashMap<String, Character> map2abc;

    public static void initHashMaps() {
        map2morse = new HashMap<>();
        map2abc = new HashMap<>();
        for (int i = 0; i < abc.length(); i++) {
            map2morse.put(abc.charAt(i), morse[i]);
            map2abc.put(morse[i], abc.charAt(i));
        }
    }

    public static void main(String[] args) {
        initHashMaps();
       // String input = InputTools.readString("Text zum Morsen: ");
        //input = input.replace(" ", "").replace(".", "").replace(",", "");
        //input = input.replace("!", "").replace("?", "").toLowerCase();

        File f = new File("morse.txt");
        /**
        try (FileWriter fw = new FileWriter(f)) {
            fw.write(toMorse(input));
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         **/

        try (FileReader fr = new FileReader(f)) {
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println(line);
            System.out.println(toAbc(line));
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String toMorse(String inp) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < inp.length(); i++) {
            sb.append(map2morse.getOrDefault(inp.charAt(i), "?")).append(" ");
        }
        return sb.toString();
    }

    private static String toAbc(String inp) {
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(inp, " ");
        while (st.hasMoreTokens()) {
            sb.append(map2abc.getOrDefault(st.nextToken(), '?'));
        }
        return sb.toString();


    }

}
