package com.devin.programdesign.thread;

public class ThreadLock {
//wait()和notify()一系列的方法，是属于对象的，不是属于线程的。
	public static void main(String[] args) {
		final Object obj = new Object();
		Thread th1 = new Thread() {
			public void run() {
				synchronized (obj) {
					System.out.println("T1 Start!");
					try {
						obj.wait();
					} catch (InterruptedException err) {
						System.out.println(err.getMessage());
					}
					System.out.println("T1 END");
				}
				;
			}
		};

		Thread th2 = new Thread() {
			public void run() {
				synchronized (obj) {
					System.out.println("T2 Start!");
					obj.notify();
					System.out.println("T2 END");
				};
				
			}
		};
		
		th1.start();
		th2.start();
	}

}
