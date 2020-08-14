package first_bad_version;

import java.util.List;

public class VersionControl {
    boolean[] badVersions = {false, false, false, false, true, true};
    boolean isBadVersion(int i) {
        return badVersions[i];
    }

}
