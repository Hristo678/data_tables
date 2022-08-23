package com.example.data_tables.Repositories;

import com.example.data_tables.Entities.CopyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CopyUsersRepository extends JpaRepository<CopyUser, Long> {


}
