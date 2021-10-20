package senpiper.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import senpiper.assignment.dao.CenterDao;
import senpiper.assignment.entity.Center;

@Service
public class CenterServiceImpl implements CenterService {

	@Autowired
	CenterDao centerDao;
	
	@Override
	public Center saveCenter(Center center) {
		
		return centerDao.save(center);
	}

	@Override
	public List<Center> getCenters() {
		return centerDao.findAll();
	}

	@Override
	public Optional<Center> getCenterById(Integer id) {
		return centerDao.findById(id);
	}

}
