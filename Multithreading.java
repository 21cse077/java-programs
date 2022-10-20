package multithreading;
 import java.util.LinkedList;
public class Multithreading {
    public static void main(String[] args)
        throws InterruptedException
    {
        final PC p = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    p.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    p.consume();
                }
                catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    public static class PC {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;
        public void produce() throws InterruptedException
        {
            int value = 0;
            while (true) {
                synchronized (this)
                {
                    while (list.size() == capacity)
                        wait();
 
                    System.out.println("Producer produced "
                                       + value);
                    break;
    }
            }
            }
         public void consume() throws InterruptedException
         {
            int value = 0;
            while (true) {
                synchronized (this)
                {
                    while (list.size() == capacity)
                        wait();
 
                    System.out.println("consumer brought "
                                       + value);
                  break;
    }
            }
            }
    }
}

