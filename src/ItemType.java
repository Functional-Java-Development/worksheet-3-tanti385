import java.util.HashMap;
import java.util.Map;

public class ItemType {

    public static float getTaxRate(Item.Type itemType) {

        Map<Item.Type, Float> map = new HashMap<Item.Type, Float>();

        map.put(Item.Type.ART, 0.05f);
        map.put(Item.Type.CONFECTIONARY, 0.06f);
        map.put(Item.Type.REPAIRS, 0.075f);
        map.put(Item.Type.PHARMACEUTICAL, 0.0f);
        map.put(Item.Type.GOODS, 0.18f);

        return map.get(itemType);
    }
}
