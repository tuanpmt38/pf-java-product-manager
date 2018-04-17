import java.io.Serializable;

public class ProductManager implements Serializable {
    private String produc_code;
    private String product_name;
    private String manufacetrue;
    private double price;
    private String other_desception;

    public String getProduc_code() {
        return produc_code;
    }

    public void setProduc_code(String produc_code) {
        this.produc_code = produc_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getManufacetrue() {
        return manufacetrue;
    }

    public void setManufacetrue(String manufacetrue) {
        this.manufacetrue = manufacetrue;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOther_desception() {
        return other_desception;
    }

    public void setOther_desception(String other_desception) {
        this.other_desception = other_desception;
    }

    ProductManager() {

    }

    public ProductManager(String produc_code, String product_name, String manufacetrue, double price, String other_desception) {
        this.produc_code = produc_code;
        this.product_name = product_name;
        this.manufacetrue = manufacetrue;
        this.price = price;
        this.other_desception = other_desception;
    }


}
