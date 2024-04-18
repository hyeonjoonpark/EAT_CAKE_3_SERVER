package eat.cake.team3.domain.user;

import eat.cake.team3.domain.user.types.GenderType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
  @Id
  private String id;
  private String provider;
  private String providerId;
  private String email;
  private String userName;
  private Date birth;
  private String phoneNumber;
  @Enumerated(EnumType.STRING)
  private GenderType gender;
  private int age;
  @Column(columnDefinition = "LONGBLOB")
  private String profileImage;
  private String refreshToken;

  @Builder
  public User(String id, String provider, String providerId, String email, String userName, Date birth, String phoneNumber, GenderType gender, int age, String profileImage, String refreshToken) {
    this.id = id;
    this.provider = provider;
    this.providerId = providerId;
    this.email = email;
    this.userName = userName;
    this.birth = birth;
    this.phoneNumber = phoneNumber;
    this.gender = gender;
    this.age = age;
    this.profileImage = profileImage;
    this.refreshToken = refreshToken;
  }
}
