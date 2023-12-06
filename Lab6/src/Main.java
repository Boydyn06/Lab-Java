import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static List<MyData> readDataFromCSV(String filePath) throws IOException {
        List<MyData> dataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                MyData myData = new MyData(data[0], data[1], data[2]);
                dataList.add(myData);
            }
        }

        return dataList;
    }

    public static void main(String[] args) {
        try {
            String filePath = "C:\\Users\\Bogdan\\OneDrive\\Desktop\\Lab3\\Lab7\\src";
            List<MyData> dataList = readDataFromCSV(filePath);
            // Sorting by Title using Comparable
            Collections.sort(dataList);
            printList("Sorted by Title (Comparable)", dataList);
            // Sorting by Title using Comparator
            Comparator<MyData> titleComparator = new TitleComparator();
            Collections.sort(dataList, titleComparator);
            printList("Sorted by Title (Comparator)", dataList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printList(String message, List<MyData> dataList) {
        System.out.println(message);
        for (MyData data : dataList) {
            System.out.println(data);
        }
        System.out.println();
    }
}