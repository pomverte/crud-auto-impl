- Run the application
- Access H2 console at `http://localhost:8080/h2-console/`
- Fill the JDBC URL with `jdbc:h2:mem:testdb`
- Execute the query in the file `V002__data.sql` (Flyway data insertion with embedded H2 seems to be bugged)

Search the repository
`http://localhost:8080/person`
`http://localhost:8080/person/search/findByName?name=hvle`

... OMG it's implementation  is auto generated o_O
