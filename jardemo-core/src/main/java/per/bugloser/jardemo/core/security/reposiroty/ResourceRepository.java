package per.bugloser.jardemo.core.security.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import per.bugloser.jardemo.core.security.domain.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}
