package Interview;

import java.util.List;

public class Interview {

    // Instance Vars
    private String _Path;
    private int _ID;
    private String _Description;
    private String _Name;
    // Instance Vars

    // Getter/ Setter
    public String get_Path() {
        return _Path;
    }

    private void set_Path(String _Path) {
        this._Path = _Path;
        // Neues Initialize der Klasse!
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
    // Getter/ Setter

    // Functions
    public  Interview(String Path)
    {

    }

    private void Initialize()
    {
        // XML-Datei auslesen
    }


    public void print()
    {

    }
    // Functions



    // Static Functions
    public static List<Interview> GetAllInterviews()
    {
    return null;
    }

    public static Interview FincInterview(int ID, List<Interview> AlleInterviews)
    {
        return new Interview("");
    }
    public static Interview FincInterview(String Name, List<Interview> AlleInterviews)
    {
        return new Interview("");
    }
    // Static Functions

}
