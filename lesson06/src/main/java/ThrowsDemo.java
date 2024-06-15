import java.io.IOException;

public class ThrowsDemo {
    // Throws lan truyền ngoại lệ
    // Check Exception phải bắt xử lý ngoại lệ

    public static void main(String[] args) {
        try {
            String content = readFile();
            System.out.println(content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String readFile() throws IOException {
        throw new IOException("File không ton tại");
    }
}
