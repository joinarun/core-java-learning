package com.cisco.training.basics.java8intf;

public interface SomeIntf extends Stack,SomeOtherCollection {

	@Override
	default int size() {
		
		return SomeOtherCollection.super.size();
	}

}
