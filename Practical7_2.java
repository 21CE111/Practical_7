/*
    Name : Rushit Rabadiya
    ID   : 21CE111
*/
import java.io.*;
import java.util.*;
class Practical7_2 {
    public static void main(String[] args) {
        File file = new
                File("C:\\Users\\hp\\OneDrive\\Documents\\First.txt");
        if (!file.isFile()) {
            System.out.println(file + " is not a file.");
        }
        String[] words;
        try (BufferedReader in = new BufferedReader(new
                FileReader(file))) {
            StringBuilder buffer = new StringBuilder(10000);
            String s;
            while ((s = in.readLine()) != null) {
                buffer.append(s).append("\n");
            }
            words = buffer.toString().split("[0-9]+|\\W+");
        } catch (IOException ex) {
            words = new String[1];
            System.out.println("Error opening file...");
            System.exit(0);
        }
        Map<String, Integer> map = new TreeMap<>();
        for (String word1 : words) {
            String key = word1.toLowerCase();
            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }
        map.forEach((k, v) -> System.out.println(k + "\t" + v));
    }
}
