package cr.ac.unadeca.todoAlex.database;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by Brian on 2/5/18.
 */

@Database(name = TodoDatabase.NAME, version = TodoDatabase.VERSION)
public class TodoDatabase {
    public static final String NAME = "todobrian";
    public static final int VERSION = 3;
}
