all: compilation test doc

compilation: HanoiMain.class DiscTest.class TowerTest.class HanoiTest.class

test: DiscTest TowerTest HanoiTest

doc:
	cd src ; javadoc -author -d ../docs -subpackages hanoi ; cd .. ; firefox docs/index.html

play: HanoiMainplay

solve: HanoiMainsolve

executable: compilation doc	
	jar cvfm votrehanoi.jar manifest-ex docs test -C classes hanoi -C classes io


Disc.class:
	javac src/hanoi/util/Disc.java -d classes

Tower.class: Disc.class
	javac -classpath src src/hanoi/util/Tower.java -d classes

Hanoi.class: Tower.class
	javac -classpath src src/hanoi/Hanoi.java -d classes

HanoiMain.class: Hanoi.class HanoiInput.class
	javac -classpath src src/hanoi/HanoiMain.java -d classes

HanoiInput.class: Input.class
	javac -classpath src src/io/HanoiInput.java -d classes

Input.class:
	javac -classpath src src/io/Input.java -d classes

DiscTest.class: Disc.class
	javac -classpath test-1.7.jar:src test/DiscTest.java

TowerTest.class: Tower.class
	javac -classpath test-1.7.jar:src test/TowerTest.java

HanoiTest.class: Hanoi.class
	javac -classpath test-1.7.jar:src test/HanoiTest.java

Disc: Disc.class
	java -classpath classes hanoi.util.Disc

Tower: Tower.class
	java -classpath classes hanoi.util.Tower

Hanoi: Hanoi.class
	java -classpath classes hanoi.Hanoi

DiscTest: DiscTest.class
	java -jar test-1.7.jar DiscTest

TowerTest: TowerTest.class
	java -jar test-1.7.jar TowerTest

HanoiTest: HanoiTest.class
	java -jar test-1.7.jar HanoiTest


HanoiMain: HanoiMain.class
	java -classpath classes hanoi.HanoiMain

HanoiMainplay: HanoiMain.class
	java -classpath classes hanoi.HanoiMain play 3

HanoiMainsolve: HanoiMain.class
	java -classpath classes hanoi.HanoiMain solve 3



	
