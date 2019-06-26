package fr.icam.emit.san.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import San.Feature;
import San.Instrument;
import San.Mode;
import San.SanFactory;

public class FeatureCreation implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Instrument instrument = (Instrument) parameters.get("instrument");
		Feature feature = SanFactory.eINSTANCE.createFeature();
		feature.setName("new feature");
		feature.setFactor(0);
		feature.setMode(Mode.INPUT);
		instrument.getFeatures().add(feature);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true			;
	}


}
