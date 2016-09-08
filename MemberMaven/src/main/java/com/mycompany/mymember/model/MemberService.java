package com.mycompany.mymember.model;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mycompany.mymember.model.MemberVO;



@Service("memberService")
public class MemberService {
	@Resource(name="memberDAO")
	private MemberDAO memberDAO;
	
	//��ü����
	
	public List<Object> getMemberList(){
		return memberDAO.getMemberList("listData");
	}
	
	//��ü����
	
	public List<Object> getMemberList(HashMap<Object, Object> hm){
		return memberDAO.getMemberList("listData", hm);
	}
	
	//�߰�
	
	public void insert(MemberVO vo){
		memberDAO.insert("insertData", vo);
	}
	
	//�󼼺���
	
	public MemberVO findById(String id){
		return memberDAO.findById("viewData", id); 
	}
	
	//����
	
	public void delete(String id){
		memberDAO.delete("deleteData", id);
	}
	
	//����
	
	public void update(MemberVO vo){
		memberDAO.update("updateData", vo);
	}

}
