
package classes;

public class property {
    private int pro_id;
    private String pro_name;
    private String pro_type;
    private int price;
    private String pro_img_url;
    private String description;
    private int pro_quantity;
    private int seller_id ;
    
    public property(int pro_id, String pro_name, String pro_type, int price, String pro_img_url, String description, int pro_quantity, int seller_id) {
        this.pro_id = pro_id;
        this.pro_name = pro_name;
        this.pro_type = pro_type;
        this.price = price;
        this.pro_img_url = pro_img_url;
        this.description = description;
        this.pro_quantity = pro_quantity;
        this.seller_id = seller_id;
    }

    public int getProId() {
        return pro_id;
    }

    public void setProId(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getProName() {
        return pro_name;
    }

    public void setProName(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getProType() {
        return pro_type;
    }

    public void setProType(String pro_type) {
        this.pro_type = pro_type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProImgUrl() {
        return pro_img_url;
    }

    public void setProImgUrl(String pro_img_url) {
        this.pro_img_url = pro_img_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProQuantity() {
        return pro_quantity;
    }

    public void setProQuantity(int pro_quantity) {
        this.pro_quantity = pro_quantity;
    }

    public int getSellerId() {
        return seller_id;
    }

    public void setSellerId(int seller_id) {
        this.seller_id = seller_id;
    }
    
}
