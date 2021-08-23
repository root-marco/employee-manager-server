package com.slowed.employeemanager.repository;

import com.slowed.employeemanager.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {

  void deleteEmployeeById(Long id);

  Optional<EmployeeModel> findEmployeeById(Long id);

}
