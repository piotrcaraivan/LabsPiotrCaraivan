public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    // Setters and Getters
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = Math.max(pricePerItem, 0.0);
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Метод расчета суммы счета-фактуры
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

class InvoiceTest {
    public static void main(String[] args) {
        // Создание объекта Invoice
        Invoice invoice = new Invoice("1337", "HansZimmer", 5, 19.95);

        // Отображение сведений о счете-фактуре
        System.out.println("Номер детали: " + invoice.getPartNumber());
        System.out.println("Описание детали: " + invoice.getPartDescription());
        System.out.println("Количество: " + invoice.getQuantity());
        System.out.println("Цена за штуку: " + invoice.getPricePerItem());

        // Отображение общей суммы счета-фактуры
        System.out.println("Сумма счета-фактуры: " + invoice.getInvoiceAmount());
    }
}
