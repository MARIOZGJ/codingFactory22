package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Διαβάζει απο ένα αρχείο με μορφή δεδομένων
 * country1 city1 city2 city3 ...
 * country2 city2 city3 city4 ...
 *
 * και γράφει κάθε γραμμή σε διαφορετικά output αρχείο.
 *
 * Χρησιμοποιύμε το java.io
 */

public class CitiesIOApp {

    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("C:/tmp");

        if (!dir.exists()) {
            if (!dir.mkdir()) {
                System.err.println("Error in make dir");
                System.exit(1);
            }
        }
        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/cities.txt"))) {
            while ((line = bf.readLine()) != null) {
                cities = line.split(" + ");
                switch (cities[0]) {
                 case "Greece":
                     File grfile = new File(dir + "/" + cities[0].substring(0, 2).toLowerCase() + ".txt");
                     PrintStream gr = new PrintStream(grfile, StandardCharsets.UTF_8);
                     print(gr, "GR Cities");
                     print(gr, cities);
                     break;
                    case "USA":

                        File usafile = new File(dir + "/" +cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream usa = new PrintStream(usafile, StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print(usa, cities);
                        break;
                    case "Germany":
                        File defile = new File(dir + "/" +cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream de = new PrintStream(defile, StandardCharsets.UTF_8);
                        print(de, "de Cities");
                        print(de, cities);
                        break;
                    default:
                        System.out.println("Error in Cities");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void print(PrintStream ps ,String message) {
        ps.println(message);
    }

    public static void print(PrintStream ps, String[] tokens) {
        for (int i =1; i < tokens.length; i++) {
            ps.print(tokens[i] + " ");
        }
    }
}
