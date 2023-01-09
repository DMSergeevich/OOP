
package DZ1Task1;

import java.util.ArrayList;

public class GeoTree {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    
    public void appendPerentChild(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parents, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

   
    public void appendWifeHusbend(Person wife, Person husbend) {
        tree.add(new Node(wife, Relationship.wife, husbend));
        tree.add(new Node(husbend, Relationship.husbend, wife));
    }

}
