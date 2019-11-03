package xin.spring.files.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.spring.files.system.dao.FileStorageRepository;
import xin.spring.files.system.entity.FileStorage;

import java.time.LocalDateTime;

/**
 * @author spring
 * email: 4298293220@qq.com
 * site: https://springbless.xin
 * @description
 * @date 2019/11/1
 */
@Service
public class FileStorageService {

    @Autowired
    private FileStorageRepository fileStorageRepository;

    public void add(FileStorage storageInfo) {
        storageInfo.setAddTime(LocalDateTime.now());
        storageInfo.setUpdateTime(LocalDateTime.now());
        fileStorageRepository.save(storageInfo);
    }

    public FileStorage findByKey(String key) {
        return fileStorageRepository.findByKey(key);
    }

}
