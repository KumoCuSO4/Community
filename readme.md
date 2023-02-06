# Community

使用Spring Boot建立web应用

## day1

通过 [spring initializr](https://start.spring.io/) 创建项目

com.mgp.community

依赖: aop devtools thymeleaf web

spring 开发思想 控制反转IoC (Inversion of Control)：获得依赖对象的过程由自身管理变为了由IOC容器主动注入。 方法：依赖注入（Dependency Injection）
达到解耦合

运行CommunityApplication

## day2

Spring容器也叫IoC容器，本质上就是一个工厂。Spring容器不但可以管理Bean，还能管理Bean的生命周期、作用域。Spring容器的顶层接口是BeanFactory，而常用的是其子接口ApplicationContext。

Bean注解：@Controller（控制器） @Service（服务） @Repository（数据库） @Component（通用） @...(name)设置Bean名称

ApplicationContextAware

applicationContext.getBean

Bean默认单例，使用注解@Scope("prototype")改为多例

@Primary指定Bean优先

配置类@Configuration

自动装配@Autowired 使用@Qualifier(name)选择符合名称的Bean

## day3

web server三层架构：表现层、业务层、数据访问层

mvc解决表现层的问题 model view controller

DispatcherServlet 前端控制器 spring mvc的核心

Thymeleaf 模板引擎 生成动态的HTML 通过模板文件+Model生成HTML

接受浏览器请求数据HttpServletRequest 返回数据HttpServletResponse 会由DispatcherServlet自动传入

/...?variable=... 参数自动传入方法，只要参数名对应即可，可以加@RequestParam(name = "variable", required = false, defaultValue = "defaultValue")

/.../{variable} 路径参数 @PathVariable("variable")

ModelAndView存储模型数据和路径，需要主动实例化。Model存储模型数据，可以自动实例化。

spring从/resources/static加载静态页面，/resources/templates加载模板页面，页面路径为文件夹下的路径

## day4

MyBatis 

SqlSession，用于向数据库执行SQL，由SqlSessionFactory创建。主配置文件对底层做出详细配置。开发时不用涉及 

Mapper接口，即DAO接口

Mapper映射器，编写SQL，将SQL与实体类映射。

引入依赖mysql,mybatis

在application.properties中编写数据库设置

创建entity/User用户数据类，alt+insert插入Getter Setter toString()

在dao下建立interface UserMapper，定义接口，使用注解@Mapper

在resources/mapper下建立user-mapper.xml，实现接口编写sql语句

通过\<sql id="...">...<\sql> 和\<include refid="..."/>复用sql语句

