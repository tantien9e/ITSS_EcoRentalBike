# Eco Bike Rental

## Run 

```sh 
docker compose up -d
```
## Khởi tạo Database : vào link
```
http://localhost:9999/initial
```


Nội dung folder
- controllers : chứa các routing
- domain :
  - enums : chứa domain
  - models : chứa các đội tương chính project
- repositories : các phương thức CRUD của mysql
- exceptions : nơi lưu trữ các ngoại lệ
- services : chứa business logic
