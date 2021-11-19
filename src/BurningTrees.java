import java.util.HashMap;

class Node {
    int data;
    Node left;
    Node right;
Node(){};
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class BurningTrees {
    public static void main(String args[])
    {
        Node root = new Node(12);
        root.left = new Node(13);
        root.right = new Node(10);
        root.right.left = new Node(14);
        root.right.right = new Node(15);
        Node left = root.right.left;
        Node right = root.right.right;
        left.left = new Node(21);
        left.right = new Node(24);
        right.left = new Node(22);
        right.right = new Node(23);
int target=23;
Solution s1=new Solution();
System.out.println(s1.minTime(root,target));

    }

}

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;

    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    //hashmap for obtaining the height in comstant time O(1)
    static HashMap<Integer,Integer> hm=new HashMap<>();
    static int res=0;

    //traversal function
    public  int traverse(Node root,int target){
        if(root==null)return 0;
        if(root.data==target)return 1;
        int val=traverse(root.left,target);
        //if found val!=0
        if(val!=0){

            //if target found in left subtree then
            if(root.right!=null){
                //finding maximum depth on right bexause target is in left
                res=Math.max(res,val+hm.get(root.right.data));
            }


            return val+1;
        }
        val=traverse(root.right,target);
        //if found val!=0
        if(val!=0){

            //if target found in left subtree then
            if(root.left!=null){
                //finding maximum depth on right bexause target is in left
                res=Math.max(res,val+hm.get(root.left.data));
            }


            return val+1;
        }

        return 0;

    }

    public  int  height(Node root){
        if(root==null)return 0;

        int left=height(root.left);
        int right=height(root.right);
        hm.put(root.data,1+Math.max(left,right));


        return 1+Math.max(left,right);

    }


    public  int minTime(Node root, int target)
    {
        // Your code goes here

        res=0;
        height(root);
        traverse(root,target);
        hm.clear();
        return res;
    }
}
