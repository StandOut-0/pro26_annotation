package com.spring.ex02;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("loginController")
public class LoginController {

	@RequestMapping(value = { "test/loginForm.do", "test/loginForm2.do" }, method = { RequestMethod.GET })
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm");
		return mav;
	}

	@RequestMapping(value = "test/login.do", method = { RequestMethod.GET, RequestMethod.POST })
//	1. request.getParameter으로 파라미터 가져오기
//	public ModelAndView login(HttpServletRequest request, HttpServletRequest response) {
//		String userID = request.getParameter("userID");
//		String userName = request.getParameter("userName");
//		String userEmail = request.getParameter("userEmail");

//	2. @RequestParam으로 파라미터 가져오기	
//	public ModelAndView login(
//			@RequestParam("userID") String userID, 
//			@RequestParam("userName") String userName,
//			@RequestParam("userEmail") String userEmail,
//			HttpServletRequest request, HttpServletResponse response) {

//  3. required true일경우 오류발생, false일경우 null값 할당
//	public ModelAndView login(
//			@RequestParam("userID") String userID,
//			@RequestParam("userName") String userName,
//			@RequestParam(value="userEmail", required = true) String userEmail,
////			@RequestParam(value="userEmail", required = false) String userEmail,
//			HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("false일때 값이 뜨나요?"+userEmail);
//		System.out.println("true일때 값이 뜨나요?"+userEmail);

//	1 ~ 3에 쓰임
//	ModelAndView mav = new ModelAndView();
//	mav.setViewName("result");mav.addObject("userID", userID);
//	mav.addObject("userName", userName);mav.addObject("userEmail", userEmail);

// 	4. Map으로 출력하기
//	public ModelAndView login(@RequestParam Map<String, String> info1, HttpServletRequest request,
//			HttpServletResponse response) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("info1", info1);
//		mav.setViewName("result");

//	5. @ModelAttribute로 출력하기
//	public ModelAndView login(
//			@RequestParam("userEmail") String userEmail, 
//			@ModelAttribute("info2") LoginVO loginvo,
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("result");
//		mav.addObject("userEmail", userEmail);

//	6. Model 인터페이스로 바로 출력하기
	public String login(Model model, HttpServletRequest request, HttpServletResponse response) {
		model.addAttribute("userID", "sanghee");
		model.addAttribute("userName", "박상희");
		model.addAttribute("userEmail", "sanghee@sanghee.com");
		return "result";
		
		//1 ~ 5에서 쓰임
//		return mav;

	}

}
