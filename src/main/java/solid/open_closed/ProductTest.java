package solid.open_closed;

import java.util.List;

public class ProductTest {

    public static void main(String[] args) {

        Product apple = new Product("Apple",Color.RED,Size.SMALL);
        Product house = new Product("Home",Color.GREEN,Size.SMALL);
        Product tree = new Product("Tree",Color.BLUE,Size.LARGE);


        List<Product> products = List.of(apple, house, tree);

        ProductFilter filter = new ProductFilter();

        System.out.println("GREEN Products are");


        filter.filterByColor(products,Color.RED)
                .forEach(product -> System.out.println(" - "  + product.name + " is RED"));


        BetterFilter betterFilter = new BetterFilter();
        System.out.println("GREEN Products are");

        betterFilter.filter
                (products,new ColorSpecification(Color.GREEN))
                .forEach(product -> System.out.println(" - " + product.name + " is GREEN"));


        betterFilter.filter(products,
                new AndSpecification<>(
                new ColorSpecification(Color.GREEN),
                new SizeSpecification(Size.SMALL)
        ))
                .forEach(product -> System.out.println(product.name + "is GREEN and small"));
    }
}
