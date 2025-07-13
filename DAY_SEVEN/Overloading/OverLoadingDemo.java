public class OverLoadingDemo {

	public static void main(String[] args) {

		Point p = new Point(); // default
		System.out.println(p);

		Point p1 = new Point(20.09f, 23.45f);
		System.out.println(p1);

		Point p2 = new Point(20, 30);
		System.out.println(p2);
	}

}