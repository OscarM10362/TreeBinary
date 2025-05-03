/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.edu.progra.structuretree;

import java.util.List;

import umg.edu.progra.structuretree.service.TreeBinary;
import umg.edu.progra.structuretree.structure.nodo;

/**
 *
 * @author Oscar Monroy
 */
public class Principal {

    public static void main(String[] args) {
         System.out.println("=== INICIO DEL PROGRAMA ===");
        
        // Construir árbol 
        nodo root = buildSampleTree();
        TreeBinary treeBinary = new TreeBinary();
        
        // Ejecutar búsqueda de rutas
        List<List<Integer>> result = treeBinary.findPaths(root, 22);
        
        // Mostrar resultados
        System.out.println("\nRutas encontradas:");
        result.forEach(System.out::println);
        
        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
    
    private static nodo buildSampleTree() {
        nodo root = new nodo(5);
        root.left = new nodo(4);
        root.right = new nodo(8);
        root.left.left = new nodo(11);
        root.right.left = new nodo(13);
        root.right.right = new nodo(4);
        root.left.left.left = new nodo(7);
        root.left.left.right = new nodo(2);
        root.right.right.right = new nodo(1);
        return root;
    }
    
    
}
