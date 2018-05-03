package genericCheckpointing.util;

public class MyAllTypesFirst extends SerializableObject{
	private int myInt;
	private int myOtherInt;
	private long myLong;
	private long myOtherLong;
	private String myString;
	private boolean myBool;
	
	
	public MyAllTypesFirst() {
	}
	
	public MyAllTypesFirst(int myIntIn, int myOtherIntIn, long myLongIn, long myOtherLongIn, String myStringIn, boolean myBoolIn) {
		myInt =  myIntIn;
		myOtherInt =  myOtherIntIn;
		myLong = myLongIn;
		myOtherLong = myOtherLongIn;
		myString = myStringIn;
		myBool =  myBoolIn;
	}

	public MyAllTypesFirst(String myStringIn, boolean myBoolIn) {
		myString = myStringIn;
		myBool = myBoolIn;
	}
	public int getMyInt() {
		return myInt;
	}
	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}
	public int getMyOtherInt() {
		return myOtherInt;
	}
	public void setMyOtherInt(int myOtherInt) {
		this.myOtherInt = myOtherInt;
	}
	public long getMyLong() {
		return myLong;
	}
	public void setMyLong(long myLong) {
		this.myLong = myLong;
	}
	public long getMyOtherLong() {
		return myOtherLong;
	}
	public void setMyOtherLong(long myOtherLong) {
		this.myOtherLong = myOtherLong;
	}
	public String getMyString() {
		return myString;
	}
	public void setMyString(String myString) {
		this.myString = myString;
	}
	public boolean isMyBool() {
		return myBool;
	}
	public void setMyBool(boolean myBool) {
		this.myBool = myBool;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (myBool ? 1231 : 1237);
		result = prime * result + myInt;
		result = prime * result + (int) (myLong ^ (myLong >>> 32));
		result = prime * result + myOtherInt;
		result = prime * result + (int) (myOtherLong ^ (myOtherLong >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyAllTypesFirst other = (MyAllTypesFirst) obj;
		if (myBool != other.myBool)
			return false;
		if (myInt != other.myInt)
			return false;
		if (myLong != other.myLong)
			return false;
		if (myOtherInt != other.myOtherInt)
			return false;
		if (myOtherLong != other.myOtherLong)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyAllTypesFirst [myInt=" + myInt + ", myOtherInt=" + myOtherInt + ", myLong=" + myLong
				+ ", myOtherLong=" + myOtherLong + ", myString=" + myString + ", myBool=" + myBool + "]";
	}
	
	

}
