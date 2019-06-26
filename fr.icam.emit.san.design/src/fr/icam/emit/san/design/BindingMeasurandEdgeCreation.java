package fr.icam.emit.san.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import San.Binding;
import San.Measurand;

public class BindingMeasurandEdgeCreation implements IExternalJavaAction{

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		
		if ((parameters.get("source") instanceof Binding) && parameters.get("target") instanceof Measurand) {			
			((Binding) parameters.get("source")).setMeasurand((Measurand) parameters.get("target"));
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true				;
	}

}
