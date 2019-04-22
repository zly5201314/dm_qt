package com.jk.util;

public class AlipayConfig {

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ APPID（填自己的，下面都是改过的~）
    public static String app_id ="2016093000631396";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 生成公钥时对应的私钥（填自己的，下面都是改过的~）
    public static String private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCm5knDmeinlY+KbU31aIrsGSb80UP914DXrNSOkykOkE15fA4xsvGNqudSKU0HGQAj9DYuoxQV9znhaQNDcYOu96OLLBEBPoOzkpmNajhOT8NslAMYPf5H47yaYrv1E4pe64lBNBiNGc9V5fcIgshszAzLKZsln7/NhYxFOq0rzXwEEkWc0bmyINQtULQ8nD3pGl11ERt4K4Xrz+o7H2r7v/PFNQ8jrnkoFVghPU9d6mkAWo77TX5U4tplifkSd3X5W5wIKJcUhfB/XUnwipUDOUQ+LBbVgVZLW+2Z2Fk+/8xG87AqOs6FhtRDeExpJYkckHOeLWZGgYKTT8i18McvAgMBAAECggEAI8uwdmtEIu1I4/+dgMzzPsAGRKL9WiwmThubWxjk7WK1uyCIStB+TkwhYNXK14LdLNjr5gTEAhIML/Q95vEptRUX1nmVDBdEV/dRR6tIeENTPq5gG4rwRqrpgJM8jMusGb+aqIlr2pd2iI3R9dlW8z6wX8KErAUfNg02kIKNMZ9/BpBMHXOfA8ROwXEDSGSXP33VfpRLzZoSjnCahHJSPSlg7ueX+qRb+xWe5u06RNgUxFGDjaZsV+oupy3BeHSWwCQacv7rLziDzo7quIGTyZsJYrgnZhA5oXeBULRRc1Jjs/uWEL7cysE6NcKtYXaIc/lW27TrGDrFX+OTgkRygQKBgQDxUKlAbtCadHVC4u9FtaxphktoAsWMGwY83UpQAIemo11OBPtQrNxy+oGHk9BlfVrLalB7fWt60g9PwN66z/PMqjbt94/xUJEP4zTQTChk8hEgTggDxxx+IzZKqepr/VScjUJwpvCQR7ZMSWwAgtAAPCgCdLH9XcF7c+84BrHRGQKBgQCxDldXZaruJnFi2jGOHnhcG1JKv3wub9WVQADZhIWT+zcd81uRQWoEcJJSSnj8MrHTj84x0CtEFnNCDvOlTeoa3wu3spfOc1DCwf3Cy6UiBYWgjg4I47W3DSvZ3Qf35j436hQkn+dbD6mvCybnJMT2Zka7q4aml+yCxqB3hGj7hwKBgHS791QjByhgg8UacHMBYmkdvOaQyK1w+UCCMAupZfWXe3BdepFZPb8lLXm/aIVf8YcLY+mJD3A3o46KF3S5Wg+8m5vcMTakKbhMyeSlorjKXLyK4teo/0CJmh7eOXeJ8d9VejlymFbDSg13SxaoMSSb9SLS/rM5Inqs56DrpCMpAoGAM8xTRxFKSXPbtiTJXJ+TbLbdg1qz1M4I+SoJVZmMjrdu74czobI2dugMFqEM9hNKrO8kTrRtA/VhcND4/MJnm8bnIa3Q9agM131zZNq5C9P7vPXyKy2bCtuCmbEtVJv6VddYX0Kcp6pUZQ5pKjQ6ny9awCq1MOW/Xp8HcQ++ut8CgYEAi4ThwVy46uCYhIBR2K7dLPyhKQ63MXeMTrJ7bGfg4O/OeWryBZ43lCkmPDh6W9XxktS8A79wawrcLfpr0ZkxlCM74GR1RqyDZCngctrpdGp+wEcF3+DCPwIghqdikuo9wW86MSb2j2hYkTdbO1t+lUf7n+8ArTlPyrBm7InZR/A=";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 生成公钥时对应的私钥（填自己的，下面都是改过的~）
    //Controller Mapping:得放到服务器上，且使用域名解析 IP
    public static String notify_url = "http://www.linhongcun.com/SpringBootPay-0.0.1-SNAPSHOT/pay/notifyUrl";

    //Controller Mapping:得放到服务器上，且使用域名解析 IP
    public static String return_url = "http://127.0.0.1:8084/returnUrl";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 支付宝网关（注意沙箱alipaydev，正式则为 alipay）
    public static String url = "https://openapi.alipaydev.com/gateway.do";

    public static String charset = "UTF-8";

    public static String format = "json";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 公钥（填自己的，下面都是改过的~）
    public static String public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApuZJw5nop5WPim1N9WiK7Bkm/NFD/deA16zUjpMpDpBNeXwOMbLxjarnUilNBxkAI/Q2LqMUFfc54WkDQ3GDrvejiywRAT6Ds5KZjWo4Tk/DbJQDGD3+R+O8mmK79ROKXuuJQTQYjRnPVeX3CILIbMwMyymbJZ+/zYWMRTqtK818BBJFnNG5siDULVC0PJw96RpddREbeCuF68/qOx9q+7/zxTUPI655KBVYIT1PXeppAFqO+01+VOLaZYn5End1+VucCCiXFIXwf11J8IqVAzlEPiwW1YFWS1vtmdhZPv/MRvOwKjrOhYbUQ3hMaSWJHJBzni1mRoGCk0/ItfDHLwIDAQAB";

    public static String signtype = "RSA2";











}
