#Reviews microservice

##Running Instructions
mvn spring-boot:run

##Testing the application
###Search all reviews
$ curl localhost:8081/reviews
###Search reviews by imdbID
$ curl localhost:8081/reviews/search/findByimdbID?imdbID=1
###Insert new review
curl http://localhost:8081/reviews -X POST -d '{"userName":"jgil","imdbID":"1","review":"Great movie!","rating":"5"}' -H "Content-Type: application/json"
###Delete review
curl -X DELETE http://localhost:8081/reviews/55144b9d44ae0d4c3e01f030
