package exam3;
//owner cade justad-sandberg
public class Main {

	public static void main(String[] args) {
		BinaryTree test = new BinaryTree(10);
		BinaryTree test3 = BinaryTree.EMPTYTREE
				.insert(5)
				.insert(2)
				.insert(7)
				.insert(12)
				.insert(20)
				.insert(21);
				
	
		
		
		System.out.println("<test3>");
		//testing inputs
		test3.printInOrder();
		System.out.println("<test3>");
		System.out.println(test3.product());
		System.out.println(test3.countInternalNodes());


	}

}
