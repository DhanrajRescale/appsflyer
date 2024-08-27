package hk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f18536b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(xj.g.f40298a);

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f18536b);
    }

    @Override // hk.d
    public final Bitmap c(bk.d dVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = y.f18577a;
        int min = Math.min(i10, i11);
        float f10 = min;
        float f11 = f10 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f10 / width, f10 / height);
        float f12 = width * max;
        float f13 = max * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap c10 = y.c(bitmap, dVar);
        Bitmap d10 = dVar.d(min, min, y.d(bitmap));
        d10.setHasAlpha(true);
        Lock lock = y.f18580d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d10);
            canvas.drawCircle(f11, f11, f11, y.f18578b);
            canvas.drawBitmap(c10, (Rect) null, rectF, y.f18579c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!c10.equals(bitmap)) {
                dVar.b(c10);
            }
            return d10;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // xj.g
    public final int hashCode() {
        return 1101716364;
    }
}
