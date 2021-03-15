package solution.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import solution.dto.BoardDto;
import solution.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping("list")
	public ModelAndView notice(HttpServletRequest request, BoardDto boardDto) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		// 목록 갯수
		String testName = this.boardService.selectTest();
		
		// 목록
		
		mv.addObject("totalCnt", testName);
		mv.addObject("list", testName);
		mv.addObject("boardDto", testName);
		
		return mv;
	}
}