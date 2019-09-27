import java.util.List;
import java.util.Optional;

public class ShoppingCart {

    private final List<Item> list;
    private final String couponCode;


    public ShoppingCart(List<Item> list, String couponCode) {
        this.list = list;
        this.couponCode = couponCode;
    }

    public Optional<String> getCouponCode() {
        return Optional.ofNullable(couponCode);
    }
}
