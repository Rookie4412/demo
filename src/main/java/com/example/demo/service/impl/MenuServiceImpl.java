package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Menu;
import com.example.demo.repository.MenuDao;
import com.example.demo.service.ifs.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	// @�N��= annotation ; Autowired �N��O��Q�U�ު���Ʈ��ӥ�
	@Autowired
	private MenuDao menuDao;

	@Override
	public Menu addMenu(Menu menu) {
		if (!StringUtils.hasLength(menu.getName()) || menu.getPrice() <= 0) {
			return null;
		}
		if (menuDao.existsById(menu.getName())) {
			return null;
		}
		return menuDao.save(menu);
	}

	@Override
	public List<Menu> addMenuList(List<Menu> menuList) {
		for (Menu item : menuList) {
			if (!StringUtils.hasLength(item.getName()) || item.getPrice() <= 0) {
				return null;
			}
		}
		return menuDao.saveAll(menuList);
	}

	@Override
	public Menu updateMenu(Menu menu) {
		if (!StringUtils.hasLength(menu.getName()) || menu.getPrice() <= 0) {
			return null;
		}
		if (!menuDao.existsById(menu.getName())) {
			return null;
		}
		return menuDao.save(menu);
	}

	@Override
	public Menu findByName(String name) {
		if (!StringUtils.hasText(name)) {
			return null;
		}
		Optional<Menu> op = menuDao.findById(name);
//		return op.orElseGet(null);
		if (op.isEmpty()) {
			return null;
		}
		return op.get();
		// �T����
//		Menu menu = op.isEmpty() ? null : op.get();
//		return op.get();
		// ��²�T����
//		return op.isEmpty() ? null : op.get();
	}

	@Override
	public List<Menu> findAll() {
		return menuDao.findAll();
	}
}
