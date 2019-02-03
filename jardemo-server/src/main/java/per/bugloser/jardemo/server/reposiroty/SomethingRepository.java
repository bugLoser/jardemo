package per.bugloser.jardemo.server.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import per.bugloser.jardemo.server.domain.Something;

@Repository
public interface SomethingRepository extends JpaRepository<Something, Integer> {
}
