package com.kodnest.Achieving_Encapsulation_Using_Constructor;

public class Laptop {
	private String ProcessorName;
	private int MemorySize;
	public Laptop(String ProcessorName,int MemorySize)
	{
		this.ProcessorName=ProcessorName;
		this.MemorySize=MemorySize;
	}
	public String getProcessorName()
	{
		return ProcessorName;
	}
	public int getMemorySize()
	{
		return MemorySize;
	}

}
