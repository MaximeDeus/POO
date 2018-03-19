all: viewDoc test Exec 


docs:
	cd src ; javadoc -author example example.util -d ../docs ; cd ..


viewDoc: docs
	cd docs ; firefox index.html ; cd ..




Choice.class:
	javac src/pfc/Choice.java -d classes

Choice: Choice.class
	java -classpath classes pfc.Choice

choiceTest.class: Choice.class
	javac -classpath test-1.7.jar test/choiceTest.java

choiceTest: choiceTest.class
	java -jar test-1.7.jar choiceTest


Strategy.class:
	javac -classpath src src/pfc/Strategy.java -d classes

Player.class: Strategy.class
	javac -classpath src src/pfc/Player.java -d classes

Player:  Player.class
	java -classpath classes pfc.Player

PlayerTest.class: Player.class
	javac -classpath test-1.7.jar:src test/PlayerTest.java

PlayerTest: PlayerTest.class
	java -jar test-1.7.jar PlayerTest


test: choiceTest PlayerTest

Exec: appli.jar 
	java -jar appli.jar

appli.jar: Robot.class
	cd classes;jar cvfm ../appli.jar ../manifest-ex example;cd ..



clear:
	rm -rf docs
	cd test ; rm -rf *.class ; cd ..
	cd classes ; rm -rf example ; cd ..
	rm -rf appli.jar

zip: clear
	cd .. ; zip -r pierrickMeignant_maximeDeroissart_tp4.zip tp4 ; cd tp4
	







