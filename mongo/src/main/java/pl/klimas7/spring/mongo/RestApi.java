package pl.klimas7.spring.mongo;

public class RestApi {
}

/*
POST http://localhost:8080/api/createUsers

GET http://localhost:8080/api/users

GET http://localhost:8080/api/user/John

GET http://localhost:8080/api/oldestUser

GET http://localhost:8080/api/userAgeCounts
 */

/*
$ docker exec -it mongo bash
root@c65968c1024b:/# mongo -u admin -p k7admin

> show dbs
> use test
> db.user.find()
> db.user.remove({})
 */