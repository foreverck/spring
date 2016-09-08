package com.mycompany.mymember.model;

import java.util.HashMap;
import java.util.List;


public interface MemberDAO {
			//��ü����
			List<Object> getMemberList(String id);
			
			//��ü����
			List<Object> getMemberList(String id,HashMap<Object, Object> hm);
			
			//�߰�
			void insert(String id, MemberVO user);
			
			//�󼼺���
			MemberVO findById(String id, String value);
			
			//����
			void update(String id, MemberVO user);
			
			//����
			void delete(String id, String value);
}
