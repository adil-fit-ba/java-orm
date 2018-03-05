
# Competition - Razvoj vlastitog Java ORM-a (napredni zadatak)

Pripreme:

a) naučiti JPA sa Hibernate-om. Preuzeti skriptu
https://github.com/adil-fit-ba/rks-2017-18/blob/master/dokumenti/99_JPA_skripta.doc

b) implementirati jednostavnu java aplikaciju sa 4-5 tabela uz korištenje JPA Hibernate-a kao ORM framworka.
   - Entity klase smjestit package "models"
   - Konfigurisati hibernate pomoću persistance.xml fajla.
   - Koristiti dbms po želji (sql server na linuxu/windowsu, postgree sql, mysql).
   - Implementirati konzolni UI za dodavanje novih zapisa. Atribute koji predstavljaju FK se unose pomoću ID-a.
   - Generisati tabele pomoću Hibernate-a.


Radni zadatak za takmičenje: Implementirati vlastiti ORM framework (nije za produkciju već za učenje).

   - Primjer vlastitog ORM imate u sklopu predmeta Razvoj softvera 1 (C# ado.net)
   https://github.com/adil-fit-ba/rs1-2017-18/tree/master/03.4_dotnet_stari_Implementacija_vlastitog_ORMa

   - Primjer izvršavanje sql commandi bez JPA/Hibernate: 
   https://www.mkyong.com/jdbc/jdbc-preparestatement-example-update-a-record/
   
   - Početni (idejni) java projekat i primjer definisana ForeignKeya
   https://github.com/adil-fit-ba/java-orm
   
   Umjesto anotacija implementirati vlastiti klasu "FK" i "FKNull" sa dodatnom opcijom za "lazy loading", npr
   https://github.com/adil-fit-ba/java-orm/blob/master/src/model/Student.java   
   https://github.com/adil-fit-ba/java-orm/blob/master/src/helper/FKNull.java
   
   Možete koristiti sljedeće ograničenje: 
    - primarni ključevi su postavljeni kao Integer.
    - nije potrebno generisati tabele.

Ispravna rješenja će biti commitovana na navedeni git repozitorij.
