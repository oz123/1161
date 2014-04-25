// Lumber jacking ...
// Not much to see here besides me playing with Java and Trees
// 

public class Tree {

	
	public int value;
	public Tree lson;
	public Tree sybling;
	
	public Tree(int value){
		this.value = value; 
		
	}
	
	private static Tree build_tree(){
		Tree tree = new Tree(4);
		tree.lson = new Tree(8);
		tree.lson.lson = new Tree(16);
		tree.lson.lson.sybling = new Tree(5);
		tree.lson.lson.sybling.sybling = new Tree(1); 
		return tree;
		
	}
	public void print_keys(){
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Tree tree = build_tree();
		
		System.out.println("Hello World!");
		System.out.println(tree.value);
		System.out.println(tree.lson.value);
		System.out.println(tree.lson.lson.value);
		System.out.println(tree.lson.lson.sybling.value);
	}

}
