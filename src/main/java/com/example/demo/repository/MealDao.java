package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;

// MealId �����޲z �b�@�_���Өϥ�
@Repository
public interface MealDao extends JpaRepository<Meal, MealId> {

	// findTOP�Ʀr : ����j�M���G���^�ǵ��� findTop2ByName �᭱�@�w�n���@�ӰѼ�
	public List<Meal> findTop2ByName(String name);

	// findFirst�Ʀr : ����j�M���G���^�ǵ���
	public List<Meal> findFirst2ByName(String name);

	// orderBy �Ƨ� �w�] : ASC
	// ASC : �Ѥp��j DESC : �Ѥj��p
//	findAll (By) Order (By) Price
	public List<Meal> findByNameOrderByPrice(String name);

	public List<Meal> findAllByOrderByPrice();

	public List<Meal> findAllByOrderByPriceAsc();

	public List<Meal> findAllByOrderByPriceDesc();

	// ����j�p:
	// 1. �j�� : GreaterThan 2. �j�󵥩� : GreaterThanEqual
	// 3. �p�� : LessThan 4. �p�󵥩� : LessThanEqual
	public List<Meal> findAllByPriceGreaterThan(int price);

	// ���T�����B
	public List<Meal> findAllByNameAndPrice(String name, int price);

	// �]�t
	public List<Meal> findByNameContaining(String name);

	public List<Meal> findByNameContainingAndCookingStyleContaining(String name, String cookingStyle);
	
	//between : ���]�t�W�U�ɪ���
	public List<Meal> findByPriceBetween(int price, int price2);
	
	public List<Meal> findByPriceBetweenOrderByPrice(int price, int price2);
	
	//in
	public List<Meal> findByPriceIn(List<Integer> price);
	
	public List<Meal> findByPriceNotIn(List<Integer> price);



}
