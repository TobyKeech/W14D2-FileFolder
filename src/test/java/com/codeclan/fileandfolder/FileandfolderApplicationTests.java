package com.codeclan.fileandfolder;

import com.codeclan.fileandfolder.models.File;
import com.codeclan.fileandfolder.models.Folder;
import com.codeclan.fileandfolder.models.Person;
import com.codeclan.fileandfolder.repositories.FileRepository;
import com.codeclan.fileandfolder.repositories.FolderRepository;
import com.codeclan.fileandfolder.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileandfolderApplicationTests {

	PersonRepository personRepository;

	FolderRepository folderRepository;

	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void canAddFileFolderPerson(){
		Person meg = new Person("Meg");
		personRepository.save(meg);
		Folder folder = new Folder("Jiggles", meg);
		folderRepository.save(folder);
		File file = new File("puffles", "java", 10, folder);
		fileRepository.save(file);

		meg.addFolder(folder);
		personRepository.save(meg);
		folder.addFile(file);
		folderRepository.save(folder);


	}

}
