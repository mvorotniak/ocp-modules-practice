package ocp.read.materials;

import java.util.List;

public class Section {

    private String title;

    private List<String> codeExamples;

    public Section(String title, List<String> codeExamples) {
        this.title = title;
        this.codeExamples = codeExamples;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getCodeExamples() {
        return codeExamples;
    }

    public void setCodeExamples(List<String> codeExamples) {
        this.codeExamples = codeExamples;
    }
}
