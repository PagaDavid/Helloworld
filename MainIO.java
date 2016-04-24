import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainIO {

	
	
	final static int numTimes = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Result result = JUnitCore.runClasses(unitTestIO.class);
		
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }*/
		
		TestIO tio = new TestIO();
		
		for (int i = 0; i<numTimes; i++){
				/*mio.rawByteIO(true);
				mio.rawByteIO(false);*/
				tio.rawByteIO();
				tio.ByteIO();			
			}
		
			long start_time_raw = System.currentTimeMillis();
			
			//ArrayList<Thread> threads = new ArrayList<Thread>();
					
			for (int i = 0; i<numTimes; i++){
				Thread t = new Thread(tio);
				//threads.add(t);
			    t.start();
			    //tio.rawByteIO();
			}
			
			/*try{
				for (int i = 0; i<threads.size(); i++){
					threads.get(i).join();
				}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}*/
				
			System.out.println("Elapsed time rawByte: " + (System.currentTimeMillis() - start_time_raw) + " ms");
		
			long start_time = System.currentTimeMillis();
			
			for (int i = 0; i<numTimes; i++){
				tio.ByteIO();
				//mio.rawByteIO(false);
			}
			
			System.out.println("Elapsed time Byte: " + (System.currentTimeMillis() - start_time) + " ms");
			
			System.out.println("Test terminated.");
			
	}	
			

public static class unitTestIO{
	
	public unitTestIO(){
		System.out.println("Start unit test ... ");
	}
	
	TestIO tio = new TestIO();
	
	@Before
	public void warmUp(){
		System.out.println("Start warmup ... ");
		for (int i = 0; i<numTimes; i++){
			/*mio.rawByteIO(true);
			mio.rawByteIO(false);*/
			tio.rawByteIO();
			tio.ByteIO();			
		}
	}
	
	@After
	public void tearDown(){
		System.out.println("Test terminated.");
	}
	
	@Test //(expected=java.lang.Exception.class)
	public void testRawByteIO(){
		
		long start_time_raw = System.currentTimeMillis();
		
		for (int i = 0; i<numTimes; i++){
			tio.rawByteIO();
		}
			
		System.out.println("Elapsed time rawByte: " + (System.currentTimeMillis() - start_time_raw) + " ms");
		
	}
	
	@Test //(timeout=100)
	public void testByteIO(){
		
		long start_time = System.currentTimeMillis();
		
		for (int i = 0; i<numTimes; i++){
			tio.ByteIO();
			//mio.rawByteIO(false);
		}
		
		System.out.println("Elapsed time Byte: " + (System.currentTimeMillis() - start_time) + " ms");
	}
	
}

}
		



