package edu.ijse.tranzio.repository;

import edu.ijse.tranzio.entity.Rd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RdRepository extends JpaRepository<Rd, Long> {
}
