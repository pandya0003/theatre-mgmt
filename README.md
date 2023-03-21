# theatre-mgmt - Coding Challenge [![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome)

An initial effort to implement theatre management solution as part of coding test.

## Requirement

Please refer to requirement document (DomainExercise-BookingPlatform1.3.2.docx). 

## Getting Started

These instructions will walk you through on how to setup, run the project and test out solution.

### Prerequisites

* Eclipse with STS 4
* Maven
* JDK 1.17

### Run

1. Import project
2. Build project & run TheatreMgmtApplication.java as Spring Boot App

After, you can access database @ http://localhost:8080/h2-console/
- JDBC URL : jdbc:h2:~/data/db 

Note: Database initially preloaded with dummy data using data.sql.

### Test

1) __Screens/Shows by Movie & City__

[Request](http://localhost:8080/api/screens?movieSelected=Avatar&currentCity=Lakeland) 
- http://localhost:8080/api/screens?movieSelected=Avatar&currentCity=Lakeland

[Response]

```
[
    {
        "id": 1,
        "cinemaName": "Cineplex",
        "startTime": 9.0,
        "closeTime": 23.59,
        "address": {
            "id": 1,
            "street": "Napa Valley",
            "landmark": "Nr Shiv Temmple",
            "city": "Lakeland",
            "state": "FL",
            "latitude": 28,
            "longitude": -82,
            "pinCode": "33801"
        },
        "movies": [
            {
                "id": 1,
                "movieName": "Golmaal",
                "movieType": "HINDI",
                "showReleaseDate": "2023-02-31 23.59.59+07:30",
                "showEndDate": "2023-12-31 23.59.59+07:30",
                "totalDuration": 90,
                "price": 50
            },
            {
                "id": 2,
                "movieName": "Avatar",
                "movieType": "ENGLISH",
                "showReleaseDate": "2023-02-31 23.59.59+07:30",
                "showEndDate": "2023-12-31 23.59.59+07:30",
                "totalDuration": 90,
                "price": 50
            },
            {
                "id": 3,
                "movieName": "Inception",
                "movieType": "ENGLISH",
                "showReleaseDate": "2023-02-31 23.59.59+07:30",
                "showEndDate": "2023-12-31 23.59.59+07:30",
                "totalDuration": 90,
                "price": 50
            }
        ],
        "shows": [
            6,
            9,
            12,
            15,
            18,
            21
        ]
    },
    {
        "id": 2,
        "cinemaName": "Mukta Arts",
        "startTime": 9.0,
        "closeTime": 23.59,
        "address": {
            "id": 2,
            "street": "Napa Valley",
            "landmark": "Nr Shiv Temmple",
            "city": "Lakeland",
            "state": "FL",
            "latitude": 28,
            "longitude": -82,
            "pinCode": "33801"
        },
        "movies": [
            {
                "id": 4,
                "movieName": "Avatar",
                "movieType": "ENGLISH",
                "showReleaseDate": "2023-02-31 23.59.59+07:30",
                "showEndDate": "2023-12-31 23.59.59+07:30",
                "totalDuration": 90,
                "price": 50
            }
        ],
        "shows": [
            6,
            9,
            12,
            15,
            18,
            21
        ]
    }
]

```
2) __Checkout / Booking__

[Request](http://localhost:8080/api/checkout) 
- http://localhost:8080/api/checkout

[Body]

```
{
    "userEmail": "pandya.parth@live.com",
    "qty": 7,
    "screen": {
        "id": 1
    },
    "paymentMethod": ""
}

```

[Response]

```
{  
	"transactionId" : 1 
}
```

There is postman JSON (Theatre Mgt.postman_collection.json) exported into project which can be used as reference point to try out all the supported endpoint.