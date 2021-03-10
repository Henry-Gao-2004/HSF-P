import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Comment c=new Comment(input.nextLine());
		System.out.println(c.getVal());
	}
}
