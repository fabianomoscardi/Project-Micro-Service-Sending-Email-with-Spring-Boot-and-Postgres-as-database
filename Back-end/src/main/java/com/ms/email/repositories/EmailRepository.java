package com.ms.email.repositories;

import java.rmi.server.UID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.email.models.EmailModel;

@Repository
public interface EmailRepository extends JpaRepository<EmailModel, UID>{

}
