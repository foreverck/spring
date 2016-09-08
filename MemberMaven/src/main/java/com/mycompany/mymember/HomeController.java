package com.mycompany.mymember;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.mymember.model.MemberService;
import com.mycompany.mymember.model.MemberVO;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Resource(name="memberService")
	private MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	//회원가입 폼
	@RequestMapping("insert.s")
	public String insert(){
		return "insert";
	}
		
	//회원가입
	@RequestMapping(value="insert.s", method=RequestMethod.POST)
	public String insert(@ModelAttribute MemberVO vo){
		memberService.insert(vo);
		return "redirect:list.s";
	}
	
	//전체보기
	@RequestMapping("list.s")
	public String getList(String field, String word, Model model){
		word = word==null?"":word.trim();
			
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("field", field);
		hm.put("word", word);			
		
		List<Object> userlist = memberService.getMemberList(hm);
		
		model.addAttribute("userlist", userlist);
			
		return "list";
	}
	
	//상세보기
	@RequestMapping("detail.s")
	public String findById(String id, Model model){		
		MemberVO vo = memberService.findById(id);		
		model.addAttribute("user", vo);
		return "detail";
	}
	
	//삭제
	@RequestMapping("delete.s")
	public String delete(String id){
		memberService.delete(id);
		return "redirect:list.s";
	}
	
	//수정
	@RequestMapping(value="update.s", method=RequestMethod.POST)
	public String update(MemberVO vo){
		memberService.update(vo);
		return "redirect:list.s";
	}
	
}
