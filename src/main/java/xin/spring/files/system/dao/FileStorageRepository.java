package xin.spring.files.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xin.spring.files.system.entity.FileStorage;

/**
 * @author spring
 * email: 4298293220@qq.com
 * site: https://springbless.xin
 * @description
 * @date 2019/11/1
 */
public interface FileStorageRepository extends JpaRepository<FileStorage, Integer> {

    FileStorage findByKey(String key);

}
