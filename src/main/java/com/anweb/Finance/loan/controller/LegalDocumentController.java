package com.anweb.Finance.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class LegalDocumentController {

	@GetMapping(value = "/uploladDocument")
	public String getDocument(@RequestPart MultipartFile File) {
		System.out.println("Check your FIle Data :"+ File.getOriginalFilename());
		return " File Upload. ";
	}
}
