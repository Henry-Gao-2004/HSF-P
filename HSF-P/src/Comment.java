import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Comment {
	String text;
	int val=0;
	
	public Comment (String text) {
		this.text=text;
		setVal();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getVal() {
		return val;
	}

	public void setVal() {
		if (text==null)val=0;
		if (checkNegative())
			val=Integer.MIN_VALUE;
		
	}
	
	public boolean checkNegative () {
		Scanner input = new Scanner(getResourceAsStream("negativeWords.txt"));
		while(input.hasNextLine()) {
			String [] words=input.nextLine().split(" ");
			boolean negative=true;
			for (String word:words) 
				if (!text.contains(word))negative=false;
			input.close();
			if (negative)return true;
		}
		return false;
	}
	
	public boolean checkPositive() {
		return true;
	}
	
	//this method returns the resource
	private URL getResource(String path) {
		System.out.println("Get resource at "+path);
		return Comment.class.getResource(path);
	}
	
	//this methods returns the resources as a stream (in order to read file)
	private InputStream getResourceAsStream(String path) {
		return Comment.class.getClassLoader().getResourceAsStream(path);
	}
}
