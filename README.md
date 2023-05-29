# api开放平台
## API签名认证
本质：
1. 签发签名
2. 校验签名

目的
1. 保证安全性，不能随便一个人都能用

### 怎么实现
参数1：accessKey：调用的标识 userA， userB 

参数2：secretKey：密钥
> ak,sk是无状态的

**不能把密钥直接在服务器之间传递，有可能会被拦截**
参数3：用户请求参数

参数4：sign（签名）

加密方式:对称加密、 非对称加密、 MD5签名（不可解密）

用户参数+密钥 => 签名算法 => 不可解密的值

**怎么防止重放？**

参数5：加nonce随机数，只能用一次（服务端要保存用过的随机数）

参数6：加timestamp时间戳，校验时间戳是否过期

> 思考：难道开发者每次调用都要自己写签名算法？

## 开发一个简单易用的SDK

理想情况：开发者只需要关心调用那些接口、传递那些参数，就和调用自己写的代码一样简单

开发starter的好处：开发者引入后，可以直接在application.yml中写配置，自动创建客户端

