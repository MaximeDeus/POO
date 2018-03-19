all: compilation test doc executable ImageExample ImageMain

compilation: Image.class ImageExample.class ImageDisplayer.class ImageInterface.class UnknownPixelException.class ImageMain.class

test: GrayColorTest PixelTest

doc:
	cd src ; javadoc -author -d ../docs -subpackages image ; cd .. ; firefox docs/index.html

clean:
	rm -r classes ; mkdir classes ; cp -r images classes  ; rm -r docs ; mkdir docs

executable: executableExample executableMain

executableExample: compilation doc	
	jar cvfm imageExample.jar manifest-ImageExample docs test -C classes image

executableMain: compilation doc	
	jar cvfm imageMain.jar manifest-ImageMain docs test -C classes image images

GrayColor.class:
	javac -classpath src src/image/color/GrayColor.java -d classes

GrayColorTest.class:
	javac -classpath test-1.7.jar test/GrayColorTest.java

GrayColorTest: GrayColorTest.class
	java -jar test-1.7.jar GrayColorTest

Pixel.class: GrayColor.class
	javac -classpath src src/image/Pixel.java -d classes

PixelTest.class: Pixel.class
	javac -classpath test-1.7.jar test/PixelTest.java

PixelTest: PixelTest.class
	java -jar test-1.7.jar PixelTest
	
Image.class: Pixel.class
	javac -classpath src src/image/Image.java -d classes
	
ImageExample.class: Image.class
	javac -classpath src src/image/ImageExample.java -d classes

ImageDisplayer.class: Image.class
	javac -classpath src src/image/ImageDisplayer.java -d classes
	
ImageInterface.class: Image.class
	javac -classpath src src/image/ImageInterface.java -d classes

ImageMain.class: Image.class
	javac -classpath src src/image/ImageMain.java -d classes

UnknownPixelException.class: Image.class
	javac -classpath src src/image/UnknownPixelException.java -d classes

ImageExample: ImageExample.class
	java -classpath classes image.ImageExample

ImageMain: ImageMain.class
	cd classes ; java image.ImageMain /images/lamp.pgm 15 16




	





	
