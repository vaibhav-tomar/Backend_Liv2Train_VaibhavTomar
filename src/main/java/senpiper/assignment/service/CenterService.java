package senpiper.assignment.service;

import java.util.List;
import java.util.Optional;

import senpiper.assignment.entity.Center;

public interface CenterService {
	
	public Center saveCenter(Center center);
	
	public List<Center> getCenters();

	public Optional<Center> getCenterById(Integer id);

}
