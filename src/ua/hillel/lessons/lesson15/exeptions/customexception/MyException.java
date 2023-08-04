package ua.hillel.lessons.lesson15.exeptions.customexception;

public class MyException extends Exception {
    private final int detail;

    public MyException(String message, int detail) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
