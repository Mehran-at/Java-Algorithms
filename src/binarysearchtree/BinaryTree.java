package binarysearchtree;

class BinaryTree {

    Node root;

    public static void main(String[] args) {

        BinaryTree theTree = new BinaryTree();

        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice Press");
        theTree.addNode(15, "Official Manger");
        theTree.addNode(30, "Secretary");
        theTree.addNode(75, "Seller");
        theTree.addNode(85, "SalesMann Manager");

        theTree.inOrderTraverseTree(theTree.root);
        System.out.println("<==========>");
        theTree.preOrderTraverseTree(theTree.root);
        System.out.println("<==========>");
        theTree.postOrderTraverseTree(theTree.root);
        System.out.println("<==========>");
        System.out.println("Search for 30 ? ...");
        System.out.println(theTree.findNode(30));


    }

    public Node findNode(int key) {

        Node foundNode = root;
        while (foundNode.key != key) {
            if (key < foundNode.key) {
                foundNode = foundNode.leftChild;
            } else {
                foundNode = foundNode.rightChild;
            }
            if (foundNode == null) {
                return null;
            }
        }
        return foundNode;
    }

    public void addNode(int key, String name) {

        Node newNode = new Node(key, name);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void preOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {
            System.out.println(focusNode);

            preOrderTraverseTree(focusNode.leftChild);

            preOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {
            postOrderTraverseTree(focusNode.leftChild);

            postOrderTraverseTree(focusNode.rightChild);

            System.out.println(focusNode);
        }
    }
}
//  https://www.youtube.com/watch?v=M6lYob8STMI&ab_channel=DerekBanas