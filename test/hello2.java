package com.cerner.pophealth.refrecord.load.standardizer;

import com.cerner.pophealth.refrecord.load.code.CodeUtility;
import com.cerner.pophealth.refrecord.load.transform.TransformationContext;

/*[[[cog
import cog
model_name = "Alert"
cog.outl("import com.cerner.pophealth.refrecord.models.raw.Raw%s;" % model_name)
cog.outl("import com.cerner.pophealth.refrecord.models.standard.%s;" % model_name)
cog.outl()
cog.outl("public class %sStandardizer extends Standardizer<Raw%s, %s> {" % (model_name, model_name, model_name))
cog.outl("	public %sStandardizer(final CodeUtility codeUtility) {" % model_name)
]]]*/
import com.cerner.pophealth.refrecord.models.raw.RawAlert; //(generated)
import com.cerner.pophealth.refrecord.models.standard.Alert; //(generated)

public class AlertStandardizer extends Standardizer<RawAlert, Alert> { //(generated)
	public AlertStandardizer(final CodeUtility codeUtility) { //(generated)
//[[[end]]]
		super(codeUtility);
	}

	@Override
/*[[[cog
cog.outl("	protected %s doTransformation(final Raw%s raw%s, final TransformationContext context, final int sequence) {" % (model_name, model_name, model_name))
attribute_name_1 = "Category"
standardizeTypeDictionary = {'optional_code':'standardizeOptionalCode'}
type_value = standardizeTypeDictionary['optional_code']

cog.outl("		final %s.Builder %sBuilder = %s.newBuilder()" % (model_name, model_name.lower(), model_name))
cog.outl('				                .set%s(%s(raw%s.get%s(), context, "%s"));' % (attribute_name_1, type_value, model_name, attribute_name_1, attribute_name_1.lower()))
cog.outl("		return %sBuilder.build();" % model_name.lower())
cog.outl("	}")
]]]*/
protected Alert doTransformation(final RawAlert rawAlert, final TransformationContext context, final int sequence) { //(generated)
	final Alert.Builder alertBuilder = Alert.newBuilder() //(generated)
			                .setCategory(standardizeOptionalCode(rawAlert.getCategory(), context, "category")); //(generated)
	return alertBuilder.build(); //(generated)
} //(generated)
//[[[end]]]
}