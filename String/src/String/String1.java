package String;

public class String1 {
	public static void main(String[] args) {
		String[] clubs = { "MU", "Mancity", "Liverpool" };
		clubs[0] = "Ansenal";
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (int i = 0; i < cars.length; ++i) {
			System.err.println(cars[i]);
		}
	}
}
