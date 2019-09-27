import java.util.function.Predicate;

public final class Voucher {

    private final String description;
    private final String voucherCode;
    private final float discount;
    private final Predicate<Invoice> filter;

    public Voucher(String description, String voucherCode, float discount, Predicate<Invoice> filter) {
        this.description = description;
        this.voucherCode = voucherCode;
        this.discount = discount;
        this.filter = filter;
    }

    public String getDescription() {
        return description;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public float getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "description='" + description + '\'' +
                ", voucherCode='" + voucherCode + '\'' +
                ", discount=" + discount +
                '}';
    }


    public Invoice apply(Invoice invoice){
        if (filter.test(invoice)) {
            return new Invoice(invoice.getTotalCost()*(1-discount), invoice.getTotalTax()*(1-discount),invoice.getTotalItems());
        } else {
            return invoice;
        }
    }
}
