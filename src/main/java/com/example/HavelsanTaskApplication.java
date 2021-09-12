package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HavelsanTaskApplication implements CommandLineRunner {

	@Autowired
	private StaffRepository staffRepository;

	public static void main(String[] args) {
		SpringApplication.run(HavelsanTaskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Staff Rector = new Staff("1","John","Doe","Rector", "IEU");
		Staff deanBusiness = new Staff("2","Rob","Doe","Dean of Business","IEU");
		Staff deanEng = new Staff("3","Bob","Doe","Dean of Engineering", "IEU");
		Staff headBusiness = new Staff("4","Anna","Doe","Head of Business", "IEU");
		Staff headEng = new Staff("5","Rob","Doe","Head of Engineering", "IEU");
		Staff headLog = new Staff("6","Gerard","Doe","Head of Logistics", "IEU");
		Rector.add(deanBusiness);
		Rector.add(deanEng);
		Rector.add(headLog);
		deanBusiness.add(headBusiness);
		deanEng.add(headEng);
		staffRepository.save(Rector);

		Staff Rector2 = new Staff("7","Maria","Doe","Rector", "IEU");
		Staff deanBusiness2 = new Staff("8","Gary","Doe","Dean of Business","IEU");
		Staff deanEng2 = new Staff("9","Sue","Doe","Dean of Engineering", "IEU");
		Staff headBusiness2 = new Staff("10","Poe","Doe","Head of Business", "IEU");
		Staff headEng2 = new Staff("11","Allan","Doe","Head of Engineering", "IEU");
		Staff headLog2 = new Staff("12","Edgar","Doe","Head of Logistics", "IEU");
		Rector2.add(deanBusiness2);
		Rector2.add(deanEng2);
		Rector2.add(headLog2);
		deanBusiness2.add(headBusiness2);
		deanEng2.add(headEng2);
		staffRepository.save(Rector2);
	}
}
