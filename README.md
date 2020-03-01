# WeatherPlanner
A repository for the members of CSCI 310 Group 8 to deposit code at different stages in the Software Development Process. 

## Endpoints
### Get Simple Weather
Get the simple weather given a location

**URL** : `/simpleweather?loc=<location>&unit=<unit>`

**URL Parameters**
- **location**: a string value of the location
- **unit**: either "Fahrenheit" or "Celsius"

**Method** : `GET`

#### Success Response

**Code** : `200 OK`

**Body** :
```json
{
  "city": "Atlanta",
  "country": "US",
  "weather": "Light rain",
  "weatherGraphicStatic": "/light-rain.png",
  "weatherGraphicAnimate": "/light-rain-animate.gif",
  "avgMinTemp": 42,
  "avgMaxTemp": 63,
  "currentTemp": 56,
  "tempUnit": "Fahrenheit",
  "distance": 512,
  "isFavorite": false
}
```

### Get Locations By Weather
Get a list of locations given a set of weather parameters

**URL** : `/locationsbyweather?loc=<location>&max=<maxTemp>&min=<minTemp>&precip=<precip>&humid=<humidity>&results=<maxResults>&unit=<unit>`

**URL Parameters**
- **location**: a string value of the location
- **maxTemp**: an integer value, the highest acceptable temperature of a location
- **minTemp**: an integer value, the lowest acceptable temperature of a location 
- **precip**: an enumerated value of the following: "Clear", "Cloudy", "Rainy", "Storming", "Snowing"
- **humid**: an integer value giving the prefered humitity percentage
- **maxResults**: the maximum number of locations to return from the query
- **unit**: either "Fahrenheit" or "Celsius"

**Method** : `GET`

#### Success Response

**Code** : `200 OK`

**Body** :
```json
[
  {
    "city": "Atlanta",
    "country": "US",
    "weather": "Light rain",
    "weatherGraphicStatic": "/light-rain.png",
    "weatherGraphicAnimate": "/light-rain-animate.gif",
    "avgMinTemp": 42,
    "avgMaxTemp": 63,
    "currentTemp": 56,
    "tempUnit": "Fahrenheit",
    "distance": 512,
    "isFavorite": false
  },
  {
    "city": "Los Angeles",
    "country": "US",
    "weather": "Sunny",
    "weatherGraphicStatic": "/sunny.png",
    "weatherGraphicAnimate": "/sunny-animate.gif",
    "avgMinTemp": 62,
    "avgMaxTemp": 83,
    "currentTemp": 76,
    "tempUnit": "Fahrenheit",
    "distance": 3,
    "isFavorite": false
  },
  {
    "city": "New York",
    "country": "US",
    "weather": "Snowing",
    "weatherGraphicStatic": "/snow.png",
    "weatherGraphicAnimate": "/snow-animate.gif",
    "avgMinTemp": 25,
    "avgMaxTemp": 41,
    "currentTemp": 30,
    "tempUnit": "Fahrenheit",
    "distance": 800,
    "isFavorite": false
  }
]
```

### Get Locations By Activity
Get a list of locations given an activity

**URL** : `/locationsbyactivity?activity=<activity>&results=<maxResults>&unit=<unit>`

**URL Parameters**
- **activity**: the name of the activity to be available in the location
- **maxResults**: the maximum number of locations to return from the query
- **unit**: either "Fahrenheit" or "Celsius"

**Method** : `GET`

#### Success Response

**Code** : `200 OK`

**Body** :
```json
[
  {
    "city": "Atlanta",
    "country": "US",
    "weather": "Light rain",
    "weatherGraphicStatic": "/light-rain.png",
    "weatherGraphicAnimate": "/light-rain-animate.gif",
    "avgMinTemp": 42,
    "avgMaxTemp": 63,
    "currentTemp": 56,
    "tempUnit": "Fahrenheit",
    "distance": 512,
    "isFavorite": false
  },
  {
    "city": "Los Angeles",
    "country": "US",
    "weather": "Sunny",
    "weatherGraphicStatic": "/sunny.png",
    "weatherGraphicAnimate": "/sunny-animate.gif",
    "avgMinTemp": 62,
    "avgMaxTemp": 83,
    "currentTemp": 76,
    "tempUnit": "Fahrenheit",
    "distance": 3,
    "isFavorite": false
  },
  {
    "city": "New York",
    "country": "US",
    "weather": "Snowing",
    "weatherGraphicStatic": "/snow.png",
    "weatherGraphicAnimate": "/snow-animate.gif",
    "avgMinTemp": 25,
    "avgMaxTemp": 41,
    "currentTemp": 30,
    "tempUnit": "Fahrenheit",
    "distance": 800,
    "isFavorite": false
  }
]
```

