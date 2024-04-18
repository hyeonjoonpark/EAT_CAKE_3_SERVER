package eat.cake.team3.domain.goal;

import eat.cake.team3.domain.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Goal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String description;
  @CreationTimestamp
  private LocalDateTime uploadDate = LocalDateTime.now();

  @ManyToOne
  @JoinColumn(name = "id")
  private User userId;

  public void setUserId(User userId) {
    this.userId = userId;
  }

  @Builder
  public Goal(Long id, String title, String description, LocalDateTime uploadDate, User userId) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.uploadDate = uploadDate;
    this.userId = userId;
  }
}
