import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private String username;
    // Không lưu thuộc tính
    private transient String password;

    public Account(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
