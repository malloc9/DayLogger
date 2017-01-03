package hu.malloc.repository;

import hu.malloc.entity.DayLog;
import org.springframework.data.repository.CrudRepository;

public interface DayLogRepository extends CrudRepository<DayLog, Long> {
}
