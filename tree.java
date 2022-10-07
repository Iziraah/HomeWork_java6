public class tree {

  public static void main(String[] args) {
    Node root = new Node("7");
    Node l1 = new Node("9");
    Node r1 = new Node("3");
    Node r11 = new Node("2");
    Node r12 = new Node("5");
    Node l11 = new Node("8");
    Node l12 = new Node("10");
    Node r111 = new Node("1");
    Node r121 = new Node("4");
    Node r122 = new Node("6");

    root.right = r1;
    root.left = l1;
    r1.right = r11;
    r1.left = r12;
    r11.right = r111;
    r12.right = r121;
    r12.left = r122;
    l1.right = l11;
    l1.left = l12;
    Iterr.View(root, "");
    System.out.println("-");
    Travel.Travelmode1(root, " ");
    System.out.println("");
    Travel.Travelmode2(root, " ");
    System.out.println("");
    Travel.bracket(root);
    }

}

class Node {
    public Node(String v) {
    value = v;
    }

String value;
Node left;
Node right;
}

class Iterr {
static void View(Node n, String space) {
    if (n != null) {
    System.out.printf("%s%s\n", space, n.value);

    if (n.left != null) {
        View(n.left, space + " ");
        }
    if (n.right != null) {
        View(n.right, space + " ");
        }
    }
}}

class Travel{
    public static void Travelmode1(Node n, String space){
        if(n == null){return;}
        Travelmode1(n.left, space + "  ");
        System.out.printf(n.value, space + "  ");
        Travelmode1(n.right, space + "  ");
        
    }
    public static void Travelmode2(Node n, String space){
        if(n == null){return;}
        Travelmode2(n.right, space + "  ");
        Travelmode2(n.left, space + "  ");
        System.out.printf(n.value, space + "  ");
    }
    public static void bracket(Node n){
        if (n.value != null) {
            System.out.printf(n.value + " ");
            if(n.left != null || n.right != null){
                System.out.printf("(");                 
                if (n.left != null) {
                    bracket(n.left);
                    }
                    else{System.out.printf("null" + " ");}
                if (n.right != null) {
                    bracket(n.right);
                }
                else{System.out.printf("null" + " ");}
                System.out.printf(")");  
            }}
    }
}
