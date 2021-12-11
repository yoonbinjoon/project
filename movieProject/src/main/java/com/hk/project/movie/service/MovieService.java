package com.hk.project.movie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.project.movie.dao.MovieDAO;
import com.hk.project.movie.vo.MovieVO;

@Service
public class MovieService {

	@Autowired
	MovieDAO movieDAO;
	
	public List<List<MovieVO>> selectAllMovies(){
		// init return value
		List<List<MovieVO>> returnMovieVOList = new ArrayList<List<MovieVO>>();
		
		// get movie list
		List<MovieVO> movieDaoList = movieDAO.selectAllMovies();
		
		// 4���� �߶�ֱ� 
		int count = 0;
		List<MovieVO> tempMovieDaoList = new ArrayList<MovieVO>();
		
		for (MovieVO movieVO : movieDaoList) {
			count += 1;
			tempMovieDaoList.add(movieVO);
			
			if (count == 4) {
				count = 0;
				returnMovieVOList.add(tempMovieDaoList);
				tempMovieDaoList = new ArrayList<MovieVO>();
			}
		}
		
		//  ���� ��ȭ ����Ʈ �ֱ�
		if (count != 0) {
			returnMovieVOList.add(tempMovieDaoList);	
		}
		
		return returnMovieVOList;
	}
}
