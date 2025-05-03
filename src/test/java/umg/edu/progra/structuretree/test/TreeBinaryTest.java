/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.progra.structuretree.test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import umg.edu.progra.structuretree.service.TreeBinary;
import umg.edu.progra.structuretree.structure.nodo;

/**
 *
 * @author Oscar Monroy
 */
public class TreeBinaryTest {
    
     private nodo buildSampleTree(){
          nodo root = new nodo(5);
        root.left = new nodo(4);
        root.right = new nodo(8);
        root.left.left = new nodo(11);
        root.right.left = new nodo(13);
        root.right.right = new nodo(4);
        root.left.left.left = new nodo(7);
        root.left.left.right = new nodo(2);
        root.right.right.left = new nodo(5);
        root.right.right.right = new nodo(1);
        return root;
    }

     
       public void testFindPaths() {
        nodo root = buildSampleTree();
        TreeBinary treeBinary = new TreeBinary();
        
        List<List<Integer>> result = treeBinary.findPaths(root, 5);
        
        // Verificaciones
       assertEquals(2, result.size());
       assertTrue(result.contains(Arrays.asList(5, 4, 11, 2)));
       assertTrue(result.contains(Arrays.asList(5, 8, 4, 5)));
       assertEquals(2, result.size(), "Deberían encontrarse exactamente 2 rutas");
    }
    
}
