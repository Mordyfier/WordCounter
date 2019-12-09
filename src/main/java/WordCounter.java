import java.util.*;
import java.io.*;
import java.util.List;

public class WordCounter {
    public static void main(String[] args) throws Exception {
        String filename = "sample.txt";
        if (args.length > 0) {
            filename = args[0];
        }
        Scanner scanner = new Scanner(new File(filename));
        BufferedWriter out = new BufferedWriter(new FileWriter("dataSet.txt"));
        HashMap<String, Integer> hm = counter(scanner);
        scanner.close();

        hm = sort(hm);
        writeToFile(hm, out);
        out.close();
    }
    public static HashMap<String, Integer> counter(Scanner scanner) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        String nextWord;
        Integer current;

        while (scanner.hasNext()) {
            nextWord = scanner.next().replaceAll("\\p{Punct}", "").toLowerCase();
            if (hm.containsKey(nextWord)) {
                current = hm.get(nextWord);
                hm.put(nextWord, ++current);
            } else hm.put(nextWord, 1);
        }
        return hm;
    }
    // method to sort hashmap by values
    public static HashMap<String, Integer> sort(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
        // Sort the list
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public static void writeToFile(HashMap<String, Integer> hm, BufferedWriter out) throws Exception {
        for (String s : hm.keySet()) {
            System.out.println(hm.get(s) + ": " + s);
            out.write(hm.get(s) + ": " + s);
            out.newLine();
        }
        System.out.println("\nTotal words: " + hm.size());
    }
}