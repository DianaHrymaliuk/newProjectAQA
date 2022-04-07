package lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Les7 {
    public static void main(String[] args) throws IOException {
        String[] header = "Value 1; Value 2; Value 3".split(";");
        int[][] data = {{2, 6, 4}, {1, 3, 4}};
        try (Writer writer = new PrintWriter("newfile.csv")) {
            String sb = Arrays.toString(header) +
                    ";" +
                    Arrays.deepToString(data);
            writer.write(sb);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        Les7 Appdata = new Les7();
        Appdata.save();
    }

    public void save() {
        List<List<String>> record = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("newfile.csv"))) {
            while (scanner.hasNextLine()) {
                record.add(line(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(record);
    }

    public List<String> line(String line) {
        List<String> a = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(";");
            while (rowScanner.hasNext()) {
                a.add(rowScanner.next());
            }
        }
        return a;
    }

}
