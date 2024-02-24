package com.sha.demomaven.infra.repository;

import com.sha.demomaven.infra.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITestRepository extends JpaRepository<Test, Long> {
}
