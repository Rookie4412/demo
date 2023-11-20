package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PersonInfo;

@Repository
public interface PersonInfoDao extends JpaRepository<PersonInfo, String> {
	// 自訂義 City : C要大寫 ,他是屬性名稱
	// List 是因為要拿多筆資料
//	public List<PersonInfo> findByCity(String city);

//	public List<PersonInfo> findByNameAndCity(String name,String city);

	public List<PersonInfo> findByNameOrCity(String name, String city);

	// 大於
	public List<PersonInfo> findByAgeGreaterThan(int age);

	// 小於等於
	public List<PersonInfo> findByAgeLessThanEqualOrderByAge(int age);

	// 小於 輸入條件1 OR 2
	public List<PersonInfo> findByAgeLessThanOrAgeGreaterThan(int age, int age2);

	// 小於 輸入條件1 OR 2 AND 由大到小 3筆
	public List<PersonInfo> findTop3ByAgeBetweenOrderByAgeDesc(int age, int age2);

	// city
	public List<PersonInfo> findByCityContaining(String city);
	
	//
	public List<PersonInfo> findByAgeGreaterThanAndCityContainingOrderByAgeDesc(int age,String city);

}
