package Concurrency;

import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleLaunch {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				for (char ch : "I am learning...".toCharArray()) {
					System.out.print(ch);
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		};

		Runnable task2 = new Runnable() {
			@Override
			public void run() {
				for (char ch : "I am learning...".toCharArray()) {
					System.out.print(ch);
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		};

		Callable<String> task3 = new Callable<String>() {
			public String call() throws Exception {
				Thread.sleep(10000);
				return LocalTime.now().toString();
			}
		};

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(task1);
		executor.execute(task2);
		Future<String> time = (Future<String>)executor.submit(task3);
		
		System.out.println(time.get());
		
		executor.shutdown();
		
	}
}
