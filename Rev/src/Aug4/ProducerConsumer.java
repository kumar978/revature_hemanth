package Aug4;

import java.util.List;
import java.util.ArrayList;

public class ProducerConsumer {
    public static final String EOF = "EOF";
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();

        Thread producerThread = new Thread(new Producer(buffer));
        producerThread.setName("producerThread");

        Thread consumerThread1 = new Thread(new Consumer(buffer));
        consumerThread1.setName("consumerThread1");
        producerThread.start();
        consumerThread1.start();
    }
}
class Producer implements Runnable{
    private List<String> buffer;

    public Producer(List<String> buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        String numbers[] = {"1","2","3"};
        for (String number : numbers){
            buffer.add(number);
            System.out.println(Thread.currentThread().getName()+" added "+number);
        }
        System.out.println(Thread.currentThread().getName()+" added "+ProducerConsumer.EOF);
        buffer.add(ProducerConsumer.EOF);
    }
}
class Consumer implements Runnable{
    private List<String> buffer;

    public Consumer(List<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        while (true){
            if (buffer.isEmpty()){
                continue;
            }
            if (buffer.get(0).equals(ProducerConsumer.EOF)){
                System.out.println(Thread.currentThread().getName()+" exiting.");
                break;
            } else {
                System.out.println(Thread.currentThread().getName()+ " removed " +buffer.remove(0));
            }
        }
    }
}