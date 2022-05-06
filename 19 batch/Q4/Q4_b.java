
 /**
  *         Adjacency Matrix
  * A  B  C  D  E  F  G  H  J
  A 0  1  1  0  0  0  0  0  0
  B 1  0  0  1  0  0  0  0  0
  C 1  0  0  0  1  1  0  0  0
  D 0  1  0  0  0  0  1  1  0
  E 0  0  1  0  0  0  0  1  1
  F 0  0  1  0  0  0  0  0  1
  G 0  0  0  1  0  0  0  1  0
  H 0  0  0  1  1  0  1  0  1
  J 0  0  0  0  1  1  0  1  0
  */

public class Q4_b {
	int size;
	String[] vertices;
	boolean[][] a;
	public Q4_b(String[] args) {
		size=args.length;
		vertices=new String[size];
		System.arraycopy(args, 0, vertices, 0, size);
		a=new boolean[size][args.length];
	}
	public void add(String v,String w) {
		int i=index(v);
		int j=index(w);
		a[i][j]=a[j][i]=true;
	}
	private int index(String s) {
		for(int i=0;i<size;i++) {
			if(vertices[i].equals(s))
				return i;
		}
		return a.length;
	}

	
	public String toString(){
		if(size==0)return "()";
		StringBuffer buf=new StringBuffer("{"+vertex(0));
		for (int i = 1; i < size; i++) {
			buf.append(", "+vertex(i));
		}
		return buf+"}";
	}
	private String vertex(int i){
			StringBuffer buf=new StringBuffer(vertices[i]+":");
			for (int j = 0; j <size; j++) {
				if (a[i][j]) {
					buf.append(" "+vertices[j]);
				}
				
				}
			return buf+"";
	}
	public static void main(String[] args) {
		String[] arg= {"A","B","C","D","E","F","G","H","J"};
		Q4_b Q4_b=new Q4_b(arg);
		Q4_b.add("A" , "B");
		Q4_b.add("A" , "C");
		Q4_b.add("B" , "D");
		Q4_b.add("C" , "E");
		Q4_b.add("C" , "F");
        Q4_b.add("D" , "G");
        Q4_b.add("D" , "H");
        Q4_b.add("E" , "H");
        Q4_b.add("E" , "J");
        Q4_b.add("G" , "H");
        Q4_b.add("H" , "J");
        Q4_b.add("J" , "F");
        Q4_b.add("F" , "C");
		System.out.println(Q4_b);
	}
}