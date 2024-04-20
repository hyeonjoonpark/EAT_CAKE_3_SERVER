package eat.cake.team3.domain.goal.repository;

import eat.cake.team3.domain.goal.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {

}
