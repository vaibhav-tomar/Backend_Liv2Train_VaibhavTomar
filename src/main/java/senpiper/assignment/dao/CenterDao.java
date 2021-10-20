package senpiper.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import senpiper.assignment.entity.Center;

@Repository
public interface CenterDao extends JpaRepository<Center, Integer> {

}
