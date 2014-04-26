// Lumber jacking ...
// Not much to see here besides me playing with Java and Trees
// 

public class Tree {

	public int value;
	public Tree lson;
	public Tree sybling;

	public Tree(int value) {
		this.value = value;

	}

	private static Tree build_tree() {
		Tree t = new Tree(4);
		// left branch
		t.lson = new Tree(8);
		t.lson.lson = new Tree(16);
		t.lson.lson.sybling = new Tree(5);
		t.lson.lson.sybling.sybling = new Tree(1);
		// middle branch
		t.lson.sybling = new Tree(12);
		t.lson.sybling.lson = new Tree(13);
		t.lson.sybling.lson.sybling = new Tree(9);
		// free standing leaf
		t.lson.sybling.sybling = new Tree(17);
		// right most branch
		t.lson.sybling.sybling.sybling = new Tree(3);
		t.lson.sybling.sybling.sybling.lson = new Tree(7);
		t.lson.sybling.sybling.sybling.lson.sybling = new Tree(11);

		return t;

	}
    
	/* 
	 * @param tree - a Tree as defined 
	 * Walk a tree (of N degree) and print all the values
	 */
	public static Tree walk_tree(Tree tree) {
		System.out.println(tree.value);
	    if (tree.lson != null){
	    	walk_tree(tree.lson);
	    }
	    if (tree.sybling != null) {
	    	walk_tree(tree.sybling);
	    }
	    return tree;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Tree tree = build_tree();

		System.out.println("Hello World!");
		/*
		System.out.println(tree.value);
		System.out.println(tree.lson.value);
		System.out.println(tree.lson.lson.value);
		System.out.println(tree.lson.lson.sybling.value);
		*/
		walk_tree(tree);
	}

}
