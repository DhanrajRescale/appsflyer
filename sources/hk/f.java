package hk;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f18534b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(xj.g.f40298a);

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f18534b);
    }

    @Override // hk.d
    public final Bitmap c(bk.d dVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = y.f18577a;
        if (bitmap.getWidth() != i10 || bitmap.getHeight() != i11) {
            Matrix matrix = new Matrix();
            int width2 = bitmap.getWidth() * i11;
            int height2 = bitmap.getHeight() * i10;
            float f10 = s0.g.f34069a;
            if (width2 > height2) {
                width = i11 / bitmap.getHeight();
                f10 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i10 / bitmap.getWidth();
                height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f10 + 0.5f), (int) (height + 0.5f));
            if (bitmap.getConfig() != null) {
                config = bitmap.getConfig();
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap d10 = dVar.d(i10, i11, config);
            d10.setHasAlpha(bitmap.hasAlpha());
            y.a(bitmap, d10, matrix);
            return d10;
        }
        return bitmap;
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        return obj instanceof f;
    }

    @Override // xj.g
    public final int hashCode() {
        return -599754482;
    }
}
