package com.sugondesecorn.Project1.repository;
import com.sugondesecorn.Project1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String departmentName);

//    You can literally just add the IgnoreCase to the end and spring boot knows its a keyword inside method names
    public Department findByDepartmentNameIgnoreCase(String departmentName);

}
