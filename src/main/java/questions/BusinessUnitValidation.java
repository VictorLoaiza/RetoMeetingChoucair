package questions;

import models.BusinessValidation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.BusinessValidationUnit;

import java.util.List;

public class BusinessUnitValidation implements Question<Boolean> {

    private List<BusinessValidation> businessValidation;

    public BusinessUnitValidation(List<BusinessValidation> businessValidation){this.businessValidation = businessValidation;}

    public static BusinessUnitValidation theResult(List<BusinessValidation> businessValidation){
        return new BusinessUnitValidation(businessValidation);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean Validation;

        String confirmationBusinessUnit = Text.of(BusinessValidationUnit.BUSINESS_VALIDATION).viewedBy(actor).asString();

        if (businessValidation.get(0).getValidateBusiness().equals(confirmationBusinessUnit)){
            Validation = true;
        }else {
            Validation = false;
        }

        return Validation;
    }
}
