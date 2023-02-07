package factoryPattern;

public class ShapeFactory {
	
	public Shape getShape (String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("Circulo")) {
			return new Circulo();
		}
		else if (shapeType.equalsIgnoreCase("Quadrado")) {
			return new Quadrado();
		}
		else if (shapeType.equalsIgnoreCase("Retangulo")) {
			return new Retangulo();
		}
		
		return null;
	}
	

}
