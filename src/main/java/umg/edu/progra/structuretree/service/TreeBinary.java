/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.progra.structuretree.service;


import java.util.ArrayList;
import java.util.List;
import umg.edu.progra.structuretree.structure.nodo;

/**
 *
 * @author Oscar Monroy
 */
public class TreeBinary {
     public List<List<Integer>> findPaths(nodo root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), result);
        return result;
    }
     
     private void dfs(nodo node, int remainingSum, List<Integer> currentPath, List<List<Integer>> result) {
    if (node == null) return;
    
    currentPath.add(node.getVal());  
    
    if (node.getLeft() == null && node.getRight() == null && remainingSum == node.getVal()) {
        result.add(new ArrayList<>(currentPath));
    }
    
    dfs(node.getLeft(), remainingSum - node.getVal(), currentPath, result);
    dfs(node.getRight(), remainingSum - node.getVal(), currentPath, result);
    
    currentPath.remove(currentPath.size() - 1);
}
}