### Get Detailed Weather
Get the detailed weather given a location

**URL** : `/detailedweather?loc=<location>&unit=<unit>`

**URL Parameters**
- **location**: a string value of the location
- **unit**: either "Fahrenheit" or "Celsius"

**Method** : `GET`

#### Success Response

**Code** : `200 OK`

**Body** :
```json
{
  "weatherLocation": {
    "city": "Atlanta",
    "country": "US",
    "weather": "Light rain",
    "weatherGraphicStatic": "/light-rain.png",
    "weatherGraphicAnimate": "/light-rain-animate.gif",
    "avgMinTemp": 42,
    "avgMaxTemp": 63,
    "currentTemp": 56,
    "tempUnit": "Fahrenheit",
    "distance": 512,
    "isFavorite": false
  },
  "monthTemps": [
    {
      "month": "Jan",
      "avgLow": 34,
      "avgHigh": 61
    },
    {
      "month": "Feb",
      "avgLow": 38,
      "avgHigh": 65
    },
    {
      "month": "Mar",
      "avgLow": 43,
      "avgHigh": 70
    },
    {
      "month": "Apr",
      "avgLow": 63,
      "avgHigh": 81
    },
    {
      "month": "May",
      "avgLow": 75,
      "avgHigh": 85
    },
    {
      "month": "Jun",
      "avgLow": 76,
      "avgHigh": 89
    },
    {
      "month": "Jul",
      "avgLow": 78,
      "avgHigh": 93
    },
    {
      "month": "Aug",
      "avgLow": 73,
      "avgHigh": 84
    },
    {
      "month": "Sep",
      "avgLow": 64,
      "avgHigh": 79
    },
    {
      "month": "Nov",
      "avgLow": 56,
      "avgHigh": 65
    },
    {
      "month": "Dec",
      "avgLow": 31,
      "avgHigh": 57
    }
  ],
  "dailyForecasts": [
    {
      "date": {
        "month": "Mar",
        "day": 5
      },
      "weatherIcon": "/sunny.png",
      "low": 42,
      "high": 67,
      "tempUnit": "Fahrenheit"
    },
    {
      "date": {
        "month": "Mar",
        "day": 6
      },
      "weatherIcon": "/light-rain.png",
      "low": 54,
      "high": 72,
      "tempUnit": "Fahrenheit"
    },
    {
      "date": {
        "month": "Mar",
        "day": 7
      },
      "weatherIcon": "/sunny.png",
      "low": 51,
      "high": 63,
      "tempUnit": "Fahrenheit"
    },
    {
      "date": {
        "month": "Mar",
        "day": 8
      },
      "weatherIcon": "/sunny.png",
      "low": 60,
      "high": 77,
      "tempUnit": "Fahrenheit"
    },
    {
      "date": {
        "month": "Mar",
        "day": 9
      },
      "weatherIcon": "/cloudy.png",
      "low": 41,
      "high": 62,
      "tempUnit": "Fahrenheit"
    }
  ],
  "placeImages": [
    "https://en.wikipedia.org/wiki/Georgia_State_Capitol#/media/File:Georgia_State_Capitol,_Atlanta,_West_view_20160716_1.jpg",
    "https://en.wikipedia.org/wiki/Piedmont_Park#/media/File:Midtown_HDR_Atlanta.jpg",
    "https://en.wikipedia.org/wiki/World_of_Coca-Cola#/media/File:World_of_Coca_Cola_2015-04-09.jpg"
  ]
}
```