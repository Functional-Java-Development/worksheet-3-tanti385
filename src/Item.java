public class Item {

    enum Type {ART, CONFECTIONARY, REPAIRS, PHARMACEUTICAL, GOODS};

    private final Type type;
    private final String name;
    private final float costPerUnit;
    private final float quantity;

    public Item(Type type, String name, float costPerUnit, float quantity) {
        this.type = type;
        this.name = name;
        this.costPerUnit = costPerUnit;
        this.quantity = quantity;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public float getCostPerUnit() {
        return costPerUnit;
    }

    public float getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", costPerUnit=" + costPerUnit +
                ", quantity=" + quantity +
                '}';
    }
}
