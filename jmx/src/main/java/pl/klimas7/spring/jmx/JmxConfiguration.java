package pl.klimas7.spring.jmx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.export.assembler.InterfaceBasedMBeanInfoAssembler;
import org.springframework.jmx.export.assembler.MethodExclusionMBeanInfoAssembler;
import org.springframework.jmx.export.assembler.MethodNameBasedMBeanInfoAssembler;
import org.springframework.jmx.support.ConnectorServerFactoryBean;
import org.springframework.remoting.rmi.RmiRegistryFactoryBean;

import javax.management.MalformedObjectNameException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Configuration
public class JmxConfiguration {

//    @Bean
//    public RmiRegistryFactoryBean rmiRegistryFactoryBean() {
//        RmiRegistryFactoryBean rrfb = new RmiRegistryFactoryBean();
//        rrfb.setPort(9001);
//        return rrfb;
//    }
//
//    @Bean
//    public ConnectorServerFactoryBean connectorServerFactoryBean() throws MalformedObjectNameException {
//        ConnectorServerFactoryBean csfb = new ConnectorServerFactoryBean();
//        csfb.setObjectName("connector:name=rmi");
//        csfb.setServiceUrl("service:jmx:rmi://localhost/jndi/rmi://localhost:9001/jmxApplication");
//        return csfb;
//    }

    @Bean
    public MethodNameBasedMBeanInfoAssembler assembler() {
        MethodNameBasedMBeanInfoAssembler methodNameBasedMBeanInfoAssembler = new MethodNameBasedMBeanInfoAssembler();
        // first solution
        //methodNameBasedMBeanInfoAssembler.setManagedMethods("getMessage", "setMessage");

        //second solution
        Properties properties = new Properties();
        properties.put("jmxApplication:name=MessageManageOperation", "getMessage,setMessage");

        methodNameBasedMBeanInfoAssembler.setMethodMappings(properties);
        return methodNameBasedMBeanInfoAssembler;
    }

    @Bean
    public MethodExclusionMBeanInfoAssembler excludeAssembler() {
        MethodExclusionMBeanInfoAssembler methodExclusionMBeanInfoAssembler = new MethodExclusionMBeanInfoAssembler();
        methodExclusionMBeanInfoAssembler.setIgnoredMethods("setPrivateMessage");
        return methodExclusionMBeanInfoAssembler;
    }

    @Bean
    public InterfaceBasedMBeanInfoAssembler interfaceAssembler() {
        InterfaceBasedMBeanInfoAssembler interfaceBasedMBeanInfoAssembler = new InterfaceBasedMBeanInfoAssembler();
        interfaceBasedMBeanInfoAssembler.setManagedInterfaces(MessageManageOperation.class);
        return interfaceBasedMBeanInfoAssembler;
    }

    @Bean
    public MBeanExporter mBeanExporter(MessageManageOperation messageManageOperation,
                                       MethodNameBasedMBeanInfoAssembler assembler,
                                       MethodExclusionMBeanInfoAssembler excludeAssembler,
                                       InterfaceBasedMBeanInfoAssembler interfaceAssembler) {
        MBeanExporter mBeanExporter = new MBeanExporter();
        Map<String, Object> beans = new HashMap<>();
        beans.put("jmxApplication:name=MessageManageOperation", messageManageOperation);
        mBeanExporter.setBeans(beans);
        //mBeanExporter.setAssembler(assembler);
//        mBeanExporter.setAssembler(excludeAssembler);
        mBeanExporter.setAssembler(interfaceAssembler);
        return mBeanExporter;
    }

    /*
    https://docs.oracle.com/en/java/javase/13/management/java-se-monitoring-and-management-guide.pdf
     */

    /*
    JMX Remote API
    Or In VM options:
    -Dcom.sun.management.jmxremote=true
    -Dcom.sun.management.jmxremote.port=9001
    -Dcom.sun.management.jmxremote.host=localhost
    -Dcom.sun.management.jmxremote.ssl=false
    -Dcom.sun.management.jmxremote.authenticate=false
    -Djava.rmi.server.hostname=127.0.0.1

    hostname -i
     */
}
