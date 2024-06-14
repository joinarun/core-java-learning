package com.cisco.training.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadDemo {

	public static void main(String[] args) throws Exception {
		//byExtendingThreadClass();
		//byImplementingRunnable();
		//usingThreadPoolAndRunnable();
		usingThreadPoolAndCallable();
	}

	private static void usingThreadPoolAndCallable() throws Exception {
		ExecutorService pool = Executors.newFixedThreadPool(4);
		
		System.out.println("About to begin in "+Thread.currentThread().getName());
		long start = System.currentTimeMillis();
		PrimeCounterCallableTask task1 = new PrimeCounterCallableTask(1, 140_000);
		PrimeCounterCallableTask task2 = new PrimeCounterCallableTask(140_001, 200_000);
		
		Future<Long> f1 = pool.submit(task1);
		Future<Long> f2 = pool.submit(task2);
		
		
		long count = f1.get() + f2.get();
		
		long stop = System.currentTimeMillis();
		System.out.println("Total Primes: "+count+" . Took "+(stop - start)+" ms.");
		pool.shutdown();
	}

	
	
	private static void usingThreadPoolAndRunnable() throws Exception {
		ExecutorService pool = Executors.newFixedThreadPool(4);
		
		System.out.println("About to begin in "+Thread.currentThread().getName());
		long start = System.currentTimeMillis();
		
		PrimeCounterTask task1 = new PrimeCounterTask(1, 140_000);
		PrimeCounterTask task2 = new PrimeCounterTask(140_001, 200_000);
		
		pool.execute(task1);
		pool.execute(task2);
		
		pool.shutdown();
		pool.awaitTermination(100, TimeUnit.SECONDS);
		
		long count = task1.getCount() + task2.getCount();
		
		long stop = System.currentTimeMillis();
		System.out.println("Total Primes: "+count+" . Took "+(stop - start)+" ms.");
	}

	private static void byImplementingRunnable() throws Exception {
		System.out.println("About to begin in "+Thread.currentThread().getName());
		long start = System.currentTimeMillis();
		
		PrimeCounterTask task1 = new PrimeCounterTask(1, 140_000);
		PrimeCounterTask task2 = new PrimeCounterTask(140_001, 200_000);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		long count = task1.getCount() + task2.getCount();
		
		long stop = System.currentTimeMillis();
		System.out.println("Total Primes: "+count+" . Took "+(stop - start)+" ms.");
	}

	private static void byExtendingThreadClass() throws Exception {
		System.out.println("About to begin in "+Thread.currentThread().getName());
		long start = System.currentTimeMillis();
		
		PrimeCounterThread t1 = new PrimeCounterThread(1, 150_000);
		PrimeCounterThread t2 = new PrimeCounterThread(150_001, 200_000);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		long count = t1.getCount() + t2.getCount();
		
		long stop = System.currentTimeMillis();
		System.out.println("Total Primes: "+count+" . Took "+(stop - start)+" ms.");
	}

}
