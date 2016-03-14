/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.tree;

/**
 *
 * @author Henry Jones
 */
public class BinaryTree {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Binaryload Tree = new Binaryload();
        
        Tree.add(11);
        Tree.add(5);
        Tree.add(4);
        Tree.add(13);
        Tree.add(1);
        Tree.add(3);
        Tree.add(7);
        Tree.add(6);
        Tree.add(9);
        Tree.add(10);
        Tree.add(15);
        Tree.add(12);
        Tree.add(18);
        Tree.findNode(7);
        Tree.findNode(8);
        Tree.printinOrder();
        Tree.printpreOrder();
        Tree.printpstOrder();
        Tree.removeItem(7);
        Tree.printpreOrder();
    }
    
}
