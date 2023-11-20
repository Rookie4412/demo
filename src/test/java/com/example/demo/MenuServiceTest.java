package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.Menu;
import com.example.demo.repository.MenuDao;
import com.example.demo.service.ifs.MenuService;

// �������N�Τ�����
//�פJ@SpringBootTest�~��ϥΩҦ��Q�U�ު��F��
@SpringBootTest
public class MenuServiceTest {

	@Autowired
	private MenuService menuService;

	@Autowired
	private MenuDao menuDao;

//	@Test
//	public void addMenuTest() {
//		Menu result = menuService.addMenu(new Menu("beef", 120));
//		Assert.isTrue(result != null, "addMenu error");
//	}
//
	@Test
	public void addMenuTest2() {
		Menu result = menuService.addMenu(new Menu("fish", 120));
		Assert.isTrue(result == null, "addMenu error");
	}

	@Test
	public void addMenuTest3() {
		// name ���ŦX����
		Menu result = menuService.addMenu(new Menu("", 120));
		Assert.isTrue(result == null, "addMenu error");
		// peice = 0
		result = menuService.addMenu(new Menu("chicken", 0));
		Assert.isTrue(result == null, "addMenu error");
		// ���`�s�W
		result = menuService.addMenu(new Menu("fish1", 120));
		Assert.isTrue(result != null, "addMenu error");
		// �s�W�w�s�b��menu
		result = menuService.addMenu(new Menu("fish1", 150));
		Assert.isTrue(result == null, "addMenu error");

		menuDao.deleteById("fish1");
	}

	@Test
	public void updateMenuTest() {
		// name ���ŦX����
		Menu result = menuService.updateMenu(new Menu("", 120));
		Assert.isTrue(result == null, "updateMenu error");
		// peice = 0
		result = menuService.updateMenu(new Menu("chicken", 0));
		Assert.isTrue(result == null, "updateMenu error");
		// ��s���s�b�� menu
		result = menuService.updateMenu(new Menu("fish1", 120));
		Assert.isTrue(result == null, "updateMenu error");
		// ���`�s�W��A�R��
		result = menuService.addMenu(new Menu("fish1", 120));
		result = menuService.updateMenu(new Menu("fish1", 150));
		Assert.isTrue(result != null, "updateMenu error");
		Assert.isTrue(result.getPrice() == 150, "updateMenu error");
		// �R�����ո��
		menuDao.deleteById("fish1");
	}

	@Test
	public void findByNameTest() {
		// name ���ŦX����
		Menu result = menuService.findByName("");
		Assert.isTrue(result == null, "findByName error");
		// name ���s�b
		result = menuService.findByName("fish1");
		Assert.isTrue(result == null, "findByName error");
		// �s�W���ո��
		result = menuService.addMenu(new Menu("fish1", 120));
		result = menuService.findByName("fish1");
		Assert.isTrue(result != null, "updateMenu error");
		// �R�����ո��
		menuDao.deleteById("fish1");
	}

}
