## Spring boot basic auth h2 database without websecurityconfigureradapter

Postman Collection: [https://github.com/gurkanucar/basic-auth-without-websecurityconfigureradapter/blob/master/basic-auth-example.postman_collection.json](https://github.com/gurkanucar/basic-auth-without-websecurityconfigureradapter/blob/master/basic-auth-example.postman_collection.json)

Medium Article: [https://medium.com/@gurkanucar/spring-security-h2-database-without-websecurityconfigureradapter-fc4a83b6f60d](https://medium.com/@gurkanucar/spring-security-h2-database-without-websecurityconfigureradapter-fc4a83b6f60d)


- **User endpoint (some one can access without auth)**

```http
  GET /api/public
```

- **User endpoint (only authenticated users can access)**

```http
  GET /api/auth-required
```

- **User endpoint (USER and ADMIN role can access)**

```http
  GET /api/user
```

- **Admin endpoint (only ADMIN role can access)**

```http
  GET /api/admin
```

- **Show Me endpoint (only authenticated users can access)**

```http
  GET /api/me
```
