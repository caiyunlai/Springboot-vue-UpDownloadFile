# Springboot-vue
基于springboot+vue的简单文件上传与下载项目。
其中内嵌了vue-simple-uploader.js这个大文件上传的插件，可实现文件极速上传，断点续传等。

项目运行：
    1.clone到本地，解压，idea分别打开前后端项目；
    2.后端首先根据resources——>sql目录下的sql文件在数据库建表（mysql）。然后编译运行
    3.前端打开后，运行npm install，安装好所需依赖。之后运行npm run serve.
    4.前端界面较丑，可自行设计，文件存储路径在后端application.yml配置文件中。
    5.注意研究前台的vue.config.js和后台的application.yml配置文件，以便进行修改。
