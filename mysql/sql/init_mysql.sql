-- init_mysql.sql

-- 创建初始表和插入初始数据
-- 注意：数据库和用户将通过docker-compose.yml中的环境变量自动创建

CREATE TABLE IF NOT EXISTS test_users
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    email VARCHAR(100)
);

INSERT INTO test_users (username, email)
VALUES ('admin', 'admin@example.com');
