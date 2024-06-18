import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args) {
        String path = "src/main/resources/abc.txt";
        byte[] bytes = "Java Core".getBytes(StandardCharsets.UTF_8);
        // ghi thêm
        IOManager.writeFile(path, bytes, true);
        IOManager.writeFile(path, bytes, true);

        //IOManager.writeFile(path, bytes, false); ghi đè

        byte[] ouput = IOManager.readFile(path);
        if (ouput != null) {
            String content = new String(ouput);
            System.out.println("content = " + content);
        }


        Account account = new Account(1, "hungnv", "12345");
        IOManager.writeObject(path, account, false);
        Account savedAccount = (Account) IOManager.readObject(path);
        System.out.println("savedAccount = " + savedAccount);
    }
}
