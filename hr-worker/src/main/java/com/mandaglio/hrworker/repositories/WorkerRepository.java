package com.mandaglio.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mandaglio.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
