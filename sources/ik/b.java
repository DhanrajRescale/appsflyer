package ik;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bk.h;
import da.d;
import jk.e;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Drawable drawable, int i10) {
        super(drawable);
        this.f20089b = i10;
    }

    @Override // ak.b0
    public final void a() {
        int i10 = this.f20089b;
        Drawable drawable = this.f20088a;
        switch (i10) {
            case 1:
                ((jk.c) drawable).f21422a.f21421a.f21450l.prepareToDraw();
                return;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    return;
                } else {
                    if (drawable instanceof jk.c) {
                        ((jk.c) drawable).f21422a.f21421a.f21450l.prepareToDraw();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // ak.e0
    public final void b() {
        h hVar;
        h hVar2;
        h hVar3;
        switch (this.f20089b) {
            case 0:
                return;
            default:
                jk.c cVar = (jk.c) this.f20088a;
                cVar.stop();
                cVar.f21425d = true;
                jk.h hVar4 = cVar.f21422a.f21421a;
                hVar4.f21441c.clear();
                Bitmap bitmap = hVar4.f21450l;
                if (bitmap != null) {
                    hVar4.f21443e.b(bitmap);
                    hVar4.f21450l = null;
                }
                hVar4.f21444f = false;
                e eVar = hVar4.f21447i;
                com.bumptech.glide.h hVar5 = hVar4.f21442d;
                if (eVar != null) {
                    hVar5.k(eVar);
                    hVar4.f21447i = null;
                }
                e eVar2 = hVar4.f21449k;
                if (eVar2 != null) {
                    hVar5.k(eVar2);
                    hVar4.f21449k = null;
                }
                e eVar3 = hVar4.f21451m;
                if (eVar3 != null) {
                    hVar5.k(eVar3);
                    hVar4.f21451m = null;
                }
                wj.e eVar4 = (wj.e) hVar4.f21439a;
                eVar4.f39134l = null;
                byte[] bArr = eVar4.f39131i;
                d dVar = eVar4.f39125c;
                if (bArr != null && (hVar3 = (h) dVar.f14277c) != null) {
                    hVar3.g(bArr);
                }
                int[] iArr = eVar4.f39132j;
                if (iArr != null && (hVar2 = (h) dVar.f14277c) != null) {
                    hVar2.g(iArr);
                }
                Bitmap bitmap2 = eVar4.f39135m;
                if (bitmap2 != null) {
                    ((bk.d) dVar.f14276b).b(bitmap2);
                }
                eVar4.f39135m = null;
                eVar4.f39126d = null;
                eVar4.f39141s = null;
                byte[] bArr2 = eVar4.f39127e;
                if (bArr2 != null && (hVar = (h) dVar.f14277c) != null) {
                    hVar.g(bArr2);
                }
                hVar4.f21448j = true;
                return;
        }
    }

    @Override // ak.e0
    public final int c() {
        int i10 = this.f20089b;
        Drawable drawable = this.f20088a;
        switch (i10) {
            case 0:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                jk.h hVar = ((jk.c) drawable).f21422a.f21421a;
                wj.e eVar = (wj.e) hVar.f21439a;
                return (eVar.f39132j.length * 4) + eVar.f39126d.limit() + eVar.f39131i.length + hVar.f21452n;
        }
    }

    @Override // ak.e0
    public final Class d() {
        switch (this.f20089b) {
            case 0:
                return this.f20088a.getClass();
            default:
                return jk.c.class;
        }
    }
}
