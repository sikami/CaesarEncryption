import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Encrypt {
   private int key;
   private String words;

    public Encrypt() {
        this.key = 0;
        this.words = "";
    }
    public void addKey(int key) {
        while (key > 25) {
            key -= 26;
        }
        this.key = key;
    }

    public void addWords(String words) {
        this.words = words;
    }

    public String encryptNow() {
        String wordToEncrypt = this.words;
        StringBuilder sb = new StringBuilder();
        char[] chars = wordToEncrypt.toCharArray();
        for (char ch: chars) {
            if (isLowerCase(ch)) {
                int num = ch + this.key;
                if (num > 122) {
                    num -= 26;
                }
                sb.append((char) num);
            } else if (isUpperCase(ch)) {
                int num = ch + this.key;
                if (num > 90) {
                    num -= 26;
                }
                sb.append((char) num);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
