all:
	mvn clean verify

build:
	mvn clean package

# Start the spring server and all dependent services
dev-env:
	docker-compose build && docker-compose up --force-recreate

# Start only the dependent services (not the spring server itself)
service-env:
	docker-compose build && docker-compose up --scale app=0 --force-recreate

docker-down:
	docker-compose stop
	docker-compose rm -f -v