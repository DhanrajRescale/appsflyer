package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import b.e;
import qu.i0;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends e {
    @Override // b.e
    public final void a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = i0.O(bundle);
        }
        if (i10 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("media_item")) {
                    Parcelable parcelable = bundle.getParcelable("media_item");
                    if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
                        throw null;
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
