
## ApplicationStarter
项目启动类

## front模块
> 这个模块编写给网站客户提供服务的业务代码
```
|--com.daikuan.front
    -----app  手机接口处理层 
    ----controller  网站接口处理层
    ----dao   与数据库交互层 
    ----domain  数据对象与数据库一一对应
    ----service  业务处理层
    ----vo  表现层的体现
```

## common 
>  公共模块，监听器，自定义异常，工具类等
```
|--com.daikuan.common
       ----annotation  注解包
       ----aspect  切面包
       ----config  配置定义包
       ----controller  基础公共处理层
       ----dao   公共与数据库交互层 
       ----domain  公共数据对象与数据库一一对应
       ----exception  自定义异常包
       ----listenner  监听器包
       ----quartz  quartz配置包
       ----redis.shiro  shiro缓存包
       ----service  公共业务处理层
       ----task  定时任务包
       ----utils  常用工具类
```

## oa 
>  消息发布、阅读的业务模块
```
|--com.daikuan.front
    ----controller  
    ----dao   与数据库交互层 
    ----domain  数据对象与数据库一一对应
    ----service  业务处理层
```

## system
>  消息发布、阅读的业务模块
```
|--com.daikuan.system
    ----config    配置定义包
    ----controller  
    ----dao   与数据库交互层 
    ----domain  数据对象与数据库一一对应
    ----filter  过滤器的配置包
    ----service  业务处理层
    ----shiro  业务处理层
    ----vo  表现层的体现
```





