package solution.vaiv.kr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class test {

	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String temp(ModelAndView ModelAndView) {
			System.out.println("테스트입니다.");
			
		return "eunhyeong/home";
	}
}
