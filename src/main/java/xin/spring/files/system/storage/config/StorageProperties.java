package xin.spring.files.system.storage.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "files-system.storage")
public class StorageProperties {
	
	private String active;
    private Local local;
    private Aliyun aliyun;
    private Tencent tencent;
    private Qiniu qiniu;

    @Data
    public static class Local {
        private String address;
        private String storagePath;
        private boolean autoDate =  false;
    }

    @Data
    public static class Tencent {
        private String secretId;
        private String secretKey;
        private String region;
        private String bucketName;
        private String prefix;
        private boolean autoDate =  false;
    }

    @Data
    public static class Aliyun {
        private String endpoint;
        private String accessKeyId;
        private String accessKeySecret;
        private String bucketName;
        private String prefix;
        private boolean autoDate =  false;
    }

    @Data
    public static class Qiniu {
        private String endpoint;
        private String accessKey;
        private String secretKey;
        private String bucketName;
        private String prefix;
        private boolean autoDate =  false;
    }

}
