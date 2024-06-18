import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        // Создаем несколько потоков и добавляем в них группы
        Stream stream1 = new Stream();
        stream1.addGroup(new Group("Group 1"));
        stream1.addGroup(new Group("Group 2"));

        Stream stream2 = new Stream();
        stream2.addGroup(new Group("Group 3"));

        // Создаем список потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        // Сортируем список потоков
        controller.sortStreams(streams);

        // Выводим отсортированные потоки
        for (Stream stream : streams) {
            System.out.println(stream);
        }
    }
}
