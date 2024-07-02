package com.qa.lbg.repos;

import com.qa.lbg.entities.Properties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertiesRepo extends JpaRepository<Properties, Integer> {
}
