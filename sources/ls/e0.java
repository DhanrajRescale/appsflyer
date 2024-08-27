package ls;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
public final class e0 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith("com.mixpanel.android.mpmetrics.MixpanelAPI_");
    }
}
