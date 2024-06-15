public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java core";
        String search = "          Samsung   ";

        System.out.println("s.length() = " + s.length());

        // Kiểm tra chuỗi có rỗng
        System.out.println("s.isEmpty() = " + s.isEmpty());

        // Dựa chỉ số lấy ký tự
        System.out.println("s.charAt() = " + s.charAt(1));

        // Dựa ký tự lấy chỉ số
        System.out.println("s.indexOf('a') = " + s.indexOf('a'));
        System.out.println("s.lastIndexOf('a') = " + s.lastIndexOf('a'));

        // Loại bỏ khoảng trắng đầu và cuối
        System.out.println("search.trim() = " + search.trim());

        System.out.println("s.concat(search) = " + s.concat(search));

        // Thế chuỗi
        System.out.println("s.replace('a', 'o') = " + s.replace('a', 'o'));

        // Lấy chuỗi
        System.out.println("s.substring(0, 4) = " + s.substring(0, 4));

        System.out.println("s.substring(5) = " + s.substring(5));

        // Tách chuỗi
        String[] words = s.split(" ");
        for (String word:words) {
            System.out.println("word = " + word);
        }
    }
}
