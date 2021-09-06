package com.codeclan.example.pirateservice.repositories;

import com.codeclan.example.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// our repo extends JpaRepository and requires an object type, and indexing system (data type of the ID, in this case Long)
@Repository //tells spring that this Interface is a repository for interacting with external data, e.g. database
public interface PirateRepository extends JpaRepository<Pirate, Long> {
}
