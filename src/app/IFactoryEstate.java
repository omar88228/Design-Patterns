package app;

import entity.IEstate;

public interface IFactoryEstate {
	public IEstate getEstate(String type, String[] attributes);
}
