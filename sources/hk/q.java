package hk;

import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class q implements xj.o {

    /* renamed from: b, reason: collision with root package name */
    public final xj.o f18559b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18560c;

    public q(xj.o oVar, boolean z10) {
        this.f18559b = oVar;
        this.f18560c = z10;
    }

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        this.f18559b.a(messageDigest);
    }

    @Override // xj.o
    public final ak.e0 b(com.bumptech.glide.d dVar, ak.e0 e0Var, int i10, int i11) {
        bk.d dVar2 = com.bumptech.glide.b.b(dVar).f10778a;
        Drawable drawable = (Drawable) e0Var.get();
        c a10 = p.a(dVar2, drawable, i10, i11);
        if (a10 == null) {
            if (!this.f18560c) {
                return e0Var;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        ak.e0 b10 = this.f18559b.b(dVar, a10, i10, i11);
        if (b10.equals(a10)) {
            b10.b();
            return e0Var;
        }
        return new c(dVar.getResources(), b10);
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f18559b.equals(((q) obj).f18559b);
        }
        return false;
    }

    @Override // xj.g
    public final int hashCode() {
        return this.f18559b.hashCode();
    }
}
