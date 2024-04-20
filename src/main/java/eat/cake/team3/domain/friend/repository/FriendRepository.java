package eat.cake.team3.domain.friend.repository;

import eat.cake.team3.domain.friend.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {

}
