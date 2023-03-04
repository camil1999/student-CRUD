package az.developia.studentcrud.controller;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import az.developia.studentcrud.model.FileModel;

@RestController
@RequestMapping(path = "/files")
@CrossOrigin(origins = "*")
public class FileRestController {

	@PostMapping(path = "/upload")
	public FileModel uploadFile(@RequestParam(name = "file", required = false) MultipartFile file) {
		FileModel model = new FileModel();
		model.setFileName("no-image");
		if (file == null) {
			return model;
		}
		String fileName = file.getOriginalFilename();
		try {
			InputStream stream = file.getInputStream();
			File java1 = new File("C:/java1");
			if (java1.exists()) {

			} else {
				java1.mkdir();
			}
			UUID uuid = UUID.randomUUID();
			String randomName = uuid.toString();
			String format = fileName.substring(fileName.lastIndexOf("."));
			System.out.println(format);
			randomName += format;
			fileName = randomName;
			Files.copy(stream, Paths.get("C:/java1/" + randomName), StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			e.printStackTrace();
		}

		model.setFileName(fileName);
		return model;
	}

	@GetMapping(path = "/download/{filename:.+}")
	public ResponseEntity<Resource> download(@PathVariable String filename) {
		try {
			Resource file = new UrlResource(Paths.get("C:/java1").resolve(filename).toUri());
			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
					.body(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
