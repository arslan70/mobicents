package org.rockville.ra;

import org.rockville.ratype.AkkaProvider;

public class AkkaProviderImpl implements AkkaProvider {

	private final AkkaResourceAdaptor ra;
	public AkkaProviderImpl(AkkaResourceAdaptor AkkaRA){
		ra = AkkaRA;
	}

	@Override
	public void send(String message) {
		ra.send(message);
		
	}
  // TODO: Fill with proper methods...
}
