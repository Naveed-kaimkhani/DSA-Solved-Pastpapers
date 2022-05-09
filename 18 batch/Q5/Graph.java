/**
 * 
 * 
 * 
 * 
 * 
 */


public class Graph {
	int size;
	String[] vertices;
	boolean[][] a;
	public Graph(String[] args) {
		size=args.length;
		vertices=new String[size];
		System.arraycopy(args, 0, vertices, 0, size);
		a=new boolean[size][size];
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
		throw new IllegalArgumentException("Wrong values to be added!");
		
		//This line of code will throw ArrayOutOfBounds Exception!!!
		//return a.length;
	}

	
	public String toString(){
		if(size==0) return "{}";
		
		StringBuffer buf=new StringBuffer("{"+vertex(0));
		
		for (int i = 1; i < size; i++)
			buf.append(", "+vertex(i));
		
		return buf+"}";
	}
	private String vertex(int i){
			StringBuffer buf=new StringBuffer(vertices[i]+":");
			for (int j = 0; j <size; j++)
				if (a[i][j])
					buf.append(" "+vertices[j]);
			
			return buf+"";
	}
	public static void main(String[] args) {
		String[] arg= {"A","B","C","D","E","F","J","K","L","M","Z"};
		Graph graph=new Graph(arg);
		graph.add("A" , "B");
		graph.add("A" , "D");
		graph.add("B" , "E");
		graph.add("E" , "F");
		graph.add("F" , "J");
		graph.add("F" , "K");
        graph.add("D" , "C");
        graph.add("D" , "Z");
        graph.add("C" , "L");
        graph.add("C" , "M");
		
		System.out.println(graph);
	}
}
