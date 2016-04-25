import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;

public class ComputationObject extends ScheduledThreadPoolExecutor {
	
	Semaphore s = new Semaphore(1);
	public ComputationObject(int corePoolSize) {
		super(corePoolSize);
		// TODO Auto-generated constructor stub
	}

	public class Computation implements Callable<Integer> {
		
		

		@Override
		public Integer call() throws Exception {
			s.acquire();
			double a = 0;
			int n = new Random(System.currentTimeMillis()).nextInt() % 100000;
			//System.out.println(n);
			for (int i = 0; i < Math.abs(n); i++)
				a = Math.tan(new Random(System.currentTimeMillis()).nextInt());
			//System.out.println(a);

			s.release();
			return 1;
		}

	}
}