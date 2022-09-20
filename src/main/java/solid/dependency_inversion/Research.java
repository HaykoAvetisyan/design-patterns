package solid.dependency_inversion;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;

public class Research {


    public Research(Relationships relationship){
        List<Triplet<Person, Relationship, Person>> relations = new ArrayList<Triplet<Person, Relationship, Person>>();
        relations.stream()
                .filter(x->x.getValue0().name.equals("John") && x.getValue1() == Relationship.PARENT)
                .forEach(ch -> System.out.println("John has a child" + ch.getValue2().name));
    }
}
