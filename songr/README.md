# songr

## songer App is built using spring JVM

* songer contains the following routes:

    * (/hello): renders a hello greeting page 

    * (/capitalize)
        * used to capitalize a given text that is passed with the route as 
          * (/capitalize/hello) : it returns (HELLO)
          * (/capitalize/My page): it returns (MY PAGE)

    * (/albums) : returns a page shows list of albums as objects and there properities : 
      * Title 
      * artist
      * songCount
      * length
      * imageUrl

 ********************************    Lab 12   ********************************

   * addToDB : add data about an album from declaring an object and save them in DataBase


   * (/allalbums): returns a page shows list of albums that are in Database


   * (/addAlbum) : add data about album songs and them to dataBase




* run the program at :(localhost:8080/)