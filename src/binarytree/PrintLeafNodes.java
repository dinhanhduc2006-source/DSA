package binarytree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrintLeafNodes {

  static void printLeafNodes(Node root) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null) {
      System.out.print(root.data + " ");
    }
    printLeafNodes(root.right);
    printLeafNodes(root.left);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    Map<Integer, Node> map = new HashMap<>();

    Set<Integer> childSet = new HashSet<>();

    for (int i = 0; i < n - 1; i++) {
      int parentValue = sc.nextInt();
      int childValue = sc.nextInt();
      String direction = sc.next();

      Node parent = map.get(parentValue);

      if (parent == null) {
        parent = new Node(parentValue);
        map.put(parentValue, parent);
      }

      Node child = map.get(childValue);

      if (child == null) {
        child = new Node(childValue);
        map.put(childValue, child);
      }

      if (direction.equals("L")) {
        parent.left = child;
      } else {
        parent.right = child;
      }

      childSet.add(childValue);
    }

    Node root = null;

    for (int value : map.keySet()) {

      if (!childSet.contains(value)) {
        root = map.get(value);
        break;
      }
    }
    printLeafNodes(root);
  }

}
