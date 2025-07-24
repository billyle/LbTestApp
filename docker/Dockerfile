# 使用官方的 OpenJDK 镜像作为基础镜像
FROM openjdk:8-jdk-alpine

# 安装 mysql 客户端，用于等待 MySQL 服务启动
RUN apk add --no-cache mysql-client

# 设置工作目录
WORKDIR /app

# 将打包好的 JAR 文件复制到镜像中
COPY ../target/lbtestapp-0.0.1-SNAPSHOT.jar app.jar

# 添加等待脚本
COPY wait-for-mysql.sh wait-for-mysql.sh
RUN chmod +x wait-for-mysql.sh

# 暴露应用程序端口
EXPOSE 8080

# 定义容器启动时运行的命令
ENTRYPOINT ["./wait-for-mysql.sh", "java", "-jar", "app.jar"]