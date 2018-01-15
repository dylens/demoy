package fory.play;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlayK {

    private static String encode16(byte[] input) {
        StringBuilder sb = new StringBuilder();
        for (byte g : input) {
            int h = g & 0xF;
            int i = g >> 4 & 0xF;
            sb.append(Integer.toHexString(h)).append(Integer.toHexString(i));
        }
        return sb.toString();
    }

    private static String decode16(String input) {
        Pattern p = Pattern.compile("^(1+)");
        byte[] bs2 = new byte[input.length() / 2];
        int index = 0;
        for (int i = 0; i < input.length(); ) {
            Matcher m = p.matcher(StringUtils.leftPad(Integer.toBinaryString(Integer.parseInt(input.substring(i + 1, i + 2), 16)), 4, "0"));
            if (m.find()) {
                String n = m.group(0);
                int length = n.length();
                for (int j = 0; j < length * 2; j += 2) {
                    bs2[index] = binaryToByte(input, i + j, i + j + 1);
                    index++;
                }
                i += length * 2;
            } else {
                bs2[index] = binaryToByte(input, i, i + 1);
                index++;
                i += 2;
            }
        }
        return new String(bs2);
    }

    private static byte binaryToByte(String input, int i, int j) {
        int x1 = Integer.valueOf(input.charAt(i + j) + "", 16);
        int x2 = Integer.valueOf(input.charAt(i + j + 1) + "", 16);
        return (byte) ((x2 << 4) + x1);
    }

    public static void main(String[] args) {
        String encoded = encode16("TestÀ´ÏÂÆå".getBytes());
        System.out.println(encoded);

        String decoded = decode16(encoded);
        System.out.println(decoded);
    }
}