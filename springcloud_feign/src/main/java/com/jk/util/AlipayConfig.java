package com.jk.util;

public class AlipayConfig {

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ APPID（填自己的，下面都是改过的~）
    public static String app_id = "2016093000631875";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 生成公钥时对应的私钥（填自己的，下面都是改过的~）
    public static String private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCJi2pPZfEld3vPRrDgaysnTtbDOZbF08XIKo89WOp1BSJeBgkyQCVBRMOgbLML5kFn1X+dL/w6vFFrLxMimvkQDgcfSRR1V+C8O3Hb6HmICFAMmXh5CnpU9XQX4yd7xqHZr5+aFgTtG/4nsOGRhN6GqVQUOEDRbcQ32jYTjS4d4koYdxeKvIF+l37q2GpMd9jlL2v6/TbrOzswGiabSZsuon9Kt1sc2KBxXr0GBxZ2jZOAuS8FE6Yw+lE6GyfKqHzCn45lzbvT6DWZd21u94eFFPV0QCZPm3DPZ6iSoPcHxRAAC+7Cu09Te5kWyn9TUuv2zESinPPSsxBwYcl31zexAgMBAAECggEAM4Li7ZlgFogI9jejRmjcYHxGMhb/QFdvWueVfYQvSmQB2vSnvQoI6ci2+v26kFpLZHews02lSNn+JAYdRHiFjl2yjSTxZIDkyZn5qkIGQcvbLtzLIYmrBuZl9Aw+XTymoMAFJc/ZSHOTW4oC8FyyefwwYOIwZD6XndM7LVdSTh5EPzkvFoutvrOBuX594PgN0pJyixBoIKrrCr8vhpyDmtjEcZneatf9xXpd0kU+QXcNbQzxAdZAloDAAmuN44S4d1n5T107oCQp/OnGd5MgGs/ls0q0llXZCyvjM3wejoCTDBRZqs8vo21CufTqgoJVbp5VO3o1IXdTEGBkHWfSAQKBgQDNhmuTja3MEPkBWhYed4snhzBNY/Oi3FdeD9K8Hb0n+6OaBNvl9DtZ2Lj2NZZe7kabmfWc29KaSayfrmoDD5g+xd/vuE9ZrhnpYQP9SEivOqTYCaRC57WzHGxMHDQldmgtN8bmTLLmPfOwXmYQ84u3gSkAhX+XEzrS5K4xdv6lVQKBgQCrUv1ZGiZciaR+bmDtDBnuVfu6fE4iZiN9xrj08ZMEz+eKC8ya00USOJq6VT97DOUE4CW4DnoYdCO83FfbenO/Mkr2BwrI+cAsgFay4/8JNZPSnoFwPrwxgYhlJakK3XiSi8fPZUCKmbw/F0UCqBJjAp2NRgHR8hKPkoH7fTeI7QKBgECaGAZxakfSrfJ21q0M9nieTdiFqnduuyed4aev0V1YA7zN+jD17BH5xWnevj1ouFkAs+tyTWih79jhggEkTb6thA5d6NNPnmV1UUO0DOTHkjk2DqPZIYwDSydBVkLQTT6pYaPSSAmHP6oYggyiATDVMIYxcEGUkdDogLibpr9hAoGBAKWZYx9kIl5iASjgIjoe71WrsNVR3+hqF7Y0hoTkmHoXR7PsscmZmvMA2bZwPhr/nML4shzViXjnkb+0sAuKsiTGRSTIK8mVdwbMyoDB1rudGRSFd5H6Ycfsb91s6JeC+U+VYv553UfbT9Uf9emacaNYXNe4Knw3Y295asCfCTYFAoGBAKPdKT8UrfzIN5E9jHF9/xmNCZzybg8HQreH9TlzHRT9I4bUBk5qyn7laA1nDWCDCw5/pU6Old7Rzp2+bIpxx5XMIflDGRLXJ9bRy9g2e9XcBob0/UwwjCJWXVVEzZq+OPQaq79Xm0swEMCnl+9cjNZYB6/k8a+TqZ6n3oX3lX0p";
    //Controller Mapping:得放到服务器上，且使用域名解析 IP
    public static String notify_url = "http://www.linhongcun.com/SpringBootPay-0.0.1-SNAPSHOT/pay/notifyUrl";

    //Controller Mapping:得放到服务器上，且使用域名解析 IP
    public static String return_url = "http://127.0.0.1:8084/returnUrl";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 支付宝网关（注意沙箱alipaydev，正式则为 alipay）
    public static String url ="https://openapi.alipaydev.com/gateway.do";

    public static String charset = "UTF-8";

    public static String format = "json";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 公钥（填自己的，下面都是改过的~）
    public static String public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiYtqT2XxJXd7z0aw4GsrJ07WwzmWxdPFyCqPPVjqdQUiXgYJMkAlQUTDoGyzC+ZBZ9V/nS/8OrxRay8TIpr5EA4HH0kUdVfgvDtx2+h5iAhQDJl4eQp6VPV0F+Mne8ah2a+fmhYE7Rv+J7DhkYTehqlUFDhA0W3EN9o2E40uHeJKGHcXiryBfpd+6thqTHfY5S9r+v026zs7MBomm0mbLqJ/SrdbHNigcV69BgcWdo2TgLkvBROmMPpROhsnyqh8wp+OZc270+g1mXdtbveHhRT1dEAmT5twz2eokqD3B8UQAAvuwrtPU3uZFsp/U1Lr9sxEopzz0rMQcGHJd9c3sQIDAQAB";
    public static String signtype = "RSA2";











}
