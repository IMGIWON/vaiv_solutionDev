package solution.first.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import solution.first.mapper.FirstMapper;
import solution.first.vo.FirstVo;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
    private FirstMapper firstMapper;
	
	// 기원
	@RequestMapping(value = "/giwon")
	public String giwonHome(Locale locale, Model model, String test) {
		System.out.println("giwon IN");
		try {
			test = firstMapper.getList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("user_name = " + test);
		logger.info("asd home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "giwon/home";
	}
	
	// 은영
	@RequestMapping(value = "/eunhyeong", method = RequestMethod.GET)
	public String eunhyeongHome(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "eunhyeong/home";
	}
	
	
	// 종우
	@RequestMapping(value = "/jongwoo", method = RequestMethod.GET)
	public String jongwooHome(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "jongwoo/home";
	}
	
	// 우현
	@RequestMapping(value = "/woohyun", method = RequestMethod.GET)
	public String woohyunHome(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "woohyun/home";
	}
	
	// 예슬
	@RequestMapping(value = "/yeseul", method = RequestMethod.GET)
	public String yeseulHome(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "yeseul/home";
	}
	
}
