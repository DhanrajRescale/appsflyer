package jk;

import ak.e0;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import xj.o;

/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: b, reason: collision with root package name */
    public final o f21432b;

    public d(o oVar) {
        if (oVar != null) {
            this.f21432b = oVar;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        this.f21432b.a(messageDigest);
    }

    @Override // xj.o
    public final e0 b(com.bumptech.glide.d dVar, e0 e0Var, int i10, int i11) {
        c cVar = (c) e0Var.get();
        e0 cVar2 = new hk.c(cVar.f21422a.f21421a.f21450l, com.bumptech.glide.b.b(dVar).f10778a);
        o oVar = this.f21432b;
        e0 b10 = oVar.b(dVar, cVar2, i10, i11);
        if (!cVar2.equals(b10)) {
            cVar2.b();
        }
        cVar.f21422a.f21421a.c(oVar, (Bitmap) b10.get());
        return e0Var;
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f21432b.equals(((d) obj).f21432b);
        }
        return false;
    }

    @Override // xj.g
    public final int hashCode() {
        return this.f21432b.hashCode();
    }
}
