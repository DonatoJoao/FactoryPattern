package factoryPattern;

public class TestaFactoryPattern {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape circulo = shapeFactory.getShape("Circulo");
		circulo.draw();
		
		Shape retangulo = shapeFactory.getShape("Retangulo");
		retangulo.draw();
		
		Shape quadrado = shapeFactory.getShape("Quadrado");
		quadrado.draw();
		
	}

}
