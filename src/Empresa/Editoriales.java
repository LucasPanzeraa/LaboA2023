package src.Empresa;

public enum Editoriales {
    KAPELUSZ ("Kapelusz"), SUDAMERICANA ("Sudamericana"), ATLANTIDA ("Atlántida"), ELATENEO ("ElAteneo"), INTERZONA ("Interzona"), SUR ("Sur"), ALIANZA ("Alianza");

    private String editoriales;

    Editoriales(String editoriales) {
        this.editoriales = editoriales;
    }

    public String getEditoriales() {
        return editoriales;
    }
}