package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PersonInfo;

@Repository
public interface PersonInfoDao extends JpaRepository<PersonInfo, String> {
	// �ۭq�q City : C�n�j�g ,�L�O�ݩʦW��
	// List �O�]���n���h�����
//	public List<PersonInfo> findByCity(String city);

//	public List<PersonInfo> findByNameAndCity(String name,String city);

	public List<PersonInfo> findByNameOrCity(String name, String city);

	// �j��
	public List<PersonInfo> findByAgeGreaterThan(int age);

	// �p�󵥩�
	public List<PersonInfo> findByAgeLessThanEqualOrderByAge(int age);

	// �p�� ��J����1 OR 2
	public List<PersonInfo> findByAgeLessThanOrAgeGreaterThan(int age, int age2);

	// �p�� ��J����1 OR 2 AND �Ѥj��p 3��
	public List<PersonInfo> findTop3ByAgeBetweenOrderByAgeDesc(int age, int age2);

	// city
	public List<PersonInfo> findByCityContaining(String city);
	
	//
	public List<PersonInfo> findByAgeGreaterThanAndCityContainingOrderByAgeDesc(int age,String city);

}
