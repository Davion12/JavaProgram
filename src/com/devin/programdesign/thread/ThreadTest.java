package com.devin.programdesign.thread;

//创建线程的方法
public class ThreadTest extends Thread {
	static int i = 0;

	public static void main(String[] args) {
		ThreadTest thread = new ThreadTest();
		thread.start();
		ThreadTest thread1 = new ThreadTest();
		thread1.start();
		ThreadTest thread2 = new ThreadTest();
		thread2.start();
	}
//线程保护关键字synchronized的使用
	@Override
	public void run() {

		// TODO Auto-generated method stub
		try {
			synchronized (this) {
				Thread.sleep(100);
				System.out.println(i++);
				System.out.println("this thread id is " + Thread.currentThread().getId());
			}
		} catch (InterruptedException error) {
			System.out.println(error.getMessage());
		}
		
	}

}
