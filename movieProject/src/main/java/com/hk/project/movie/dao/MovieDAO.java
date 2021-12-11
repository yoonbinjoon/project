package com.hk.project.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hk.project.movie.vo.MovieVO;

@Repository
public class MovieDAO {

	@Autowired
	SqlSession sqlSession;
	
	public List<MovieVO> selectAllMovies(){
		List<MovieVO> moviesList = sqlSession.selectList("mapper.movie.movieList");
		return moviesList;
	}
	
}
