package examples;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class Example1 {

	public static void main(String[] args) {
		// Carga la libreria
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        // Crea una matriz de 3x3
        Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
        
        // Muestra la matriz
        System.out.println("mat = " + mat.dump());
	}
}
