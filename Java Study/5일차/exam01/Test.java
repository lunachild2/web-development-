package exam01;

public class Test {
    public static void main(String[] args) {

        String str = "aBcDeFg";
        String out = "";
        int num;


        for (int i = 0; i < str.length(); i++) {
            num = str.charAt(i);
            if (num >= 97 && num <= 122) {
                out += (char)(num - 32);
            } else if(65 <= num && num <= 90) {
                out += (char)(num + 32);
            }
        }
        System.out.println(out);


    }
}
