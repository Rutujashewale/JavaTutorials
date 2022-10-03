class Shapes{
	public void area(){
		System.out.println("Example to find Area:");
	}
	public void area(int r){
		System.out.println("Circle area:" + 3.14*r*r);
		
	}
	public void area(double b,double h){
		System.out.println("Triangle area : " +0.5*b*h);
	}
	
	public void area(int l,int b){
		System.out.println("Rectangle area:" + l*b);
	}
}

class PolymorphismDemo{
	public static void main(String args[]){
		Shapes shape= new Shapes();
		shape.area();
		shape.area(2);
		shape.area(4,6);
		shape.area(2,3);
	}
}