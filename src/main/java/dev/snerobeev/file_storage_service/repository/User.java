package dev.snerobeev.file_storage_service.repository;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "my_users")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class User {
  @Id
  @EqualsAndHashCode.Include
  @ToString.Include
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ToString.Include
  private String firstName;
  @ToString.Include
  private String secondName;
  @ToString.Include
  @Column(unique = true)
  private String email;
  private String password;
  @CreatedDate
  private LocalDate createdAt;
  @LastModifiedDate
  private LocalDate uddateAt;
}