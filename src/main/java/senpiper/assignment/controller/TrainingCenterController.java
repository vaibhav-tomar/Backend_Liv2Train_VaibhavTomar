package senpiper.assignment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import senpiper.assignment.dto.CenterDto;
import senpiper.assignment.entity.Center;
import senpiper.assignment.service.AddressService;
import senpiper.assignment.service.CenterService;

@RestController
@RequestMapping("/api")
public class TrainingCenterController {

	@Autowired
	CenterService theCenterService;
	
	@Autowired
	AddressService theAddressService;
	
	// adding mapping for POST /centers - to add new training center
	@PostMapping("/centers")
	public Center addCenter(@Valid @RequestBody CenterDto theCenterDto) {
		
		Center tempCenter = getCenter(theCenterDto);
		theAddressService.saveAddress(tempCenter.getAddress());
		
		return theCenterService.saveCenter(tempCenter);
		
	}
	
	// implementing the DTO 
	private Center getCenter(CenterDto theCenterDto) {
		Center theCenter = new Center();
		theCenter.setCenterName(theCenterDto.getCenterName());
		theCenter.setCenterCode(theCenterDto.getCenterCode());
		theCenter.setEmail(theCenterDto.getEmail());
		theCenter.setPhone(theCenterDto.getPhone());
		theCenter.setStudentCapacity(theCenterDto.getStudentCapacity());
		theCenter.setAddress(theCenterDto.getAddress());
		
		// parsing list of courses to string
		String temp ="";
		for(String course : theCenterDto.getCourses()) {
			temp += course + ", ";
		}
		theCenter.setCourses(temp.substring(0,temp.length()-2));
		
		// server time stamp in miliseconds
		theCenter.setCreatedOn(theCenterDto.getCreatedOn());
		
		return theCenter;
		
	}
		
		
	
	//add GET mapping for /centers - to get all the training centers
	@GetMapping("/centers")
	public List<Center> getCenters(@RequestParam(required = false) Integer id) {
		
		if(id == null)
		return theCenterService.getCenters();
		
		else {
			Optional<Center> center =  theCenterService.getCenterById(id);
			Center tempCenter = center.get();
			List<Center> theCenter= new ArrayList<>();
			theCenter.add(tempCenter);
			return theCenter;
		}
		
	}
	
	
	
	
	
	
	
	
}
