package fr.icam.emit.san.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import San.Instrument;
import San.Network;
import San.SanFactory;

public class InstrumentCreation implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Network network = (Network) parameters.get("network");
		Instrument instrument = SanFactory.eINSTANCE.createInstrument();
		instrument.setName("new instrument");
		network.getInstruments().add(instrument);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true			;
	}


}
