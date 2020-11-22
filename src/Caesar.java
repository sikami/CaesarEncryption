import javafx.application.Application;
import javafx.stage.Stage;

public class Caesar {

    public static void main(String[] args) {
        Encrypt encrypt = new Encrypt();
        encrypt.addKey(10);
        encrypt.addWords("");
        String result = encrypt.encryptNow();
        System.out.println(result);
    }
//    @Override
//    public void start(Stage stage) throws Exception {
//
//    }
}
