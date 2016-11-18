package fory.xml;

import java.io.*;

public class ReadFromFileToString {

    public static void main(String[] args) {
        String string = readString();
        System.out.println(string);
//        writeString(string);
    }

    private static String readString() {
        int len = 0;
        StringBuilder str = new StringBuilder("");
        File file = new File("D://s.xml");
        try {
            FileInputStream is = new FileInputStream(file);
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = in.readLine()) != null) {
                if (len != 0) {
                    str.append("\r\n").append(line);
                } else {
                    str.append(line);
                }
                len++;
            }
            in.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    private static void writeString(String s) {
        try {
            FileOutputStream out = new FileOutputStream(new File("D://new.xml"));
            out.write(s.getBytes());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
