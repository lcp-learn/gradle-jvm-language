package com.lcp.spb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.{Banner, WebApplicationType}

/**
 * desc:    <br/>
 *
 * @since 2021/7/26-17:25 
 * @author lichunpeng 
 */
@SpringBootApplication
class AppConfig

object ScalaApplication extends App {
  val springBuilder = new SpringApplicationBuilder(classOf[AppConfig])
  val applicationContext = springBuilder
    .bannerMode(Banner.Mode.OFF)
    .web(WebApplicationType.SERVLET).run()

  applicationContext.getBeanDefinitionNames.foreach(name => {
    println(s"name:\t$name")
  })

  //  SpringApplication.run(classOf[AppConfig])
}