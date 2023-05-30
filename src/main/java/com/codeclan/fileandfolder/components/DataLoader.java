package com.codeclan.fileandfolder.components;

import com.codeclan.fileandfolder.models.File;
import com.codeclan.fileandfolder.models.Folder;
import com.codeclan.fileandfolder.models.Person;
import com.codeclan.fileandfolder.repositories.FileRepository;
import com.codeclan.fileandfolder.repositories.FolderRepository;
import com.codeclan.fileandfolder.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component //Comment this out if you do not to run the data loader.
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }
    public void run(ApplicationArguments args) {

        Person meg = new Person("Meg");
        personRepository.save(meg);

        Folder folder = new Folder("Jiggles", meg);
        folderRepository.save(folder);

        File file = new File("puffles", "java", 10, folder);
        fileRepository.save(file);

        meg.addFolder(folder);
        folderRepository.save(folder);

        folder.addFile(file);
        personRepository.save(meg);

    }

}
