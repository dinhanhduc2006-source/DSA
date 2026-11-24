package binarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SameBinaryTrees {

  static boolean isSameTree(Node root1, Node root2) {
    if (root1 == null && root2 == null) {
      return true;
    }
    if (root1 == null || root2 == null) {
      return false;
    }
    if (root1.data != root2.data) {
      return false;
    }

    return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    //phai so sanh ca 2 nhanh trai phai nen dung toan tu vaf
  }

  //Hãy kiểm tra xem cây nhị phân có đối xứng qua trục dọc đi qua node gốc hay không.
  static boolean isMirror(Node left, Node right) {

    if (left.left == null && right.right == null) {
      return true;
    }
    if (left.left == null || right.right == null) {
      return false;
    }
    if (right.data != left.data) {
      return false;
    }
    return (isMirror(left.left, right.right) && isMirror(left.right, right.left));
  }

  //Hãy kiểm tra xem cây có phải là cây nhị phân đầy đủ (Full Binary Tree)
  static boolean isFullBinaryTree(Node root) {
    if (root == null) {
      return true;
    }

    if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
      return false;
    }
    return isFullBinaryTree(root.left) && isFullBinaryTree(root.right);
  }

  //Hãy kiểm tra xem cây có phải là cây nhị phân hoàn chỉnh (Complete Binary Tree) hay không.
  static boolean isCompleteBinaryTree(Node root) {
    if (root == null) {
      return true;
    }

    Queue<Node> queue = new LinkedList<>();

    queue.add(root);

    boolean foundNull = false;

    while (!queue.isEmpty()) {

      Node current = queue.poll();

      if (current.left != null) {
        if (foundNull) {
          return false;
        } else {
          queue.add(current.left);
        }
      } else {
        foundNull = true;
      }

      if (current.right != null) {
        if (foundNull) {
          return false;
        } else {
          queue.add(current.right);
        }
      } else {
        foundNull = true;
      }
    }
    return true;
  }

  //Hãy kiểm tra xem cây có phải là cây nhị phân cân bằng hay không
  static int treeHight(Node root) {
    if (root == null) {
      return 0;
    }
    int left = treeHight(root.left);
    int right = treeHight(root.right);

    return 1 + Math.max(left, right);
  }

  static boolean isBalanced(Node root) {
    if (root == null) {
      return true;
    }
    if (Math.abs(treeHight(root.left)-treeHight(root.right))>1){
      return false;
    }
    return isBalanced(root.left) && isBalanced(root.right);
  }

  //Cho hai node có giá trị u và v. Hãy tìm tổ tiên chung gần nhất (LCA) của hai node đó.
  static Node lowestCommonAncestor(Node root,int u, int v){
    if (root==null){
      return null;
    }

    if (root.data == u || root.data==v){
      return root;
    }

    Node left= lowestCommonAncestor(root.left,u,v);
    Node right = lowestCommonAncestor(root.right,u,v);

    if (left!=null &&right!=null){
      return root;
    }

    if (left!=null){
      return left;
    }
    if (right!=null){
      return right;
    }
    return null;
  }

  //Tìm đường đi từ gốc đến node
  static boolean findPath(Node root,int x, List<Integer> path){
    if (root==null){
      return false;
    }

    path.add(root.data);

    if (root.data == x){
      return true;
    }

    if (findPath(root.left,x,path) || findPath(root.right,x,path)){
      return true;
    }

    path.remove(path.size()-1);//quay lui

    return false;
  }

  public static void main(String[] args) {

  }
}
