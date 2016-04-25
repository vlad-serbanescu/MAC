import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import jdk.nashorn.internal.ir.FunctionCall;

public class FutureTest {
	//static int counter=0;
	//static List<ForkJoinTask<Integer>> methods = new CopyOnWriteArrayList<ForkJoinTask<Integer>>();
	//static ForkJoinPool myWorker = new ForkJoinPool(1, ForkJoinPool.defaultForkJoinWorkerThreadFactory, null, false);
	//static Semaphore s = new Semaphore(1);
	
	
	/*public int call1() throws Exception {
		int selectedLeader = counter, limit=20;
		
		counter++;
		
		Random r = new Random(System.currentTimeMillis());
		//Math.tan(r.nextDouble());
		System.out.println(selectedLeader);
		
		
		//s.release();
		
		
				
		int beforeMe = methods.get(selectedLeader+10).get();		
		//s.acquire();
		System.out.println(beforeMe + " l= "+selectedLeader);
		selectedLeader = r.nextInt(limit);
		
		
		
		return selectedLeader;
	
	}
	
	public int call2() throws Exception {
		
		int selectedLeader = counter, limit=20;
		counter++;
		Random r = new Random(System.currentTimeMillis());
		Math.tan(r.nextDouble());
		System.out.println(selectedLeader);
		//selectedLeader = r.nextInt(limit);
		
		
		return selectedLeader;
	
	}
	*/
	
	
	public static void main(String[] args) {
		
		Random r = new Random(System.currentTimeMillis());
		int n = Integer.parseInt(args[0]);
		int o = Integer.parseInt(args[1]);
		StackerObject main = new StackerObject(o==1?1:n);
		
		for(int i=0;i<Integer.parseInt(args[0]);i++){
			main.submit(main.new Stacker(r.nextInt(15), i));
		}
		main.shutdown();
		System.out.println(1);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//FutureTest test = new FutureTest();
		
		//List<Integer> results = new LinkedList<Integer>();
		
		//for (int i = 0; i < 10; i++) {
			
			//methods.add();
			
			/*methods.add(myWorker.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					return FutureTest.call1();
					
				}
				
			}));*/
		//}
		
		//for (int i = 0; i < 10; i++) {
			
			//methods.add(new Computation());
			
			/*methods.add(myWorker.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					return FutureTest.call2();
				}
				
			}));*/
		//}
		
		//System.out.println(methods.size());
		//Collections.reverse(methods);
		
		/*for (ForkJoinTask<Integer> m : methods) {
			myWorker.submit(m);
		}*/
		
				//System.out.println(results);
		/*for (ForkJoinTask<Integer> f : methods) {
			try {
				f.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
}
