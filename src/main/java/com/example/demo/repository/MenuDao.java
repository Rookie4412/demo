package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Menu;

//建立介面
//丟給資料庫託管
@Repository
public interface MenuDao extends JpaRepository<Menu, String> {

	public List<Menu> findByPrice(int price);
}
