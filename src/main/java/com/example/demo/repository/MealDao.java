package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;

// MealId 先做管理 在一起拿來使用
@Repository
public interface MealDao extends JpaRepository<Meal, MealId> {

	// findTOP數字 : 限制搜尋結果的回傳筆數 findTop2ByName 後面一定要給一個參數
	public List<Meal> findTop2ByName(String name);

	// findFirst數字 : 限制搜尋結果的回傳筆數
	public List<Meal> findFirst2ByName(String name);

	// orderBy 排序 預設 : ASC
	// ASC : 由小到大 DESC : 由大到小
//	findAll (By) Order (By) Price
	public List<Meal> findByNameOrderByPrice(String name);

	public List<Meal> findAllByOrderByPrice();

	public List<Meal> findAllByOrderByPriceAsc();

	public List<Meal> findAllByOrderByPriceDesc();

	// 比較大小:
	// 1. 大於 : GreaterThan 2. 大於等於 : GreaterThanEqual
	// 3. 小於 : LessThan 4. 小於等於 : LessThanEqual
	public List<Meal> findAllByPriceGreaterThan(int price);

	// 找精確的金額
	public List<Meal> findAllByNameAndPrice(String name, int price);

	// 包含
	public List<Meal> findByNameContaining(String name);

	public List<Meal> findByNameContainingAndCookingStyleContaining(String name, String cookingStyle);
	
	//between : 有包含上下界的值
	public List<Meal> findByPriceBetween(int price, int price2);
	
	public List<Meal> findByPriceBetweenOrderByPrice(int price, int price2);
	
	//in
	public List<Meal> findByPriceIn(List<Integer> price);
	
	public List<Meal> findByPriceNotIn(List<Integer> price);



}
