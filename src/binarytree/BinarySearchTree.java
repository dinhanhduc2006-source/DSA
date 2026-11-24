package binarytree;

import java.util.Map;
import java.util.Scanner;

//Bài 1: Xây dựng cây nhị phân tìm kiếm (BST)
public class BinarySearchTree {

  static Node insert(Node root, int x) {
    if (root == null) {
      return new Node(x);
    }

    if (x < root.data) {
      root.left = insert(root.left, x);
    }
    if (x > root.data) {
      root.right = insert(root.right, x);
    }
    return root;
  }

  static void preorder(Node root) {
    if (root == null) {
      return;
    }

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  //Bai2: Hãy kiểm tra xem giá trị X có tồn tại trong cây hay không.
  static boolean search(Node root, int x) {
    if (root == null) {
      return false;
    }

    if (root.data == x) {
      return true;
    }

    if (x < root.data) {
      return search(root.left, x);
    } else {
      return search(root.right, x);
    }

//    if (search(root.left,x)){
//      return true;
//    }
//    if (search(root.right,x)){
//      return true;
//    }
//    return false;
  }

  //Bài 3: Tìm giá trị nhỏ nhất trong cây BST
  static int findMin(Node root) {
    if (root == null) {
      return Integer.MAX_VALUE;
    }
    if (root.left == null) {
      return root.data;
    }

    return findMin(root.left);
  }

  //bài 9: Kiểm tra cây có phải BST hay không
  static boolean isBST(Node root, long max, long min) {
    if (root == null) {
      return true;
    }

    if (root.data <= min || root.data >= max) {
      return false;
    }
    return isBST(root.left,root.data,min) && isBST(root.right,max,root.data);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Node root = null;

    for (int i = 0; i < n; i++) {
      root = insert(root, arr[i]);
    }
    preorder(root);
  }
}
