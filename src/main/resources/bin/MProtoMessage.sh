#!/bin/sh
# HOME 값 설정 필수
#HOME=[baseDirectory]/MProtoMessage
SRC_DIR=$HOME/src/main/resources/proto
DST_DIR=$HOME/src/main/java
JAVA_JAR=moonect-proto-message-1.0.0.jar
JAR_DIR=$HOME/src/main/resources/jar

protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/*.proto
cd $HOME
mvn clean -f pom.xml
mvn package -f pom.xml
mv $HOME/target/$JAVA_JAR $JAR_DIR/$JAVA_JAR