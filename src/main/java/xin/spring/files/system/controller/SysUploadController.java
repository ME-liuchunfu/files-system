package xin.spring.files.system.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import xin.spring.files.system.entity.FileStorage;
import xin.spring.files.system.storage.StorageService;
import xin.spring.files.system.utils.MapUtil;

@RestController
@RequestMapping("/sys/upload")
public class SysUploadController {

	@Autowired
	private StorageService storageService;

	@RequestMapping("/index")
	public Object index() {
		ArrayList<Object> list = new ArrayList<Object>();
		for(int i=0;i<100;i++) {
			list.add(System.currentTimeMillis());
		}
		return list;
	}

	@PostMapping("/upload")
	public Object upload(@RequestParam("file") MultipartFile file) throws IOException {
		String originalFilename = file.getOriginalFilename();
		FileStorage fileStorage = storageService.store(file.getInputStream(), file.getSize(), file.getContentType(), originalFilename);
		return new MapUtil().putVal(fileStorage);
	}

	@PostMapping("/uploads")
	public Object uploads(MultipartFile file) throws IOException {
		String originalFilename = file.getOriginalFilename();
		FileStorage fileStorage = storageService.store(file.getInputStream(), file.getSize(), file.getContentType(), originalFilename);
		return new MapUtil().putVal(fileStorage);
	}

}
