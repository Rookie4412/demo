package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.PersonInfoDao;
import com.example.demo.service.ifs.PersonInfoService;

@SpringBootTest
public class PersonInfoServiceTest {

	@Autowired
	public PersonInfoService personinfoService;

	@Autowired
	public PersonInfoDao personinfoDao;

	@Test
	public void addInfoTest() {

		personinfoService.addInfo(new PersonInfo("W123456789", "Rook", 19, "�x��"));
	}

	@Test
	public void addInfoTest1() {

		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("A123456789", "LIsa", 29, "Taiwan"));
		list.add(new PersonInfo("L123456789", "Hook", 30, "Taiwan"));

		personinfoService.addInfoList(list);
	}

	@Test
	public void daoTest() {

		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("X123456789", "Rook", 39, "�x��"));
		list.add(new PersonInfo("J123456789", "Hcivk", 59, "Pingtung"));

		personinfoDao.saveAll(list);
		// �s�J�h�����saveAll
	}

	@Test
	public void daoFindText() {
		// findById �O�� @Id
		Optional<PersonInfo> infoOp = personinfoDao.findById("J123456789");
//		Empty�O�Ū��N��
		if (infoOp.isEmpty()) {
			System.out.println("Not Found!!");
			return;
		} else {
			System.out.println(infoOp.get().getName());
		}
	}

	@Test
	public void daoFindText1() {
		List<PersonInfo> list = personinfoDao.findAll();
		for (PersonInfo item : list) {
			System.out.println(item.getName());
		}
	}

	@Test
	public void daoFindText2() {
		// ���Ʈw�̪�Id
		boolean result = personinfoDao.existsById("J123456789");
		System.out.println(result);
	}

	@Test
	public void daoFindText3() {
//		List<PersonInfo> result = personinfoDao.findByCity("Taiwan");
//		List<PersonInfo> result = personinfoDao.findByNameAndCity("Taiwan");
		List<PersonInfo> result = personinfoDao.findByNameOrCity("HoLe", "WPW");

		for (PersonInfo item : result) {
			System.out.println(item.getName());
		}
	}

	// �j��
	@Test
	public void GreaterThanText() {
		List<PersonInfo> res = personinfoDao.findByAgeGreaterThan(50);
		for (PersonInfo item : res) {
			System.out.println(item.getId() + " " + item.getName() + " :" + item.getAge());
		}
	}

	// �p�󵥩� �A �Ѥp��j
	@Test
	public void LessThanEqualText() {
		List<PersonInfo> res = personinfoDao.findByAgeLessThanEqualOrderByAge(59);
		for (PersonInfo item : res) {
			System.out.println(item.getId() + " " + item.getName() + " :" + item.getAge());
		}
	}

	// �p�� ��J����1 OR 2
	@Test
	public void betweenText() {
		List<PersonInfo> res = personinfoDao.findByAgeLessThanOrAgeGreaterThan(30, 50);
		for (PersonInfo item : res) {
			System.out.println(item.getId() + " " + item.getName() + " " + item.getCity() + " :" + item.getAge());
		}
	}

	// �p�� ��J����1 OR 2
	@Test
	public void DescText() {
		List<PersonInfo> res = personinfoDao.findTop3ByAgeBetweenOrderByAgeDesc(30, 60);
		for (PersonInfo item : res) {
			System.out.println(item.getId() + " " + item.getName() + " " + item.getCity() + " :" + item.getAge());
		}
	}
	
	//city
	@Test
	public void cityText() {
		List<PersonInfo> res = personinfoDao.findByCityContaining("Taiwan");
		for (PersonInfo item : res) {
			System.out.println(item.getId() + " " + item.getName() + " " + item.getCity() + " :" + item.getAge());
		}
	}
	//
	@Test
	public void ageAndcityText() {
		List<PersonInfo> res = personinfoDao.findByAgeGreaterThanAndCityContainingOrderByAgeDesc(10, "Taiwan");
		for (PersonInfo item : res) {
			System.out.println(item.getId() + " " + item.getName() + " " + item.getCity() + " :" + item.getAge());
		}
	}
}
