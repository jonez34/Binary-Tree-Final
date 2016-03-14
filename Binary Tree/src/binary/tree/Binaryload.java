/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.tree;

import static java.util.Optional.empty;

/**
 *
 * @author Henry Jones
 */
public class Binaryload {

    private Node firstNode;

    private int numberofEntries;

    public Binaryload() {

        firstNode = null;
        numberofEntries = 0;
    }

    public void add(int data) {

        Node newNode = new Node(data);

        if (firstNode == null) {
            firstNode = newNode;
            //System.out.println("This is the first Node. " + firstNode.data);
            numberofEntries++;
            return;
        }
        insertNode(firstNode, newNode);
    }

    private void insertNode(Node currentNode, Node newNode) {
        if (currentNode.data > newNode.data) {
            if (currentNode.leftNode == null) {
                currentNode.leftNode = newNode;
                //System.out.println("This was entered on the left. " + currentNode.leftNode.data);
                numberofEntries++;
                return;
            } else {

                insertNode(currentNode.leftNode, newNode);
            }
        } else if (currentNode.rightNode == null) {
            currentNode.rightNode = newNode;
            // System.out.println("This was entered on the right. " + currentNode.rightNode.data);
            numberofEntries++;
            return;
        } else {

            insertNode(currentNode.rightNode, newNode);
        }

    }

    public void findNode(int item) {

        if (firstNode == null) {
            System.out.println("No items in Tree");
        }
        findNodeRec(firstNode, item);
    }

    public boolean findNodeRec(Node currentNode, int item) {
        //if no childern then remove from parent.
        boolean notfound = false;
        if (currentNode != null) {
            if (currentNode.data > item) {
                if (notfound == false) {
                    notfound = findNodeRec(currentNode.leftNode, item);
                }
                return false;
            } else if (currentNode.data < item) {
                if (notfound == false) {
                    notfound = findNodeRec(currentNode.rightNode, item);
                }
                return false;
            } else if (currentNode.data == item) {
                System.out.println("Item found in the Tree.");
                return true;
            }

        }
        System.out.println("Item not found in the Tree.");
        return true;
    }

    public void removeAll() {
        System.out.println("Everythng has been Erased");
        firstNode = null;

        numberofEntries = 0;

    }

    public int findValue(Node currentNode) {
        if (firstNode == null) {
            return 0;
        }
        while (currentNode.rightNode != null) {
            currentNode = currentNode.rightNode;
        }
        return currentNode.data;

    }

    public void removeItem(int item) {
        Node currentNode = firstNode;

        if (currentNode == null) {
            System.out.println("Tree is emputy");
            return;
        }
        removeItemRec(currentNode, item);
    }

    public boolean removeItemRec(Node currentNode, int item) {
        //if no childern then remove from parent.
        boolean delMe = false;
        if (currentNode.data > item) {
            delMe = removeItemRec(currentNode.leftNode, item);

            if (delMe) {
                currentNode.leftNode = null;
            }
            return false;
        } else if (currentNode.data < item) {
            delMe = removeItemRec(currentNode.rightNode, item);
            if (delMe) {
                currentNode.rightNode = null;
            }
            return false;
        } else if (currentNode.leftNode == null && currentNode.rightNode == null) {
            currentNode = null;
            numberofEntries--;
            delMe = true;
            return delMe;
        } else if (currentNode.leftNode == null) {
            currentNode = currentNode.rightNode;
            numberofEntries--;
            delMe = true;
            return delMe;
        } else if (currentNode.rightNode == null) {
            currentNode = currentNode.leftNode;
            numberofEntries--;
            delMe = true;
            return delMe;
        } else {
            int temp = findValue(currentNode);
            removeItem(temp);
            currentNode.data = temp;
            numberofEntries--;
            delMe = false;
            return delMe;
        }

    }

    public void noOfitems() {
        System.out.println("The Number of Nodes in the Bag is " + numberofEntries);
    }

    public void printinOrder() {
        printinOrderRec(firstNode);
        System.out.println("");
    }

    public void printinOrderRec(Node currentNode) {
        if (currentNode == null) {
            return;
        }
        printinOrderRec(currentNode.leftNode);
        System.out.print(currentNode.data + ", ");
        printinOrderRec(currentNode.rightNode);

    }

    public void printpreOrder() {
        printpreOrderRec(firstNode);
        System.out.println("");
    }

    public void printpreOrderRec(Node currentNode) {
        if (currentNode == null) {
            return;
        }
        System.out.print(currentNode.data + ", ");
        printinOrderRec(currentNode.leftNode);
        printinOrderRec(currentNode.rightNode);

    }

    public void printpstOrder() {
        printpstOrderRec(firstNode);
        System.out.println("");
    }

    public void printpstOrderRec(Node currentNode) {
        if (currentNode == null) {
            return;
        }
        printinOrderRec(currentNode.leftNode);
        printinOrderRec(currentNode.rightNode);
        System.out.print(currentNode.data + ", ");
    }

    public boolean isEmpty() {
        boolean result;

        if (numberofEntries == 0) {
            result = true;

        } else {
            result = false;

        }

        return result;
    }

}
