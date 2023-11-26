"# PatientManagement" 
1. Create a database in mysql and update that in application.properties
2. Check the port available and update according in application.properties
3. First register a staff member by passing employmentNumber and password(mandatory), name, about
4. Now, login using employmentNumber and password which will create a jwt token
5. Now, you can access any endpoint just add key-value Authorization and Bearer (token recieved through login)
6. Now, you can access any patients' management api using this token                         
