package lab12;

public class BinaryTree {

	//BinaryTree EmptyTree = BinaryTree(1) ;
	
	//BinaryTree EMPTYTREE;
	//int defaultvalue = 1;
	int key ;
	//= defaultvalue;
	BinaryTree leftChild;
	BinaryTree rightChild;
	
	public BinaryTree(int key, BinaryTree left, BinaryTree right ) {
		this.key = key;
		this.leftChild = left;
		this.rightChild = right;
	}

	
	public static final BinaryTree EMPTYTREE = new BinaryTree(-1,null,null); {
		
	}
	
	public BinaryTree insert(int item) {
		if(this==(EMPTYTREE)) {
			return new BinaryTree(item, EMPTYTREE, EMPTYTREE);
		}
		if( item<this.key) {
			//this.leftChild.insert(item);
			return new BinaryTree(this.key, this.leftChild.insert(item),this.rightChild);
		}
		
		if(item>this.key) {
			//this.rightChild.insert(item);
			return new BinaryTree(this.key,this.leftChild, this.rightChild.insert(item));
			//reutrn new BinaryTree(this.key,this.leftChild,insert(item));
		}
		return this;
	}
	
	public BinaryTree find(int item) {
		if(this.equals(EMPTYTREE)) {
			return EMPTYTREE;
		}
		if (this.key==item) {
			return this;
		}
		if (item<this.key) {
			return this.leftChild.find(item);
		}
		return this.rightChild.find(item);
	}
	
	public void printInOrder() {
		if(!(this==EMPTYTREE)) {
		this.leftChild.printInOrder();
		System.out.println(this.key);
		this.rightChild.printInOrder();

		}
	}
	
		public void printPreOrder() {
			if(!(this==EMPTYTREE)) {
			System.out.println(this.key);
			this.leftChild.printInOrder();
			this.rightChild.printInOrder();

			}
	}
		public void printPostOrder() {
			if(!(this==EMPTYTREE)) {
			this.leftChild.printInOrder();
			this.rightChild.printInOrder();
			System.out.println(this.key);

			}
	}

	public static void main(String[] args) {
		BinaryTree testTree = 
				new BinaryTree(25,
						new BinaryTree(12,
								new BinaryTree(9,BinaryTree.EMPTYTREE,
										BinaryTree.EMPTYTREE),
								new BinaryTree(14,BinaryTree.EMPTYTREE,
										BinaryTree.EMPTYTREE)),
						new BinaryTree(36,
								new BinaryTree(29,BinaryTree.EMPTYTREE,
										BinaryTree.EMPTYTREE),
								BinaryTree.EMPTYTREE));
		System.out.println("testTree inOrder: ");
		testTree.printInOrder();
		BinaryTree newTree = testTree.insert(11);
		System.out.println("testTree inOrder: ");
		testTree.printInOrder();
		System.out.println("testTree inOrder: ");
		testTree.printInOrder();
		
		BinaryTree tree03 = 
				BinaryTree.EMPTYTREE
								.insert(34)
								.insert(48)
								.insert(29)
								.insert(36)
								.insert(12)
								.insert(9);
		
		System.out.println("tree03 preOrder: ");
		tree03.printPreOrder();
		System.out.println("tree03 inOrder: ");
		tree03.printInOrder();
		System.out.println("tree03 postOrder: ");
		tree03.printPostOrder();
		
		
		System.out.println("EOP");


	}
}
