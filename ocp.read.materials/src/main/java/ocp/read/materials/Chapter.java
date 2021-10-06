package ocp.read.materials;

import java.util.List;

public class Chapter {

    private String name;

    private List<Section> sections;

    public Chapter(String name, List<Section> sections) {
        this.name = name;
        this.sections = sections;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
}
