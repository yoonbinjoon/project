package com.hk.project.screendate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.project.screendate.dao.ScreenDateDAO;
import com.hk.project.screendate.vo.ScreenDateVO;

@Service
public class ScreenDateService {
	
	@Autowired
	ScreenDateDAO screenDateDAO;

	public int insertScreenDate(ScreenDateVO screenDateVO) {
		return screenDateDAO.insertScreenDate(screenDateVO);
	}

	public List<ScreenDateVO> selectScreenDateList() {
		return screenDateDAO.selectScreenDateList();
	}

}
