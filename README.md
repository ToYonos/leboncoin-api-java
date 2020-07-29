## A simple Java client for LeBonCoin API

It's based on the work done by tdurieux and his [Javascript client](https://github.com/tdurieux/leboncoin-api)

The client is quite simple for now and just includes two search methods.

The interesting part resides in an alert manager allowing you to keep tracking of new advert for a target search.
This implementation filters one day old adverts and uses Free Mobile sms notification api but it can be changed by any kind of [AdsHandler](src/main/java/info/toyonos/lbc/handler/AdsHandler.java), sending emails or whatever. You can also add or remove [AdsFilter](src/main/java/info/toyonos/lbc/handler/AdsFilter.java)

Change the sms api credentials in [the main class](src/main/java/info/toyonos/lbc/LeBonCoinAlertManager.java#L20)

And just build the project
```
./gradlew shadowJar
```

and run it for one search or more
```
Usage: java -jar lbc-all.jar city radius "a list of keywords" ["another list of keywords"]
```

For instance :
```
java -jar lbc-all.jar nantes 10000 "an awesome search" "another awesome search"
```

You will receive several sms with the result of your searches

In the send, just cron it for instance, here every day at 8am
```
0 8 * * * java -jar lbc-all.jar nantes 10000 "an awesome search" "another awesome search" > /dev/null 2>&1
```
