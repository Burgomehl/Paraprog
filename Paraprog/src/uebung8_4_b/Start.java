package uebung8_4_b;

public class Start {
	public static void main(String[] args) {
		int bufferSize = 200;
		int durchl�ufe = 10000;
		System.out.println("buffer: " + bufferSize + " runs: " + durchl�ufe);
		boolean debug = false;
		IBuffer buffer = new BufferSemaphor(bufferSize);
		BufferReader bufferR = new BufferReader(durchl�ufe, buffer, debug);
		BufferWriter bufferW = new BufferWriter(durchl�ufe, buffer, debug);
		bufferR.start();
		bufferW.start();

	}
}
