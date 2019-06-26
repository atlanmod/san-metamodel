package fr.icam.emit.san.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import San.Feature;
import San.Measure;

public class FeatureMeasureEdgeCreation implements IExternalJavaAction{

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		
		if ((parameters.get("source") instanceof Feature) && parameters.get("target") instanceof Measure) {			
			((Feature) parameters.get("source")).setMeasure((Measure) parameters.get("target"));
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true				;
	}

}
