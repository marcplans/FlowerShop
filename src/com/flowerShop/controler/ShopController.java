package com.flowerShop.controler;

import java.util.ArrayList;

import com.flowerShop.model.FlowerShop;

public class ShopController {
	
	private ArrayList<FlowerShop> shopList= new ArrayList<>();
	
	
	//Create new shop
	public String createNewShop (String shopName)
	{
		shopList.add(new FlowerShop(shopName));
			
		return "La tienda "+shopName+" ya está creada.";
	}
	
	

}
