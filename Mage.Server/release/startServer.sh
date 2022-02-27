#!/bin/sh

java -Xms256M -Xmx512M -Dfile.encoding=UTF-8 -Djava.security.policy=./config/security.policy -Dlog4j.configuration=file:./config/log4j.properties -cp ./plugins/mage-player-human-1.4.50.jar:./plugins/mage-player-ai-ma-1.4.50.jar:./plugins/mage-game-twoplayerduel-1.4.50.jar:./lib/mage-server-1.4.50.jar mage.server.Main -testMode=true
