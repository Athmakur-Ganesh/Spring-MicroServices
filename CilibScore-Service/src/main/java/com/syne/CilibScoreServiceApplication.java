package com.syne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.syne.entity.CibilScore;
import com.syne.repository.CibilScoreRepo;

@SpringBootApplication
@EnableDiscoveryClient
public class CilibScoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CilibScoreServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			CibilScoreRepo repo;

			@Override
			public void run(String... args) throws Exception {
				repo.save(new CibilScore(101, "aa", "Ramesh", 560));
				repo.save(new CibilScore(102, "bb", "Rakesh", 660));
				repo.save(new CibilScore(103, "cc", "Rajesh", 760));
			}
		};

	}
}
