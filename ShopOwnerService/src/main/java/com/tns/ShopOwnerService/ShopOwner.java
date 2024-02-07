package com.tns.ShopOwnerService;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShopOwner
{

	private Integer Id;
	private String Shop_name;
	private String Owner_Name;
	private Integer Ph_Number;
	private Integer Pwd;

	

	
	public ShopOwner() {
		super();
	}
	
	public ShopOwner(Integer id, String shop_name, String owner_Name, Integer ph_Number, Integer pwd) {
		super();
		Id = id;
		Shop_name = shop_name;
		Owner_Name = owner_Name;
		Ph_Number = ph_Number;
		Pwd = pwd;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)


	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getShop_name() {
		return Shop_name;
	}

	public void setShop_name(String shop_name) {
		Shop_name = shop_name;
	}

	public String getOwner_Name() {
		return Owner_Name;
	}

	public void setOwner_Name(String owner_Name) {
		Owner_Name = owner_Name;
	}

	public Integer getPh_Number() {
		return Ph_Number;
	}

	public void setPh_Number(Integer ph_Number) {
		Ph_Number = ph_Number;
	}

	public Integer getPwd() {
		return Pwd;
	}

	public void setPwd(Integer pwd) {
		Pwd = pwd;
	}

	@Override
	public String toString() {
		return "ShopOwner [Id=" + Id + ", Shop_name=" + Shop_name + ", Owner_Name=" + Owner_Name + ", Ph_Number="
				+ Ph_Number + ", Pwd=" + Pwd + "]";
	}

}


