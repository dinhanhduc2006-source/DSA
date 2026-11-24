package binarytree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SearchNode {
  static boolean search(Node root,int x){
    if (root ==null){
      return false;
    }
    if (root.data == x){
      return true;
    }
    if (search(root.left,x)){
      return true;
    }
    if (search(root.right,x)){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t= sc.nextInt();
    while (t-->0){
      int n = sc.nextInt();

      int x= sc.nextInt();

      Map<Integer,Node> map = new HashMap<>();

      Set<Integer> childSet = new HashSet<>();

      for (int i=0;i<n-1;i++){
        int parentValue=sc.nextInt();
        int childValue=sc.nextInt();
        String direction=sc.next();

        Node parent= map.get(parentValue);

        if (parent==null){
          parent = new Node(parentValue);
          map.put(parentValue,parent);
        }

        Node child = map.get(childValue);

        if (child==null){
          child = new Node(childValue);
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
      if (search(root,x)){
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
