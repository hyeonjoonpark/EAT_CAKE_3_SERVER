package eat.cake.team3.domain.friend;

import eat.cake.team3.domain.friend.types.StatusType;
import eat.cake.team3.domain.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Friend {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id")
  private User requester;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id")
  private User addresser;

  private StatusType status;

  @Builder
  public Friend(Long id, User requester, User addresser, StatusType status) {
    this.id = id;
    this.requester = requester;
    this.addresser = addresser;
    this.status = status;
  }
}
