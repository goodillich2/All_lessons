package tree;

public class Main
{
    public static void main(String[] args)
    {
        Node root = new Node(40, new Node(30, new Node(6), new Node(60, new Node(50), new Node(24))),
                new Node(20, new Node(44, null, new Node(12)), null));


        System.out.println(f(root));
        System.out.println(g(root));
        System.out.println(secret(root));


    }



    public static int f(Node root)
    {
        if (root == null )
            return 0 ;
        return f(root.getLeftSon ()) + 1 + f(root.getRightSon());
    }

    public static boolean g(Node root)
    {
        if (root == null)
            return true ;
        if (root.getNumber()%2==1)
            return false ;
        return g(root.getLeftSon())&& g(root.getRightSon());
    }

    public static int secret(Node root)
    {
    if (g(root))
    {
        return f(root);
    }
    return Math.max(secret(root.getLeftSon()),
    secret(root.getRightSon()));
    }
}


 class Node
{
    private int _number;
    private Node _leftSon, _rightSon ;

    public Node(int _number, Node _leftSon, Node _rightSon) {
        this._number = _number;
        this._leftSon = _leftSon;
        this._rightSon = _rightSon;
    }

    public Node (int number)
    {
        _number = number ;
        _leftSon = null ;
        _rightSon = null ;

    }

    public int getNumber()   {return _number;}
    public Node getLeftSon ()   {return _leftSon;}
    public Node getRightSon ()        {
        return _rightSon;
    }

}




