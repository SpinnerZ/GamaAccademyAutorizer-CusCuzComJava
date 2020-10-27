package cuscuzcomjava.autorizer.repository;

import cuscuzcomjava.autorizer.entity.Violation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViolationRepository extends JpaRepository<Violation, Integer> {

}
