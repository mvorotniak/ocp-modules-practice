package ocp.certification.preparation;

import java.util.Map;

import ocp.read.materials.Chapter;
import ocp.review.questions.Review;

public class Preparation {

    private Map<Chapter, Review> preparationMaterials;

    public Preparation(Map<Chapter, Review> preparationMaterials) {
        this.preparationMaterials = preparationMaterials;
    }

    public Map<Chapter, Review> getPreparationMaterials() {
        return preparationMaterials;
    }

    public void setPreparationMaterials(Map<Chapter, Review> preparationMaterials) {
        this.preparationMaterials = preparationMaterials;
    }
}
