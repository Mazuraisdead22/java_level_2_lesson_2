package lesson_2;

public class MyArrayDataException extends Throwable {
    public String i;
    public String j;

    public class MyArraySizeException extends Exception {
    public MyArraySizeException(String i, String j) {
        super("Тут ошибка:" + i + "||" + j);
    }
    }
}
