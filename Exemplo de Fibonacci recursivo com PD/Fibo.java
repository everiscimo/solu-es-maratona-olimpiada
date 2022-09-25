import java.util.HashMap;

public class Fibo {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(fibo(50));
		System.out.println("TEMPO -> "+(System.currentTimeMillis()-time));
	}
	
	static HashMap<Integer, Long> map = new HashMap<Integer,Long>();
	
	static {
		map.put(1, 1l);
		map.put(2, 1l);
		map.put(3, 2l);
		map.put(4, 3l);
	}
	
	
	public static long fibo(int n) {
		//1 1 2 3 5 8(ant+antDoant)
		if(map.get(n)!=null) {
			return map.get(n);
		}
		map.put(n, fibo(n-1) + fibo(n-2));
		return map.get(n);
	}
	
	public static int fatorial(int n) {     
		if(n<2) {							
			return 1;
		}
		return n * fatorial(n-1);			
	}
	

	
}
