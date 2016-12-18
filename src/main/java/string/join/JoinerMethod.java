package string.join;

public class JoinerMethod {

	public static void main(String[] args) {

		String stooges = String.join(" and ", "Larry", "Curly", "Moe");
		System.out.println(stooges);

		String[] states = {"CA", "OR", "VA"};
		String stateList = String.join(",", states);

		System.out.println(stateList);
	}		
}
