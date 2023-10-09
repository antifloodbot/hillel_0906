package lesson31;

public class UserForReg {

    String email;
    String password;

    public UserForReg(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserForReg(String email) {
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}