public final class Invoice {
    private final float totalCost;
    private final float totalTax;
    private final int totalItems;


    public Invoice(float totalCost, float totalTax, int totalItems) {
        this.totalCost = totalCost;
        this.totalTax = totalTax;
        this.totalItems = totalItems;
    }

    public Invoice(){
        this.totalTax = 0;
        this.totalCost = 0;
        this.totalItems = 0;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public float getTotalTax() {
        return totalTax;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public float getGrandTotal(){
        return totalCost + totalTax;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "totalCost=%.2f" + totalCost +
                ", totalTax=%.2f" + totalTax +
                ", totalItems=" + totalItems +
                ", grandTotal=%.2f" + getGrandTotal() +
                '}';
    }
}
