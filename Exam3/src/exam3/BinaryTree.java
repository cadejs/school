package exam3;



//Owner: Cade Justad-Sandberg
public class BinaryTree {

	public static final BinaryTree EMPTYTREE = new BinaryTree(0,null,null);
	
	private int key;
	private BinaryTree leftChild;
	private BinaryTree rightChild;
	
	public BinaryTree(int key, BinaryTree leftChild, BinaryTree rightChild) {
		this.key=key;
		this.leftChild=leftChild;
		this.rightChild=rightChild;
		
	}
	
	public BinaryTree(int key) {
		this.key=key;
		this.leftChild=EMPTYTREE;
		this.rightChild=EMPTYTREE;
		
	}


	public BinaryTree insert(int data) {
		if(this==(EMPTYTREE)) {
			return new BinaryTree(data, EMPTYTREE, EMPTYTREE);
		}
		if( data < this.key) {
			return new BinaryTree(this.key, this.leftChild.insert(data),this.rightChild);
		}
		if(data>this.key) {
			return new BinaryTree(this.key,this.leftChild, this.rightChild.insert(data));
		}
		return this;
	}
	
	//testing my inputs
	public void printInOrder() {
		if(!(this==EMPTYTREE)) {
		this.leftChild.printInOrder();
		System.out.println(this.key);
		this.rightChild.printInOrder();
		}
	}
	
	
	
	//test portion

	public int productgo(int input) {
		
		int value = input;
		
		
		if (this==EMPTYTREE) {
			return value;
		}
		if(this!=EMPTYTREE) {
			//value = value+this.key;
		}
		if (!leftChild.equals(EMPTYTREE)) {
			value = value +leftChild.key;
			return leftChild.productgo(value) + value ;
			//return value;
		}
		 if (!rightChild.equals(EMPTYTREE)) {
			 value = value + rightChild.key;
			return rightChild.productgo(value) + value ;
			//return value;
		}
		return value + this.key;
	}
	
	public int product() {
		return this.productgo(0);
		
	}


	public int countInternalNodes() {
		return this.countInternalNodesgo(0);
				
	}
	
	public int countInternalNodesgo(int nulls) {
		int tnull = nulls;

		
		if (leaf(this)==0) {
			this.leftChild.countInternalNodesgo(nulls);
			this.rightChild.countInternalNodesgo(nulls);
			
		} if (leaf(this)==1) {
			tnull++;
			//left is null
			return this.rightChild.countInternalNodesgo(nulls+1) + 1;
		}
		if (leaf(this)==2) {
			tnull++;
			return this.rightChild.countInternalNodesgo(nulls+1) + 1;
		}
		else if (leaf(this)==3) {
			tnull++;
			tnull++;
			return 2;
		}
	return tnull+1;
		
	}
	
	//return 1 for left 2 for right, 3 for both and 0 of for none
	public int leaf(BinaryTree input) {
		if (input.leftChild==null || input.rightChild==null) {
			if (input.leftChild == null && input.rightChild ==null) {
				return 3;
			}
			else if (input.leftChild == null ) {
				//return 1 for left null
				return 1;
			} else if (input.rightChild == null) {
				//return 2 for right null
				return 2;
			}
		}
		return 0;
		
	}
}

