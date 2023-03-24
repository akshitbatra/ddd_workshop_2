import com.tw.ddd_workshop.domain.Cart;
import com.tw.ddd_workshop.domain.Item;
import com.tw.ddd_workshop.domain.Product;

public class Main {
    public static void main(String[] args) {
            Cart cart = new Cart();
            Product pencil = new Product("Apple Pencil");

            Item item = new Item(pencil, 2);
            cart.add(item);

            System.out.println(cart);
    }
}