package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/23.
 * JavaSE_20171.
 */
public class User {
    private String username;
    private String password;
    private String gender;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return "man";
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        User user = new User();
        user.getGender();
        user.setGender("women");
        System.out.println(user.getGender());
        System.out.println(user.setGender("women"));
    }


}

