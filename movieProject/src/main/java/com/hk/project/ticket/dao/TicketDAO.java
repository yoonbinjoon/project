package com.hk.project.ticket.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hk.project.ticket.vo.TicketVO;

@Repository
public class TicketDAO {

	@Autowired
	SqlSession sqlSession;
	
	public List<TicketVO> viewTicket(String id) {
		List<TicketVO> ticketList = sqlSession.selectList("mapper.ticket.myBooking",id);
		return ticketList;
	}

}
