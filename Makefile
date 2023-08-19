compile:
	javac -d classes sources/MaquinaRefrigeranteView.java sources/MaquinaRefrigerante.java		

run:
	java -cp classes MaquinaRefrigeranteView

clear:
	rm -f classes/*.class