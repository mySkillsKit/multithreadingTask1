public class Main {

    public static void main(String[] args) {

        // Главная группа потоков
        ThreadGroup mainGroup = new ThreadGroup("main group");

        //Создание 4 потоков, каждый из которых имеет свое имя
        System.out.println("Создаю потоки...");
        final Thread thread1 = new MyThread(mainGroup, "поток 1");
        final Thread thread2 = new MyThread(mainGroup, "поток 2");
        final Thread thread3 = new MyThread(mainGroup, "поток 3");
        final Thread thread4 = new MyThread(mainGroup, "поток 4");

        //Запуск потоков
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Завершаем все потоки одним вызовом
        try {
            Thread.sleep(15000); //15 секунд
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();
    }
}
