package qx.leizige.thread.lock.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author leizige
 */
public class CasExample {

	static AtomicInteger num = new AtomicInteger(0);

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {

			Thread t = new Thread(() -> {
				while (num.get() < 1000) {
					System.out.println("thread name:" + Thread.currentThread().getName() + ":" + num	.incrementAndGet());
				}
			});

			t.start();
		}
	}
}
