package com.codeclan.fileandfolder.repositories;

import com.codeclan.fileandfolder.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
