#!/usr/bin/env bash

URL=http://localhost:8081/reviews

curl ${URL} -X POST -d '{"userName":"jgil","imdbID":"1","review":"Fantastic movie!","rating":"5"}' -H "Content-Type: application/json"
