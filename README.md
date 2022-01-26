# login-session-demo
Spring Boot一致性Session实例

# war包
https://gitee.com/youweics/login-session-demo/blob/master/war/logindemo.war

# sql脚本
https://gitee.com/youweics/login-session-demo/blob/master/config/user.sql

# mysql数据库信息
https://downloads.mysql.com/archives/get/p/23/file/mysql-5.7.36-linux-glibc2.12-x86_64.tar.gz

https://gitee.com/youweics/login-session-demo/blob/master/src/main/resources/application.properties

# Tomcat

版本8.5.73

https://archive.apache.org/dist/tomcat/tomcat-8/v8.5.73/bin/apache-tomcat-8.5.73.tar.gz

## 8080
https://gitee.com/youweics/login-session-demo/blob/master/config/tomcat8080/server.xml

## 8081
https://gitee.com/youweics/login-session-demo/blob/master/config/tomcat8081/server.xml

# Nginx
https://nginx.org/download/nginx-1.20.2.tar.gz

https://gitee.com/youweics/login-session-demo/blob/master/config/nginx.conf

## 启动
sudo /usr/local/nginx/sbin/nginx -c /usr/local/nginx/conf/nginx.conf

## 重启
sudo /usr/local/nginx/sbin/nginx -c /usr/local/nginx/conf/nginx.conf -s reload

# redis
https://download.redis.io/releases/redis-6.2.6.tar.gz

https://gitee.com/youweics/login-session-demo/blob/master/config/redis.conf

https://gitee.com/youweics/login-session-demo/blob/master/src/main/resources/application.properties

# 测试url

如果是本地部署可以访问

http://127.0.0.1:8081/logindemo/login/toLogin

否则把127.0.0.1换成服务器ip即可

