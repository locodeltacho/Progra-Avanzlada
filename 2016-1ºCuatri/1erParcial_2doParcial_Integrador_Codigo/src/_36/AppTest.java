package _36;

public class AppTest {
	public int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppTest(1).go();
	}
	public AppTest(int a) {
		super();
		this.a = a;
	}
	public void go() {
		String o = "";
		z:
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 2; y++) {
				if(x==1) break;
					if(x==2 && y==1) break z;
						o = o + x + y;
			}
		}
	System.out.println(o);
	}
}

/*
What is the result when the go() method is invoked?
A. 00
B. 0001
C. 000120						[X]
D. 00012021
E. Compilation fails.
F. An exception is thrown at runtime.
 */

