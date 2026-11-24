package binarytree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//Tinh tong so node trong cay
public class CountNodes {

  static int countNodes(Node root) {
    if (root == null) {
      return 0;
    }

    return 1 + countNodes(root.left) + countNodes(root.right);

  }

  //Tinh so node la
  static int countLeafNodes(Node root){
    if (root==null){
      return 0;
    }
    if (root.left==null && root.right==null){
      return 1;
    }
    int left=countLeafNodes(root.left);
    int right=countLeafNodes(root.right);

    return left+right;
  }

  //tính tổng giá trị của tất cả các node
  static int sumOfNodes(Node root){
    if (root==null){
      return 0;
    }

    int sumLeft=sumOfNodes(root.left);
    int sumRight=sumOfNodes(root.right);

    return root.data +sumLeft+sumRight;
  }

  //tìm giá trị lớn nhất trong tất cả các node.
  static int findMaximum(Node root){
    if (root==null){
      return Integer.MIN_VALUE;
    }

    int maxLeft= findMaximum(root.left);
    int maxRight = findMaximum(root.right);

    return Math.max(root.data,Math.max(maxLeft,maxRight));
  }

  //tính chiều cao của cây
  static int treeHight(Node root){
    if (root ==null){
      return 0;
    }
    int left=treeHight(root.left);
    int right=treeHight(root.right);

    return 1+Math.max(left,right);
  }

  //đếm số lượng node trung gian

  static int countInternalNodes(Node root){
    if (root == null){
      return 0;
    }
    int count=0;
    if (root.right !=null ||root.left!=null){
      count=1;
    }

    int left=countInternalNodes(root.left);
    int right=countInternalNodes(root.right);
    return left+right+count;
  }

  static int sumLeafNodes(Node root){
    if (root==null){
      return 0;
    }
    int sum=0;
    if (root.right==null && root.left==null){
      sum=root.data;
    }
    int left=sumLeafNodes(root.left);
    int right=sumLeafNodes(root.right);
    return sum+ left+right;
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

    System.out.println(sumLeafNodes(root));
  }
}
