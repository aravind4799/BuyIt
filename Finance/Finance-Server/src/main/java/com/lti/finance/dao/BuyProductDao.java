package com.lti.finance.dao;

import java.util.List;

import com.lti.finance.beans.BuyProduct;

public interface BuyProductDao {
	
	List<BuyProduct> getProductListById(long userId);
	 BuyProduct addEmi(BuyProduct buyprod);
	 List<BuyProduct> getBuyProductListById(long userId);

	


}
