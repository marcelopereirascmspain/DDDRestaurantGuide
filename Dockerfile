FROM java:8
COPY . /usr/src/DDDRestaurantGuide
WORKDIR /usr/src/DDDRestaurantGuide
RUN /.gradlew run