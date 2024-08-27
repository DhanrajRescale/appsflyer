package hk;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f18535b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(xj.g.f40298a);

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f18535b);
    }

    @Override // hk.d
    public final Bitmap c(bk.d dVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = y.f18577a;
        if (bitmap.getWidth() <= i10 && bitmap.getHeight() <= i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
                return bitmap;
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return y.b(dVar, bitmap, i10, i11);
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        return obj instanceof g;
    }

    @Override // xj.g
    public final int hashCode() {
        return -670243078;
    }
}
