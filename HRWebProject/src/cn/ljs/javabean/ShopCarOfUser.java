package cn.ljs.javabean;

import java.io.Serializable;

public class ShopCarOfUser implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String type_code;
	private String title;
	private String supplier;
	private double price;
	private double discount;
	private String locality;
	private String putaway_date;
	private int storage;
	private String image;
	private String description;
	private String create_date;
	private String disabled;
	private int articleId;
	private int buyNum;
	private String login_name;
	
	public ShopCarOfUser() {
		// TODO Auto-generated constructor stub
	}

	public ShopCarOfUser(int id, String type_code, String title, String supplier, double price, double discount,
			String locality, String putaway_date, int storage, String image, String description, String create_date,
			String disabled, int articleId, int buyNum, String login_name) {
		super();
		this.id = id;
		this.type_code = type_code;
		this.title = title;
		this.supplier = supplier;
		this.price = price;
		this.discount = discount;
		this.locality = locality;
		this.putaway_date = putaway_date;
		this.storage = storage;
		this.image = image;
		this.description = description;
		this.create_date = create_date;
		this.disabled = disabled;
		this.articleId = articleId;
		this.buyNum = buyNum;
		this.login_name = login_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType_code() {
		return type_code;
	}

	public void setType_code(String type_code) {
		this.type_code = type_code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getPutaway_date() {
		return putaway_date;
	}

	public void setPutaway_date(String putaway_date) {
		this.putaway_date = putaway_date;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public int getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ShopCarOfUser [id=" + id + ", type_code=" + type_code + ", title=" + title + ", supplier=" + supplier
				+ ", price=" + price + ", discount=" + discount + ", locality=" + locality + ", putaway_date="
				+ putaway_date + ", storage=" + storage + ", image=" + image + ", description=" + description
				+ ", create_date=" + create_date + ", disabled=" + disabled + ", articleId=" + articleId + ", buyNum="
				+ buyNum + ", login_name=" + login_name + "]";
	}
	
	

}
