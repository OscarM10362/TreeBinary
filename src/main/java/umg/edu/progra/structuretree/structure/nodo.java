/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.progra.structuretree.structure;

/**
 *
 * @author Oscar Monroy
 */
public class nodo {
    private int val;  
    public nodo left;
    public nodo right;
    
    // Constructor
    public nodo(int val) {
        this.val = val;
    }
    
    // Getters
    public int getVal() {
        return val;
    }
    
    public nodo getLeft() {
        return left;
    }
    
    public nodo getRight() {
        return right;
    }
    
    // Setters si son necesarios
    public void setLeft(nodo left) {
        this.left = left;
    }
    
    public void setRight(nodo right) {
        this.right = right;
    }
    
}