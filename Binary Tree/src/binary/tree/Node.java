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
public class Node {
    public int data;
    public Node leftNode;
    public Node rightNode;

    /*public int toString(){
     return data;
    }*/
    
    public Node(int newData){
        this.data = newData;
        leftNode = null;
        rightNode= null;
    }
    
}
