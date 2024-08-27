package os;

import android.util.LruCache;

/* loaded from: classes2.dex */
public final class v extends LruCache {
    @Override // android.util.LruCache
    public final Object create(Object obj) {
        return ((Class) obj).getCanonicalName();
    }
}
