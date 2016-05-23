package uebung8_4_b;

public class Start {
	public static void main(String[] args) {
		int bufferSize = 200;
		int durchläufe = 10000;
		System.out.println("buffer: " + bufferSize + " runs: " + durchläufe);
		boolean debug = false;
		IBuffer buffer = new BufferSemaphor(bufferSize);
		BufferReader bufferR = new BufferReader(durchläufe, buffer, debug);
		BufferWriter bufferW = new BufferWriter(durchläufe, buffer, debug);
		bufferR.start();
		bufferW.start();

	}
}
