abstract class Sum{
	public abstract int sumOfTwo(int a1,int a2);
	public abstract int sumOfThree(int a1,int a2,int a3);

	
}
class AbstractDemo1 extends Sum{
	public int sumOfTwo(int a1,int a2){
		return a1+a2;
	}
	public int sumOfThree(int a1,int a2,int a3){
		return a1+a2+a3;
	}
	
	public static void main(String args[]){
		Sum sum=new AbstractDemo1();
		System.out.println("Addition of two no's :" + sum.sumOfTwo(5,5));
		System.out.println("Addition of three no's :" + sum.sumOfThree(5,5,5));
		
	}
}
