package solid.dependency_inversion;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;

public class Relationships {
    private List<Triplet<Person,Relationship,Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child){
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    public List<Triplet<Person,Relationship,Person>> getRelations() {
        return relations;
    }
}
