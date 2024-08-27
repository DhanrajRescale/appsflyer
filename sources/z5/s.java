package z5;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public interface s {
    p[] a();

    default p[] d(Uri uri, Map map) {
        return a();
    }
}
