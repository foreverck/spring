package com.mycompany.mymember.model;

import java.util.HashMap;
import java.util.List;


public interface MemberDAO {
			//전체보기
			List<Object> getMemberList(String id);
			
			//전체보기
			List<Object> getMemberList(String id,HashMap<Object, Object> hm);
			
			//추가
			void insert(String id, MemberVO user);
			
			//상세보기
			MemberVO findById(String id, String value);
			
			//수정
			void update(String id, MemberVO user);
			
			//삭제
			void delete(String id, String value);
}
