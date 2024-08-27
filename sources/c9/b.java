package c9;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import o8.o;
import y8.k;
import y8.p;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final o f8064a;

    /* renamed from: b, reason: collision with root package name */
    public final k f8065b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8066c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8067d;

    public b(o oVar, k kVar, int i10, boolean z10) {
        this.f8064a = oVar;
        this.f8065b = kVar;
        this.f8066c = i10;
        this.f8067d = z10;
        if (i10 > 0) {
        } else {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    @Override // c9.f
    public final void a() {
        boolean z10;
        this.f8064a.getClass();
        k kVar = this.f8065b;
        Drawable a10 = kVar.a();
        z8.f fVar = kVar.b().C;
        int i10 = this.f8066c;
        boolean z11 = kVar instanceof p;
        if (z11 && ((p) kVar).f41412g) {
            z10 = false;
        } else {
            z10 = true;
        }
        new r8.a(a10, fVar, i10, z10, this.f8067d);
        if (z11 || (kVar instanceof y8.e)) {
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
