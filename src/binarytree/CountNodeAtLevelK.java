package binarytree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class CountNodeAtLevelK {
  static int counNodeAtLevelK(Node root,int k){
    if (root==null){
      return 0;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    int level=0;
    int count=0;

    while (!queue.isEmpty()){
      int size= queue.size();

      for (int i=0;i<size;i++){
        Node current= queue.poll();

        if (level==k){
          count++;
        }
        if (current.left != null){
          queue.add(current.left);
        }
        if (current.right!=null){
          queue.add(current.right);
        }
      }
      level++;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int k= sc.nextInt();

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

    System.out.println(counNodeAtLevelK(root,k));
  }
}
