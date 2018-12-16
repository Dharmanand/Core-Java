package com.kd.threads;

public class ThreeThreadsPrintNoAlternatively {

	static boolean exit = false;
	Object monitor = new Object();
    Integer number = new Integer(1);

    public static void main(String[] args) {
    	ThreeThreadsPrintNoAlternatively tnp = new ThreeThreadsPrintNoAlternatively();
        Thread t1 = new Thread(tnp.new Printer(1, 3));
        Thread t2 = new Thread(tnp.new Printer(2, 3));
        Thread t3 = new Thread(tnp.new Printer(0, 3));

        t3.start();
        t1.start();
        t2.start();
    }

    class Printer implements Runnable {

        int threadId;
        int numOfThreads;

        public Printer(int id, int nubOfThreads) {
            threadId = id;
            this.numOfThreads = nubOfThreads;
        }

        public void run() {
            print();
        }

        private void print() {
            try {
                while (!exit) {
                    Thread.sleep(10l);
                    synchronized (monitor) {
                        if (number % numOfThreads != threadId) {
                            monitor.wait();
                        } else {
                            System.out.println("ThreadId [" + (threadId == 0 ? 3 : threadId)
                                    + "] printing -->"
                                    + number++);
                            monitor.notifyAll();
                        }
                        if(number >= 100) {
                        	monitor.notifyAll();
                        	Thread.currentThread().stop();
                        	exit = true;
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

       }

}
