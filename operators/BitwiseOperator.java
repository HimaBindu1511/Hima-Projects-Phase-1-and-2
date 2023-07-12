package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a=30;
		int b=20;
		int c;
		if((a==30) & (b==20)) {
		System.out.println("bitwise AND is true");
		}
		if((a==30) | (b==20)) {
		System.out.println("inclusive OR is true");
		}
		if((a==30) ^ (b==20)) {
		System.out.println("exclusive OR is true ");
		}
		c=a<<1;
		System.out.println("after leftshift"+c);
		c=a>>1;
		System.out.println("after rightshift"+c);

	}

}
