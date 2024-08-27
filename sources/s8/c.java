package s8;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import p8.p;
import p8.r;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34319a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.m f34320b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34321c;

    public /* synthetic */ c(Object obj, y8.m mVar, int i10) {
        this.f34319a = i10;
        this.f34321c = obj;
        this.f34320b = mVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, bv.l, bv.j] */
    @Override // s8.g
    public final Object a(yt.a aVar) {
        boolean z10 = true;
        int i10 = this.f34319a;
        y8.m mVar = this.f34320b;
        Object obj = this.f34321c;
        switch (i10) {
            case 0:
                return new d(new BitmapDrawable(mVar.f41389a.getResources(), (Bitmap) obj), false, p8.f.f30739b);
            case 1:
                try {
                    ?? obj2 = new Object();
                    obj2.write((ByteBuffer) obj);
                    ((ByteBuffer) obj).position(0);
                    return new n(new r(obj2, new p(mVar.f41389a, 1), null), null, p8.f.f30739b);
                } catch (Throwable th2) {
                    ((ByteBuffer) obj).position(0);
                    throw th2;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = d9.e.f14221a;
                if (!(drawable instanceof VectorDrawable) && !(drawable instanceof u7.p)) {
                    z10 = false;
                }
                if (z10) {
                    drawable = new BitmapDrawable(mVar.f41389a.getResources(), kp.j.H(drawable, mVar.f41390b, mVar.f41392d, mVar.f41393e, mVar.f41394f));
                }
                return new d(drawable, z10, p8.f.f30739b);
        }
    }
}
