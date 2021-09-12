plugins {
    java
    war
    id("com.bmuschko.tomcat")
}

group = "com.epam"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
val tomcatVersion = "9.0.1"

dependencies {


//    implementation("javax.jws:javax.jws-api:1.1")
//// https://mvnrepository.com/artifact/javax.xml.ws/jaxws-api
//    implementation("javax.xml.ws:jaxws-api:2.3.1")

    tomcat("org.apache.tomcat.embed:tomcat-embed-core:${tomcatVersion}")
    tomcat("org.apache.tomcat.embed:tomcat-embed-logging-juli:9.0.0.M6")
    tomcat("org.apache.tomcat.embed:tomcat-embed-jasper:${tomcatVersion}")
//// https://mvnrepository.com/artifact/com.sun.xml.bind/jaxb-impl
//    implementation("com.sun.xml.bind:jaxb-impl:3.0.2")



    // https://mvnrepository.com/artifact/jakarta.xml.ws/jakarta.xml.ws-api
    implementation("jakarta.xml.ws:jakarta.xml.ws-api:3.0.1")

// https://mvnrepository.com/artifact/jakarta.jws/jakarta.jws-api
    implementation("jakarta.jws:jakarta.jws-api:3.0.0")

    // https://mvnrepository.com/artifact/com.sun.xml.ws/jaxws-rt
    implementation("com.sun.xml.ws:jaxws-rt:3.0.0")

    // https://mvnrepository.com/artifact/jakarta.servlet/jakarta.servlet-api
    tomcat("jakarta.servlet:jakarta.servlet-api:5.0.0")


    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tomcat {
    contextPath = "/"
    httpProtocol = "org.apache.coyote.http11.Http11Nio2Protocol"
    ajpProtocol = "org.apache.coyote.ajp.AjpNio2Protocol"
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}



//    // https://mvnrepository.com/artifact/com.sun.xml.ws/jaxws-rt
//    implementation("com.sun.xml.ws:jaxws-rt:3.0.2")
//    // https://mvnrepository.com/artifact/com.sun.xml.ws/jaxws-tools
//    implementation("com.sun.xml.ws:jaxws-tools:3.0.2")
//    // https://mvnrepository.com/artifact/com.sun.xml.ws/rt
//    implementation("com.sun.xml.ws:rt:3.0.2")
//// https://mvnrepository.com/artifact/com.sun.xml.ws/servlet
//    implementation("com.sun.xml.ws:servlet:3.0.2")

//    // https://mvnrepository.com/artifact/org.glassfish.hk2/hk2
//    implementation("org.glassfish.hk2:hk2:3.0.2")
//// https://mvnrepository.com/artifact/org.glassfish.jaxb/jaxb-runtime
//    implementation("org.glassfish.jaxb:jaxb-runtime:3.0.2")
//
//    // https://mvnrepository.com/artifact/org.glassfish.ha/ha-api
//    implementation("org.glassfish.ha:ha-api:3.1.13")
//    // https://mvnrepository.com/artifact/org.glassfish.hk2/hk2
//    implementation("org.glassfish.hk2:hk2:3.0.2")
//
////// https://mvnrepository.com/artifact/org.glassfish.hk2/osgi-resource-locator
////    implementation("org.glassfish.hk2:osgi-resource-locator:2.5.0-b42")


// https://mvnrepository.com/artifact/javax.jws/javax.jws-api


//    implementation("org.glassfish.jersey.inject:jersey-hk2:2.28")
//    // https://mvnrepository.com/artifact/org.glassfish.jersey.core/jersey-server
//    implementation("org.glassfish.jersey.core:jersey-server:2.34")
//    // https://mvnrepository.com/artifact/org.glassfish.jersey.containers/jersey-container-servlet-core
//    implementation("org.glassfish.jersey.containers:jersey-container-servlet-core:2.34")
