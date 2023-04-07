package sky.pro.java.course2.homework2;

public interface ITrailer {
    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
