package solid.open_closed;

public class ColorSpecification implements Specification<Product>{

    public Color color;

    public ColorSpecification(Color color){
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color.equals(color);
    }
}
