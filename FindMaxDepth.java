//code for finding max depth of a tree node
class Treenode{
  int val;
  Treenode right;
  Treenode left;
  Treenode(int val){this.val=val;}
}
public class FindMaxDepth{
  public int maxdepth(Treenode root){
  if(root==null){return 0;}
    else{
      return Math.max(maxdepth(root.right),maxdepth(root.left))+1;
      
    }
  }
  public static void main(String[] args){
   
    Treenode root=new Treenode(1);
    root.right=new Treenode(2);
    root.left=new Treenode(3);
    root.right.right=new Treenode(4);
    root.right.left=new Treenode(5);
    root.right.right.right=new Treenode(6);//added a new node  here answer should be 4 
    

    FindMaxDepth f=new FindMaxDepth();
   System.out.println(f.maxdepth(root));
    
  }
}
