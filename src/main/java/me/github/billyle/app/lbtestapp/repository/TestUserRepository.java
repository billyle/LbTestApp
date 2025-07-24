package me.github.billyle.app.lbtestapp.repository;

import me.github.billyle.app.lbtestapp.model.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestUserRepository extends JpaRepository<TestUser, Integer> {
}