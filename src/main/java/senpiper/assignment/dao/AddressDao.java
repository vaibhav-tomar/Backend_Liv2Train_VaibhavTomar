package senpiper.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import senpiper.assignment.entity.Address;

public interface AddressDao extends JpaRepository<Address, Integer> {

}
