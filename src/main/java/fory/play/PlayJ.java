package fory.play;

public class PlayJ {

    public static void main(String[] args) throws InterruptedException {
//        int indexOfComma = StringUtils.indexOf("10923", ",");
//        if(indexOfComma<0){
//            return "10923";
//        }
//        return;
//        System.out.println(StringUtils.substring("10923", 0, ));
//        System.out.println(StringUtils.substring("10923,57849", 0, StringUtils.indexOf("10923,57849", ",")));
//
//
//        String ZIP_FLAG = String.valueOf(new char[]{Character.MIN_VALUE, Character.MAX_VALUE});
//        System.out.println(ZIP_FLAG);
//
//        StringBuilder nos = new StringBuilder();
//        StringBuilder builder = nos.append("123").append(";").append("234").append(";");
//        StringBuilder result = builder.deleteCharAt(builder.length() - 1);
//        System.out.println(result);
//
//
//        String s = StringUtils.replace("GOOD| DA | Y", "|", ".");
//        System.out.println(s);
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        System.out.println(a < b && b > c || c < a);//true && false || false, false
//        System.out.println(a < b || b < c && c < a);//true || true && false, true
    }

    private static class SingletonHolder {
        private static final PlayJ INSTANCE = new PlayJ();
    }

    private PlayJ() {
    }

    public static PlayJ getInstance() {
        return SingletonHolder.INSTANCE;
    }
}