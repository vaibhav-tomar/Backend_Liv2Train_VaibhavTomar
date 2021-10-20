package senpiper.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import senpiper.assignment.dao.AddressDao;
import senpiper.assignment.entity.Address;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	AddressDao addressDao;
	
	@Override
	public void saveAddress(Address theAddress) {
		
		addressDao.save(theAddress);
		
	}

}
