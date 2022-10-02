filename = Assignment2

all: compile run

compile:
	javac Assignment2.java

run:
	java Assignment2.java

clean:
	rm Assignment2.class
