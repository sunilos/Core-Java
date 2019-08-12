package com.sunilos.p10io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * An example of Externalizable interface that serializes a transient variable.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class MarksheetBeanExt implements Externalizable {

	String name = null;
	int maths = 0;
	int physics = 0;
	int chemistry = 0;

	// transient variables will not be serialized

	/**
	 * total is a calculated transient field,
	 */
	transient int total = 0;

	/**
	 * Percentage is a calculated transient field
	 */
	transient double percentage = 0;

	/**
	 * Transient temporary variable
	 */
	transient int temp = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	/**
	 * Calculates total
	 * 
	 * @return
	 */
	public int getTotal() {
		total = maths + physics + chemistry;
		return total;
	}

	/**
	 * Calculates percentage
	 * 
	 * @return
	 */
	public double getPercentage() {
		percentage = total / 3;
		return percentage;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		name = (String) in.readObject();
		physics = in.readInt();
		chemistry = in.readInt();
		maths = in.readInt();
		// Deserialize transient variable
		temp = in.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(physics);
		out.writeInt(chemistry);
		out.writeInt(maths);
		// Serialize transient variable
		out.writeInt(temp);
	}

}
