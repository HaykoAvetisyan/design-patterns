package solid.open_closed;

public class SizeSpecification implements Specification<Product>{


    public Size size;

    public SizeSpecification(Size size){
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size.equals(size);
    }
}

