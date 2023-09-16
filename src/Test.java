import Domain.Record;

import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("save/record.data");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Record> list = (ArrayList<Record>)ois.readObject();
        for (Record record : list) {
            System.out.println(record.getTitle() + "we" + record.getContent());
        }
    }
}
