
public class FactorPolynomial {
	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
		int A=(int)(Math.random()*10)+1;
		int B=(int)(Math.random()*10)+1;
		int C=(int)(Math.random()*10)+1;
		int D=(int)(Math.random()*10)+1;
		int mask=(int)(Math.random()*16);
		if (mask==(mask&1))A*=-1;
		if (mask==(mask&2))B*=-1;
		if (mask==(mask&4))C*=-1;
		if (mask==(mask&8))D*=-1;
		System.out.println("Question: ("+A+"x"+(C<0?C:"+"+C)+")("+B+"x"+(D<0?D:"+"+D)+")");
		System.out.println("Answer: "+(A*B)+"x2"+((A*C+B*D)<0?(A*C+B*D):"+"+(A*C+B*D))+"x"+(C*D<0?C*D:"+"+C*D));
		}
	}
}
