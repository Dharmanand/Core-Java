package com.kd.threads;

class UserThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("This is a user thread.....");
    }
}
 
class DaemonThread extends Thread
{
    public DaemonThread()
    {
        setDaemon(true);
    }
 
    @Override
    public void run()
    {
        for(int i = 0; i < 1000; i++)
        {
            System.out.println("This is daemon thread....."+i);
        }
    }
}


public class DaemonAndUserThread {

	public static void main(String[] args) {

		DaemonThread daemon = new DaemonThread();   //Creating the DaemonThread
		 
        daemon.start();                 //Starting the daemon thread
 
        UserThread userThread = new UserThread();   //Creating the UserThread
 
        userThread.start();          //Starting the user thread

	}

}
