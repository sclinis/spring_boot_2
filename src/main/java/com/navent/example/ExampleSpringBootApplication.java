package com.navent.example;

import com.navent.example.model.Posting;
import com.navent.example.reader.ExampleFileReader;
import com.navent.example.services.PostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ExampleSpringBootApplication implements CommandLineRunner {

	@Autowired
	private ExampleFileReader reader;

	@Autowired
	private PostingService postingService;


	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Posting> postings = reader.getPostingFromJson();
		System.out.println(postings);
		System.out.println("------\n");
		Posting minPricePosting = postingService.getMinPricePosting(postings);
		System.out.println("El posting de menor valor es " + minPricePosting);
	}
}
