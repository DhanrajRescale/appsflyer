package androidx.loader.app;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface a {
    androidx.loader.content.e onCreateLoader(int i10, Bundle bundle);

    void onLoadFinished(androidx.loader.content.e eVar, Object obj);

    void onLoaderReset(androidx.loader.content.e eVar);
}
