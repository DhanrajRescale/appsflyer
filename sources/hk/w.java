package hk;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class w extends d {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f18575c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(xj.g.f40298a);

    /* renamed from: b, reason: collision with root package name */
    public final int f18576b;

    public w(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        al.d.T("roundingRadius must be greater than 0.", z10);
        this.f18576b = i10;
    }

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f18575c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f18576b).array());
    }

    @Override // hk.d
    public final Bitmap c(bk.d dVar, Bitmap bitmap, int i10, int i11) {
        boolean z10;
        Paint paint = y.f18577a;
        int i12 = this.f18576b;
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        al.d.T("roundingRadius must be greater than 0.", z10);
        androidx.work.u uVar = new androidx.work.u(i12);
        Bitmap.Config d10 = y.d(bitmap);
        Bitmap c10 = y.c(bitmap, dVar);
        Bitmap d11 = dVar.d(c10.getWidth(), c10.getHeight(), d10);
        d11.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(c10, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(s0.g.f34069a, s0.g.f34069a, d11.getWidth(), d11.getHeight());
        Lock lock = y.f18580d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d11);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f10 = uVar.f2637a;
            canvas.drawRoundRect(rectF, f10, f10, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!c10.equals(bitmap)) {
                dVar.b(c10);
            }
            return d11;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        if (!(obj instanceof w) || this.f18576b != ((w) obj).f18576b) {
            return false;
        }
        return true;
    }

    @Override // xj.g
    public final int hashCode() {
        return rk.k.e(-569625254, rk.k.e(this.f18576b, 17));
    }
}
