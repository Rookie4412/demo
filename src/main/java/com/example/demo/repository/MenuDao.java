package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Menu;

//�إߤ���
//�ᵹ��Ʈw�U��
@Repository
public interface MenuDao extends JpaRepository<Menu, String> {

	public List<Menu> findByPrice(int price);
}
