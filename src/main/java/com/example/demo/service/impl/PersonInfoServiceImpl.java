package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.PersonInfoDao;
import com.example.demo.service.ifs.PersonInfoService;

@Service
public class PersonInfoServiceImpl implements PersonInfoService {

	@Autowired
	private PersonInfoDao personinfoDao;

	@Override
	public void addInfo(PersonInfo info) {

		String pattern = "^[A-Za-z][1-2]\\d{8}$";
		String id = info.getId();
//		if(info.getId().matches(pattern)) {
//			System.out.println("¥¿½T");
//			personinfoDao.save(info);
//		}else {
//			System.out.println("¿ù»~");
//		}
		if (StringUtils.hasText(id) && id.matches(pattern)) {
			System.out.println("¥¿½T");
			personinfoDao.save(info);
		} else {
			System.out.println("¿ù»~");
		}
	}

	@Override
	public void addInfoList(List<PersonInfo> infoList) {
		String pattern = "^[A-Za-z][1-2]\\d{8}$";
		for (PersonInfo item : infoList) {
			String id = item.getId();
			if (!StringUtils.hasLength(id) || !id.matches(pattern)) {
				System.out.println("id error!!");
				return;
			}
		}
		personinfoDao.saveAll(infoList);

	}

}
