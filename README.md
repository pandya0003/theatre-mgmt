# theatre-mgmt - Coding Challenge [![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome)

An initial effort to implement theatre management solution as part of coding test.

## Requirement

Please refer to requirement document (Domain Exercise - Booking Platform1.3.2.docx). 

## Getting Started

These instructions will walk you through on how to setup, run the project and test out solution.

### Prerequisites

* Eclipse with STS 4
* Maven
* JDK 1.17

### Run

1. Import project
2. Build project
3. Deploy to server
4. Run TheatreMgmtApplication.java as Spring Boot App

After, you can access database @ http://localhost:8080/h2-console/
- JDBC URL : jdbc:h2:~/data/db 

### Test

__Screens/Shows by Movie & City__

```
- Request: http://localhost:8080/api/screens?movieSelected=The Shawshank Redemption&currentCity=Lakeland


[
    {
        "id": 1,
        "cinemaName": "Cineplex",
        "startTime": 9.0,
        "closeTime": 23.59,
        "address": null,
        "movies": []
    }
]

```
__Screens/Shows by Movie & Geo-coordinates__

```
- Request: http://localhost:8080/api/screens?movieSelected=The Shawshank Redemption&geoCoordinates=[28.03, 81.94]
```
