Servers環境：---
apache-tomcat-8.5.56

Web_template.war：---
和Dynamic Web Project相同，只差在WebContent/WEB-INF/lib有放 \
taglibs-standard-impl-1.2.5.jar & taglibs-standard-spec-1.2.5.jar \
這樣jsp可以使用Standard Tag寫法 \

Maven_template.zip：---
在Eclipse > Import > Maven > Existing Maven Projects > 選擇解壓後資料夾，即可使用Maven Project。\
同樣已放入taglibs-standard-impl-1.2.5.jar & taglibs-standard-spec-1.2.5.jar
