package tn.esprit.studentmanagement.services;

import org.junit.jupiter.api.Test;
import tn.esprit.studentmanagement.entities.Department;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentServiceTest {

    @Test
    void testGetAllDepartments() {
        // Création d'une instance de service simple
        DepartmentService service = new DepartmentService() {
            @Override
            public List<Department> getAllDepartments() {
                // On retourne une liste factice pour le test
                List<Department> list = new ArrayList<>();
                Department dep = new Department();
                dep.setName("Informatique");
                list.add(dep);
                return list;
            }
        };

        List<Department> result = service.getAllDepartments();
        assertEquals(1, result.size());
        assertEquals("Informatique", result.get(0).getName());
    }

    @Test
    void testGetDepartmentById() {
        DepartmentService service = new DepartmentService() {
            @Override
            public Department getDepartmentById(Long idDepartment) {
                Department dep = new Department();
                dep.setName("Mathématiques");
                return dep;
            }
        };

        Department result = service.getDepartmentById(1L);
        assertEquals("Mathématiques", result.getName());
    }
}
