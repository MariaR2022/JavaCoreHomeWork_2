package JavaCoreHomeWork2;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Размер массива некорректный!");
    }
}