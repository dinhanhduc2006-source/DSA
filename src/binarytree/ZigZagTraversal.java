package binarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class ZigZagTraversal {

  static void zigzag(Node root) {
    if (root == null) {
      return;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    boolean leftToRight = true;
    while (!queue.isEmpty()) {
      int size = queue.size();

      ArrayList<Node> arrayList = new ArrayList<>();

      for (int i = 0; i < size; i++) {
        Node current = queue.poll();
        arrayList.add(current);

        if (current.left != null) {
          queue.add(current.left);
        }
        if (current.right != null) {
          queue.add(current.right);
        }
      }

      if (leftToRight) {
        for (int i = 0; i < arrayList.size(); i++) {
          System.out.print(arrayList.get(i).data + " ");
        }
      } else {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
          System.out.print(arrayList.get(i).data + " ");
        }
      }
//      System.out.println();

      leftToRight = !leftToRight;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();

    Map<Integer,Node> map = new HashMap<>();
    Set<Integer> childSet = new HashSet<>();

    for (int i=0;i<n-1;i++){
      int parentValue =sc.nextInt();
      int childValue=sc.nextInt();
      String direction= sc.next();

      Node parent = map.get(parentValue);

      if (parent == null){
        parent = new Node(parentValue);
        map.put(parentValue,parent);
      }

      Node child =map.get(childValue);

      if (child==null){
        child=new Node(childValue);
        map.put(childValue,child);
      }

      if (direction.equals("L")){
        parent.left=child;
      } else {
        parent.right=child;
      }

      childSet.add(childValue);
    }

    Node root =null;
    for (int value: map.keySet()){
      if (!childSet.contains(value)){
        root=map.get(value);
        break;
      }
    }

    zigzag(root);

  }
}
