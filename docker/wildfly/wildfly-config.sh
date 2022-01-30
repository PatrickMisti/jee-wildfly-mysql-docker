#!/bin/bash
cd /opt/jboss/wildfly/bin
./standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 &
sleep 6
echo ''
echo '**************************************************'
echo 'Starting Jboss-cli config'
./jboss-cli.sh -c << EOF
deploy /opt/jboss/wildfly/tmp/mysql-connector-java-8.0.28.jar --name=mysql
data-source add --jndi-name=java:jboss/datasources/DemoDS --name=DemoDS --connection-url=jdbc:mysql://db/demoDS --driver-name=mysql --user-name=root --password=root --max-pool-size=25
shutdown
EOF
echo 'End of config'
echo '**************************************************'