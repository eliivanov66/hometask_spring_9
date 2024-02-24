package ru.example.hometask_9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.example.hometask_9.entitys.Employer;
@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long> {
}
