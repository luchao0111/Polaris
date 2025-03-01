package com.nepxion.polaris.component.env.constant;

public class PolarisEnvConstant {
    // 根域名相关定义。包含三种传值方式，优先级至上而下。使用者需要把根域值改掉
    // 1. 通过-Droot.domain=nepxion.com或者System.setProperty("root.domain", "nepxion.com")方式进行传入
    // 2. 通过大写的ROOT.DOMAIN，其值为nepxion.com的System ENV方式进行传入
    // 3. 通过DevOps在server.properties定义root.domain=nepxion.com方式进行传入
    public static final String ROOT_DOMAIN_NAME = "root.domain";
    public static final String ROOT_DOMAIN_VALUE = "nepxion.com";

    // 区域名相关定义。包含三种传值方式，优先级至上而下
    // 1. 通过-Dzone=sha或者System.setProperty("zone", "sha")方式进行传入
    // 2. 通过大写的ZONE，其值为sha的System ENV方式进行传入
    // 3. 通过DevOps在server.properties定义zone=sha方式进行传入

    // 区域名分隔符相关定义
    // ZONE_SEPARATE表示区域在域名中的分隔符
    // ZONE_SEPARATE_PREFIX表示区域在域名中的分隔符是否在前面还是后面
    // 包含两种表现形式。特别注意：zone占位符前后切记不要出现分隔符，因为框架会自动去适配
    // 1. 例如，原始格式为nacos-fat${zone}.${root.domain}
    //    1.1 在zone存在的情况下，会解析成nacos-fat-sha.nepxion.com
    //    1.2 在zone缺失的情况下，会解析成nacos-fat.nepxion.com
    // 2. 例如，原始格式为${zone}fat-nacos.${root.domain}
    //    2.1 在zone存在的情况下，会解析成sha-fat-nacos.nepxion.com
    //    2.2 在zone缺失的情况下，会解析成fat-nacos.nepxion.com
    public static final String ZONE_NAME = "zone";
    public static final String ZONE_SEPARATE = "-";
    public static final boolean ZONE_SEPARATE_PREFIX = true;

    // 环境名相关定义。包含三种传值方式，优先级至上而下。以开发环境为例
    // 1. 通过-Denv=dev或者System.setProperty("env", "dev")方式进行传入
    // 2. 通过大写的ENV，其值为dev的System ENV方式进行传入
    // 3. 通过DevOps在server.properties定义env=dev方式进行传入
    public static final String ENV_NAME = "env";

    // server.properties文件的存放位置
    public static final String SERVER_PROPERTIES_PATH_WINDOWS = "C:/opt/settings/server.properties";
    public static final String SERVER_PROPERTIES_PATH_LINUX = "/opt/settings/server.properties";

    // 日志文件的存放位置
    public static final String LOG_PATH_WINDOWS = "C:/opt/logs/";
    public static final String LOG_PATH_LINUX = "/opt/logs/";

    public static final String META_INF_PATH = "classpath:/META-INF/";
}