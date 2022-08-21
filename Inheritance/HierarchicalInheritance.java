class Parent {
	int parentVariable = 5;
}

class Child1 extends Parent {
	int childVariable = 1;
}


class Child2 extends Parent {
	int childVariable = 2;
}


class Child3 extends Parent {
	int childVariable = 3;
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
   
	Child1 child1 = new Child1();
	Child2 child2 = new Child2();
	Child3 child3 = new Child3();

   System.out.println("Parent variable + Child variable of child1 = " + (child1.parentVariable + child1.childVariable));

   System.out.println("Parent variable + Child variable of child2 = " + (child2.parentVariable + child2.childVariable));

   System.out.println("Parent variable + Child variable of child3 = " + (child3.parentVariable + child3.childVariable));
 }

}