# <p>


---
## 查询分页数据

### BASIC

**Path：** /generator/api/v1/student

**Method：** GET

### REQUEST


**Query：**

| name  |  value  |  required | desc  |
| ------------ | ------------ | ------------ | ------------ |
| page | 1 | YES |  |
| pageSize | 10 | YES |  |
| factor |  | YES |  |


### RESPONSE

**Header：**

| name  |  value  |  required  | desc  |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |   |

**Body：**

| name | type | desc |
| ------------ | ------------ | ------------ |
| message | string |  | 
| code | string |  | 
| data | object |  | 

**Response Demo：**

```json
{
  "message": "",
  "code": ""
}
```



---
## 根据id查询

### BASIC

**Path：** /generator/api/v1/student/{id}

**Method：** GET

### REQUEST


**Path Params：**

| name  |  value   | desc  |
| ------------ | ------------ | ------------ |
| id |  |  |


### RESPONSE

**Header：**

| name  |  value  |  required  | desc  |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |   |

**Body：**

| name | type | desc |
| ------------ | ------------ | ------------ |
| message | string |  | 
| code | string |  | 
| data | object |  | 

**Response Demo：**

```json
{
  "message": "",
  "code": ""
}
```



---
## 新增

### BASIC

**Path：** /generator/api/v1/student

**Method：** POST

### REQUEST


**Headers：**

| name  |  value  |  required  | desc  |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**RequestBody**

| name | type | desc |
| ------------ | ------------ | ------------ |
| studentId | integer | （学生编码）自增主键 | 
| name | string | 学生姓名 | 
| description | string | 学生介绍 | 
| ctime | string | 创建时间 | 
| mtime | string | 更新时间 | 

**Request Demo：**

```json
{
  "studentId": 0,
  "name": "",
  "description": "",
  "ctime": "",
  "mtime": ""
}
```


### RESPONSE

**Header：**

| name  |  value  |  required  | desc  |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |   |

**Body：**

| name | type | desc |
| ------------ | ------------ | ------------ |
| message | string |  | 
| code | string |  | 
| data | object |  | 

**Response Demo：**

```json
{
  "message": "",
  "code": ""
}
```



---
## 删除

### BASIC

**Path：** /generator/api/v1/student/{id}

**Method：** DELETE

### REQUEST


**Path Params：**

| name  |  value   | desc  |
| ------------ | ------------ | ------------ |
| id |  |  |

**Headers：**

| name  |  value  |  required  | desc  |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/x-www-form-urlencoded | YES |  |


### RESPONSE

**Header：**

| name  |  value  |  required  | desc  |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |   |

**Body：**

| name | type | desc |
| ------------ | ------------ | ------------ |
| message | string |  | 
| code | string |  | 
| data | object |  | 

**Response Demo：**

```json
{
  "message": "",
  "code": ""
}
```



---
## 修改

### BASIC

**Path：** /generator/api/v1/student

**Method：** PUT

### REQUEST


**Headers：**

| name  |  value  |  required  | desc  |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**RequestBody**

| name | type | desc |
| ------------ | ------------ | ------------ |
| studentId | integer | （学生编码）自增主键 | 
| name | string | 学生姓名 | 
| description | string | 学生介绍 | 
| ctime | string | 创建时间 | 
| mtime | string | 更新时间 | 

**Request Demo：**

```json
{
  "studentId": 0,
  "name": "",
  "description": "",
  "ctime": "",
  "mtime": ""
}
```


### RESPONSE

**Header：**

| name  |  value  |  required  | desc  |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |   |

**Body：**

| name | type | desc |
| ------------ | ------------ | ------------ |
| message | string |  | 
| code | string |  | 
| data | object |  | 

**Response Demo：**

```json
{
  "message": "",
  "code": ""
}
```


