package com.codeclan.fileandfolder.repositories;

import com.codeclan.fileandfolder.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
