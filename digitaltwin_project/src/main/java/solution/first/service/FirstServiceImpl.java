package solution.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solution.first.dao.FirstDAO;


public class FirstServiceImpl implements FirstService {

	@Autowired
	FirstDAO firstDao;
	
	@Override
	public String selectTest() {
		String result = firstDao.selectTest();
		return result;
	}
	
}


