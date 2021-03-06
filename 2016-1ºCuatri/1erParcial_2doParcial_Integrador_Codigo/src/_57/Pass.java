package _57;

public class Pass {
	public static void main(String [] args) {
		int x = 5;
		Pass p = new Pass();
		p.doStuff(x);
		System.out.print(" main x = " + x);
	}
	void doStuff(int x) {
		System.out.print(" doStuff x = " + x++);
	}
}

/*
What is the result?
A. Compilation fails.
B. An exception is thrown at runtime.
C. doStuff x = 6 main x = 6
D. doStuff x = 5 main x = 5			[X]
E. doStuff x = 5 main x = 6
F. doStuff x = 6 main x = 5
*/