package binarytree;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Preorder {

  static void preorder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    //tao map de quan ly cac node
    Map<Integer, Node> map = new HashMap<>();
    //tao set de luu cac node con (muc dich: tim cac node root)
    Set<Integer> childSet = new HashSet<>();

    //Luu y: duyet den N-1 vi ko tinh node rood
    for (int i = 0; i < n-1; i++) {
      int parentValue = sc.nextInt();
      int childValue = sc.nextInt();
      String direction = sc.next();
      // Lay node cha ra neu ko co thi tao node moi roi put vao map
      Node parent = map.get(parentValue);

      if (parent == null) {
        parent = new Node(parentValue);
        map.put(parentValue, parent);
      }
      //Lay node con ra neu ko co thi tao node noi roi put vao map
      Node child = map.get(childValue);

      if (child == null) {
        child = new Node(childValue);
        map.put(childValue, child);
      }
      //Noi node con vao lop cha
      if (direction.equals("L")) {
        parent.left = child;
      } else if (direction.equals("R")) {
        parent.right = child;
      }
      //Add vao childSet de tim node root
      childSet.add(childValue);

    }

    //Tim node root
    Node root = null;

    for (int value : map.keySet()) {

      if (!childSet.contains(value)) {
        root = map.get(value);
        break;
      }
    }

    preorder(root);
  }
}
