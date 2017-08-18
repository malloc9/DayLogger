package hu.malloc.repository;

import hu.malloc.entity.DayLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DayLogRepository extends JpaRepository<DayLog, Long> {
}
