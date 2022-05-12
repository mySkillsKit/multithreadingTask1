class MyThread extends Thread {

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я "+ Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException exc) {

        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }
}
