package lesson5.prog6.exerciseA;

public class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	double processorSpeed;

	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}

	double getRamSize() {
		return ramSize;
	}

	double getProcessorSpeed() {
		return processorSpeed;
	}

	double computePower() {
		return ramSize * processorSpeed;
	}

	public String toString() {
		return "Ram size is: " + ramSize + "\n Processor Speed is: " + processorSpeed;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (!(ob instanceof Computer))
			return false;

		Computer cp = (Computer) ob;

		if (cp.manufacturer.equals(this.manufacturer) && cp.processor.equals(this.processor)
				&& cp.ramSize == this.ramSize && cp.processorSpeed == this.processorSpeed) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int h = 17;
		h += manufacturer.hashCode();
		h += processor.hashCode();
		h += ramSize;
		int f1 = (int) Double.doubleToLongBits(processorSpeed);
		h += f1 ^ (f1 >>> 32);
		return h;
	}
}
