all: viewDoc test Exec 

Robot.class:
	cd src ; javac example/Robot.java -d ../classes ; cd ..

Box.class:
	cd src ; javac example/util/Box.java -d ../classes ; cd ..


docs:
	cd src ; javadoc -author example example.util -d ../docs ; cd ..


viewDoc: docs
	cd docs ; firefox index.html ; cd ..




BoxTest: BoxTest.class
	java -jar test-1.7.jar BoxTest ; mv test-1.7.jar test 


BoxTest.class: test/BoxTest.java Box.class
	cd test ; mv test-1.7.jar .. ; cd .. ; javac -classpath test-1.7.jar  test/BoxTest.java

RobotTest: RobotTest.class
	java -jar test-1.7.jar RobotTest ; mv test-1.7.jar test 


RobotTest.class: Robot.class
	cd test ; mv test-1.7.jar .. ; cd .. ; javac -classpath test-1.7.jar  test/RobotTest.java 

test: RobotTest BoxTest
	 



Robot: Robot.class
	java -classpath classes example.Robot

Exec: appli.jar 
	java -jar appli.jar

appli.jar: Robot.class
	cd classes;jar cvfm ../appli.jar ../manifest-ex example;cd ..



clear:
	rm -r docs
	cd test ; rm *.class ; cd ..
	cd classes ; rm -r example ; cd ..
	rm -r appli.jar

zip: clear
	cd .. ; zip -r pierrickMeignant_maximeDeroissart_tp4.zip tp4 ; cd tp4
	







