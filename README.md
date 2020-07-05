Servlet容器：
---
apache-tomcat-8.5.56

Web_template.war：
---
和Dynamic Web Project相同，只差在WebContent/WEB-INF/lib有放 \
taglibs-standard-impl-1.2.5.jar & taglibs-standard-spec-1.2.5.jar \
這樣jsp可以使用Standard Tag寫法 

Maven_template.zip：
---
在Eclipse > Import > Maven > Existing Maven Projects > 選擇解壓後資料夾，即可使用Maven Project。\
同樣已放入taglibs-standard-impl-1.2.5.jar & taglibs-standard-spec-1.2.5.jar

錯誤處理：
---
如果Import專案以後，出現 \
404:The origin server did not find a current representation for the target resource or is not willing to disclose that one exists. \
專案>Property>Project Referances 勾選之前Tomcat設置好的"Servers"專案 \
專案>Property>Project Facet Dynamic Web Module 3.1、Java 1.8、JavaScript 1.0 \
如果這3項設定和上面一樣，先隨便選其他版本，點Apply後，再改回來。
