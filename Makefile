all:
	mvn clean verify

build:
	mvn clean package

start:
	java -jar graphql.server/target/graphql-full.jar
