package practise;

public class ObjectPracNode {
	private int x;
	private int y;
	
	public ObjectPracNode(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double dist( ObjectPracNode n) {
		double dx=this.getX()-n.getX();
		double dy=this.getY()-n.getY();
		return Math.sqrt((dx*dx)+(dy*dy));
	}
	
 	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

	// I am so good now with tech 

	public static void main(String[] args) {
		ObjectPracNode n1 = new ObjectPracNode(2, 3);
		ObjectPracNode n2 = new ObjectPracNode(5, 12);
       System.out.println(n2.dist(n1));

	}

}
