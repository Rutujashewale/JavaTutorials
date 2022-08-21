class Abstract{
	public static void main(final String args[]){
	
		Final DrawObject line = new Line(10, 20);
		line.draw();
	}
}
	
		abstract class DrawObject {
			int x, y;

			public DrawObject(final int x, final int y) {
			super();
			this.x = x;
			this.y = y;
			}

			void moveTo(final int newX, final int newY) {
				System.out.println(" move GraphicObjects points :: " + newX + " " + newY);
			}

			abstract void draw();

			abstract void resize();
		}
		class Line extends DrawObject {

			public Line(final int x, final int y) {
			super(x, y);
		}

    @Override
		void draw() {
			System.out.println("Draw Line");
		}

    @Override
		void resize() {

		}
	}


