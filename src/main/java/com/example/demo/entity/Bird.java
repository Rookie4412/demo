package com.example.demo.entity;

//extends �@�w�n�[s
public class Bird extends Animal {

	public Bird() {
		super();
//		System.out.println("Bird �غc��k");
	}

	// @Override:�мg OR ���s�w�q
	// ���l���O���ۦP��k(�W�� + �ѼƭӼ�)�A�l���O�惡��k���s�w�q�ۤv��@���e
	// @Override �[�F�i�H�����ۤv�����O���ۦP��k
	@Override
	public void eat() {
		System.out.println(super.getName() + " �䪱��Y!!!");
	}

	public void sleep() {
		System.out.println(super.getName() + " �䪱���ZZZ");
	}

	public void flying() {
		System.out.println(super.getName() + " ���b��~~~");
	}

}
