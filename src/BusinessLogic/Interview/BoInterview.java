package BusinessLogic.Interview;

import java.util.List;

public class BoInterview {

    // Objects
    public List<BoInterviewBlock> _InterviewBloecks;
    // Objects

    // Attribute
    private int _ID;
    private String _Name;
    private String _Path;
    private String _Description;
    private int _MemberCount;
    // Attribute


    // Getter/ Setter
    public String get_Path() {
        return _Path;
    }

    private void set_Path(String _Path) {
        this._Path = _Path; // Neues Initialize der Klasse!
    }

    public int get_ID() {
        return _ID;
    }
    public String get_Description() {
        return _Description;
    }
    public String get_Name() {
        return _Name;
    }
    public int get_MemberCount() {
        return _MemberCount;
    }
    // Getter/ Setter



    public BoInterview(String Path)
    {

    }
    private void Initialize()
    {
        // XML-Datei auslesen
    }


    // Print Methods
    public String GetInterviewText()
    {
        return "";
    }
    // Print Methods

}
