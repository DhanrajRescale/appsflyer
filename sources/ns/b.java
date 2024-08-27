package ns;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes2.dex */
public final class b extends LruCache {
    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        return (bitmap.getHeight() * bitmap.getRowBytes()) / UserMetadata.MAX_ATTRIBUTE_SIZE;
    }
}
