public class TryCatchFinallyDemo {
    // Chỉ xử lý nhánh exception
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int x = 1;
            int y = 0;
            // System.out.println(x / y);

            // NullPointerException
            // String s = null;
            // System.out.println(s.length());

            // ArrayIndexOutOfBoundsException
            int[] array = {1, 2, 3};
            // System.out.println(array[100]);

            // Exception
            throw new Exception("Ngoại lệ không xác định");

            // Exception thằng con trước rồi bắt thằng bố
        } catch (ArithmeticException exception) {
            System.out.println("Không thể chia cho 0");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Đã có lỗi, vui lòng thử lại sau");
        } finally {
            System.out.println("Khối finally luôn được gọi");
        }

        // try catch
        // try finally
        // try catch finally

    }
}
