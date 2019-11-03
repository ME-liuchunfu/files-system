package xin.spring.files.system.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author spring
 * email: 4298293220@qq.com
 * site: https://springbless.xin
 * @description
 * @date 2019/11/1
 */
@Data
@Entity
@Table(name = "file_storage")
public class FileStorage {

    @Id
    @Column(name = "id", columnDefinition=" bigint(64) ")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "f_key", columnDefinition = " varchar(64) not null COMMENT '文件的唯一索引' ")
    private String key;

    @Column(name = "name", columnDefinition = " varchar(255) NOT NULL COMMENT '文件名' ")
    private String name;

    @Column(name = "type", columnDefinition = " varchar(640) NOT NULL COMMENT '文件类型' ")
    private String type;

    @Column(name = "size", columnDefinition = " int(11) NOT NULL COMMENT '文件大小'")
    private Integer size;

    @Column(name = "url", columnDefinition = " varchar(255) DEFAULT NULL COMMENT '文件访问链接' " )
    private String url;

    @Column(name = "add_time", columnDefinition = " datetime DEFAULT NULL COMMENT '创建时间' ")
    private LocalDateTime addTime;

    @Column(name = "update_time", columnDefinition = " datetime DEFAULT NULL COMMENT '更新时间' ")
    private LocalDateTime updateTime;

    @Column(name = "deleted", columnDefinition = " tinyint(1) DEFAULT '0' COMMENT '逻辑删除' ")
    private Boolean deleted;

}
