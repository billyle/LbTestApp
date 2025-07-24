# 使用官方的 OpenJDK 镜像作为基础镜像
FROM openjdk:8-jdk-alpine

# 设置工作目录
WORKDIR /app

# 将打包好的 JAR 文件复制到镜像中
COPY target/lbtestapp-0.0.1-SNAPSHOT.jar app.jar

# 暴露应用程序端口
EXPOSE 8080

# 定义容器启动时运行的命令
ENTRYPOINT ["java", "-jar", "app.jar"]
