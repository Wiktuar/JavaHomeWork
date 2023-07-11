package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    Node root;

//  существует ли node с таким значением в дереве.
    public boolean exists(int value){
        Node node = find(root, value);
        return node != null ? true : false;
    }

//  метод поиска  node, содержащей заданное значение. Это обход в глубину
    private Node find(Node node, int value){
        if(node.value == value){
            return node;
        } else {
            for(Node child : node.children){
                Node result = find(child, value);
                return result;
            }
        }
        return null;
    }

//  метод поиска  node, содержащей заданное значение. Это обход списка в ширину
    private Node find(int value){
        List<Node> line = new ArrayList<>();
        line.add(root);

        while(line.size() > 0){
            List<Node> nextLine = new ArrayList<>();
            for(Node node : line){
                if(node.value == value){
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }

    class Node {
        int value;
        List<Node> children;
    }
}
