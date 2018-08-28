package hd;

public class DigitalPredictorImpl implements DigitalPredictor {

    int[] numIndex = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3};

    @Override
    public String predict(String input) {
        if (input == null) {
            return null;
        }
        if (input.equals("")) {
            return "";
        }
        if (input.length() == 1) {
            return input;
        }
        return merge(input.toCharArray(), input.length()) + "";
    }

    private char merge(char[] chars, int length) {
        if (length == 1) {
            return chars[0];
        }
        for (int i = 0; i < length - 1; i++) {
            int a = numIndex[chars[i]];
            int b = numIndex[chars[i + 1]];
            if (a + b == 2) {
                chars[i] = 49;//1
            } else if (a + b == 3) {
                chars[i] = 51;//3
            } else if (a + b == 4) {
                chars[i] = 50;//2
            } else if (a + b == 5) {
                chars[i] = 49;//1
            } else if (a + b == 6) {
                chars[i] = 51;//3
            }
        }
        return merge(chars, length - 1);
    }
}