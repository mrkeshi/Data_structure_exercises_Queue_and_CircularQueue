import java.util.Stack;

public class Three {
    public static void inorder(Node root){
        if (root==null) return;
        inorder(root.prev);
        System.out.print(root.data);
        inorder(root.next);
    }
    public static void preorder(Node root){
        if (root==null) return;
        System.out.print(root.data);
        preorder(root.prev);
        preorder(root.next);
    }
    public static void pastorder(Node root){
        if (root==null) return;
        pastorder(root.prev);
        pastorder(root.next);
        System.out.print(root.data);
    }
    public static void main(String[] args) {
       Node root=new Node('A');
       Node B=new Node('B');
       B.prev=new Node('D');
       B.next=new Node('E');
       Node C=new Node('C');
       C.next=new Node('F');
       root.prev=B;
       root.next=C;
       inorder(root);
       System.out.println("\n");
       pastorder(root);
       System.out.println("\n");
       preorder(root);
        System.out.println("\n");
        PreorderWidthStack(root);
    }
    public static  void InOrderWidthStack(Node root){
        Node Current=root;
        Stack<Node> st=new Stack<Node>();
        while (!st.isEmpty() || Current!=null){
            if (Current!=null){
                st.push(Current);
                Current=Current.prev;
            }else{
                if (!st.isEmpty()){
                    char c=st.peek().data;
                    Current=st.pop().next;
                    System.out.println(c);
                }
            }
        }

    }
    public static  void PreorderWidthStack(Node root){
        Node Current=root;
        Stack<Node> st=new Stack<Node>();
        while (!st.isEmpty() || Current!=null){
            if (Current!=null){
                st.push(Current);
                System.out.println(Current.data);
                Current=Current.prev;
            }else{
                if (!st.isEmpty()){
                    char c=st.peek().data;
                    Current=st.pop().next;
                }
            }
        }

    }
    public static void PostOrder(Node root){
        Node Current=root;
        Stack<Node> st=new Stack<Node>();
        Stack<Node> result=new Stack<Node>();
        st.push(root);
        while (!st.isEmpty()){
            Current=st.pop();
            result.push(Current);
            if (Current.prev!=null){
                st.push(Current.prev);
            }
            if (Current.next!=null){
                st.push(Current.next);
            }
        }
    }
}
