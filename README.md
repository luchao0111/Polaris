# Polaris

| 工程名 | 描述 |
| --- | --- |
| ![](http://nepxion.gitee.io/docs/icon-doc/direction_east.png) polaris-parent | Polaris Parent定义 |
| ![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-platform | Polaris平台目录 |
| &nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component | Polaris组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-common | Polaris通用组件 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-env | Polaris环境组件，支持DEV | FAT | UAT | PROD四个环境配置动态读取，支持动态域名，双云双活等 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-banner | Polaris旗标组件，用来启动时显示旗标和重要中间件版本号信息等 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-apollo | Polaris Apollo组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-apollo-starter-config | Polaris Apollo配置组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-nacos | Polaris Nacos组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-nacos-starter-config | Polaris Nacos配置组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-nacos-starter-discovery | Polaris Nacos注册发现组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-consul | Polaris Consul组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-consul-starter-discovery | Polaris Consul注册发现组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-eureka | Polaris Eureka组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-eureka-starter-discovery | Polaris Eureka注册发现组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-jaeger | Polaris OpenTracing + Jaeger组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-jaeger-starter | Polaris OpenTracing + Jaeger调用链监控组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-jaeger-starter-sentinel | Polaris OpenTracing + Jaeger调用链监控组件集成Sentinel的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-skywalking | Polaris SkyWalking组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-skywalking-starter | Polaris SkyWalking调用链监控组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-skywalking-starter-sentinel | Polaris SkyWalking调用链监控组件集成Sentinel的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-prometheus | Polaris Prometheus组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-prometheus-starter-micrometer | Polaris Prometheus监控组件集成Micrometer的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-spring-boot-admin | Polaris Spring Boot Admin组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-spring-boot-admin-starter | Polaris Polaris Spring Boot Admin监控组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-gray | Polaris Gray灰度蓝绿，版本分流，区域路由，环境隔离路由等组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-gray-common | Polaris Gray通用组件 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-gray-starter-gateway | Polaris Gray集成Spring Cloud Gateway网关的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-gray-starter-zuul | Polaris Gray集成Zuul网关的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-gray-starter-service | Polaris Gray集成服务的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-gray-starter-hystrix | Polaris Gray集成Hystrix限流熔断组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-gray-starter-agent | Polaris Gray集成跨线程Agent的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-sentinel | Polaris Sentinel限流熔断组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-sentinel-common | Polaris Sentinel通用组件 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-sentinel-config-starter-apollo | Polaris Sentinel集成Apollo配置组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-sentinel-config-starter-nacos | Polaris Sentinel集成Nacos配置组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-sentinel-starter-gateway | Polaris Sentinel集成Spring Cloud Gateway网关的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-sentinel-starter-zuul | Polaris Sentinel集成Zuul网关的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-sentinel-starter-service | Polaris Sentinel集成服务的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-console | Polaris控制台组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-console-config-starter-apollo | Polaris控制台集成Apollo配置组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-console-config-starter-nacos | Polaris控制台集成Nacos配置组件的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-console-starter | Polaris控制台组件 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-core | Polaris核心组件目录，主要是组装和代理基础底层组件 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-core-starter-discovery | Polaris注册发现组件的组装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-core-starter-discovery-gray | Polaris灰度蓝绿对注册发现组件的组装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-core-starter-config | Polaris配置组件的组装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-core-starter-config-gray | Polaris灰度蓝绿对配置组件的组装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-core-starter-config-console | Polaris控制台对配置组件的组装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-core-starter-config-sentinel | Polaris Sentinel对配置组件的组装 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-core-starter-monitor | Polaris监控组件的组装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-component-test | Polaris测试组件目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-component-test-automation-starter | Polaris自动化测试组件 |
| &nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_south.png) polaris-framework | Polaris框架目录 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-framework-starter-console | Polaris框架对控制台的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-framework-starter-gateway | Polaris框架对Spring Cloud Gateway网关的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-framework-starter-zuul | Polaris框架对Zuul网关的封装 |
| &nbsp;&nbsp;&nbsp;&nbsp;![](http://nepxion.gitee.io/docs/icon-doc/direction_west.png) polaris-framework-starter-service | Polaris框架对服务的封装 |