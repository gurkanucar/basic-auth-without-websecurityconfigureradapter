
## Spring boot basic auth h2 database without websecurityconfigureradapter

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
