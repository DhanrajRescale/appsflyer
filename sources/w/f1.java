package w;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f1 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f38486a;

    /* renamed from: b, reason: collision with root package name */
    public final float f38487b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f38488c;

    public f1(float f10, float f11, Object obj) {
        this.f38486a = f10;
        this.f38487b = f11;
        this.f38488c = obj;
    }

    @Override // w.n
    public final a2 a(y1 y1Var) {
        t tVar;
        Object obj = this.f38488c;
        if (obj == null) {
            tVar = null;
        } else {
            tVar = (t) y1Var.f38734a.invoke(obj);
        }
        return new j2(this.f38486a, this.f38487b, tVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (f1Var.f38486a != this.f38486a || f1Var.f38487b != this.f38487b || !Intrinsics.a(f1Var.f38488c, this.f38488c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        Object obj = this.f38488c;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return Float.hashCode(this.f38487b) + v.e.a(this.f38486a, i10 * 31, 31);
    }

    public /* synthetic */ f1(Object obj, int i10) {
        this((i10 & 1) != 0 ? 1.0f : 0.0f, (i10 & 2) != 0 ? 1500.0f : s0.g.f34069a, (i10 & 4) != 0 ? null : obj);
    }
}
