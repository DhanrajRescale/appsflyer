package hk;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class s extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f18561b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(xj.g.f40298a);

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f18561b);
    }

    @Override // hk.d
    public final Bitmap c(bk.d dVar, Bitmap bitmap, int i10, int i11) {
        return y.b(dVar, bitmap, i10, i11);
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        return obj instanceof s;
    }

    @Override // xj.g
    public final int hashCode() {
        return 1572326941;
    }
}
