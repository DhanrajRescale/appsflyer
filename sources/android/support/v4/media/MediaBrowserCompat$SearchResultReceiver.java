package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import b.e;
import java.util.ArrayList;
import qu.i0;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends e {
    @Override // b.e
    public final void a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = i0.O(bundle);
        }
        if (i10 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("search_results")) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                    parcelableArray.getClass();
                    ArrayList arrayList = new ArrayList(parcelableArray.length);
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
