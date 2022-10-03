abstract class Multiplication{

	int mult=0;
	
	public int multiplyNo(int a,int b){
		mult=a*b;
		return mult;
	}

}


class MethodDemo{
	public static void main(String args[]){
	Multiplication mul=new Multiplication();
	
	int result = mul.multiplyNo(10,20);
	System.out.println("Multiply is:" + result);
	}
}



