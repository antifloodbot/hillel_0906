package ua.hillel.lessons.lesson7.switchinjava;

public class SwitchJava12 {
    public static void main(String[] args) {
        int count = 2;
        int value;
        switch (count) {
            case 1:
                value = 32;
                break;
            case 2:
                value = 44;
                break;
            case 3:
                value = 78;
                break;
            default:
                value = 0;

        }
    }
}
/*    public static void modifier2Switch() {
        int count = 2;
        int value = switch (count) {
            case 1, 4, 7 -> 32;
            case 2 -> 44;
            case 3 -> 78;
            default -> 0;
        };
    }

    public static void modifierSwitch() {
        int count = 2;
        int value = switch (count) {
            case 1 -> 32;
            case 2 -> 44;
            case 3 -> 78;
            default -> 0;
        };
    }
}*/
