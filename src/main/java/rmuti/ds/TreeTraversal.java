package rmuti.ds;

import rmuti.ds.Node;

public class TreeTraversal {
	
	public void preOrder(Node r,Visitor v) {
		if (r==null) {
			return;
		}
	v.visit(r.getValue());
	postOrder(r.left,v);
	postOrder(r.right,v);
	}
	public void inOrder(Node r,Visitor v) {
		if (r==null) {
			return;
		}
		inOrder(r.left,v);
		v.visit(r.getValue());
		inOrder(r.right,v);
	}
	public void postOrder(Node r,Visitor v) {
		if (r==null) {
			return;
		}
	postOrder(r.left,v);
	postOrder(r.right,v);
	v.visit(r.getValue());
	}

}