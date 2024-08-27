package g5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface f extends b5.o {
    void close();

    default Map h() {
        return Collections.emptyMap();
    }

    Uri l();

    void m(u uVar);

    long o(i iVar);
}
