package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int a=20;
		System.out.println(a);
		a++;
		System.out.println("after inc"+a);
		++a;
		System.out.println("after pre_inc"+a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		a--;
		System.out.println(a);
		--a;
		System.out.println("after pre_dec"+a);
		
		
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);

	}

}
