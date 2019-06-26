package fr.icam.emit.san.design;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import San.Feature;
import San.Instrument;
import San.Measure;
import San.Mode;
import San.SanFactory;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public EObject createFeature(EObject self, String arg) {
    	Feature feature = SanFactory.eINSTANCE.createFeature();
    	feature.setName("new feature");
    	feature.setFactor(0);
    	((Instrument) self).getFeatures().add(feature);
    	return feature;
    }
    
    public boolean isInput(Feature self) {
    	return self.getMode().equals(Mode.INPUT);    	
    }
    
    public String getFeatureName(Feature self) {
    	if (self.getMeasure() == null) {
    		return "no unit found";
    	} else {
    		return self.getMeasure().getUnit();
    	}
    }
    
    public List<Measure> allMeasureInstances(EObject eObject) {
    	List<Measure> measures = new ArrayList<>();
    	
    	eObject.eResource().getAllContents().forEachRemaining(item -> {
    		if (item instanceof Measure) {
    			measures.add((Measure) measures);
    		}
    	});
    	return measures;
    }
}

