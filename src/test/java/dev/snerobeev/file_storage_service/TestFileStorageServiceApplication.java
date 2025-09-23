package dev.snerobeev.file_storage_service;

import org.springframework.boot.SpringApplication;

public class TestFileStorageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(FileStorageServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
