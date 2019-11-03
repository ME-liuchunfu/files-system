# 远程文件系统

## 1、简要说明

本项目是springboot、spring data JPA项目数据库谁用mysql数据库，使用该系统时需要配置如下

~~~yml
files-system:
  storage:
    # 当前工作的对象存储模式，分别是local、aliyun、tencent、qiniu
    active: local
    # 本地对象存储配置信息
    local:
  	  # 存储目标文件夹
      storagePath: storage
      # 自动日期文件夹
      autoDate: true
      # 存储目标根路径
      address: /files-system/station
    # 阿里云对象存储配置信息
    aliyun:
      # 阿里云oss地址
      endpoint: xxx
      # 文件目标
      prefix: xxx
      # 自动日期文件夹
      autoDate: true
      # oss jey
      accessKeyId: xxx
      # oss secret
      accessKeySecret: xxx
      # oss名称
      bucketName: xxx
    # 腾讯对象存储配置信息
    # 请参考 https://cloud.tencent.com/document/product/436/6249
    tencent:
      secretId: xxx
      secretKey: xxx
      prefix: xxx
      autoDate: true
      region: xxx
      bucketName: xxx
    # 七牛云对象存储配置信息
    qiniu:
      endpoint: xxx
      prefix: xxx
      autoDate: true
      accessKey: xxxx
      secretKey: xxxxxx
      bucketName: xxxx
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    # 数据库地址
    url: jdbc:mysql://localhost:3306/file-system?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true
    # 用户名
    username: xxxx
    # 密码
    password: xxxx
~~~

