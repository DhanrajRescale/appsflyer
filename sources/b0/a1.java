package b0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a1 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final x1 f2819a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2820b = e.f2856g;

    public a1(c cVar) {
        this.f2819a = cVar;
    }

    @Override // b0.x1
    public final int a(w2.b bVar, w2.k kVar) {
        int i10;
        if (kVar == w2.k.f38799a) {
            i10 = 8;
        } else {
            i10 = 2;
        }
        if ((i10 & this.f2820b) != 0) {
            return this.f2819a.a(bVar, kVar);
        }
        return 0;
    }

    @Override // b0.x1
    public final int b(w2.b bVar) {
        if ((this.f2820b & 32) != 0) {
            return this.f2819a.b(bVar);
        }
        return 0;
    }

    @Override // b0.x1
    public final int c(w2.b bVar, w2.k kVar) {
        int i10;
        if (kVar == w2.k.f38799a) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        if ((i10 & this.f2820b) != 0) {
            return this.f2819a.c(bVar, kVar);
        }
        return 0;
    }

    @Override // b0.x1
    public final int d(w2.b bVar) {
        if ((this.f2820b & 16) != 0) {
            return this.f2819a.d(bVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (Intrinsics.a(this.f2819a, a1Var.f2819a)) {
            if (this.f2820b == a1Var.f2820b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2820b) + (this.f2819a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f2819a);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i10 = this.f2820b;
        int i11 = e.f2852c;
        if ((i10 & i11) == i11) {
            e.b(sb4, "Start");
        }
        int i12 = e.f2854e;
        if ((i10 & i12) == i12) {
            e.b(sb4, "Left");
        }
        if ((i10 & 16) == 16) {
            e.b(sb4, "Top");
        }
        int i13 = e.f2853d;
        if ((i10 & i13) == i13) {
            e.b(sb4, "End");
        }
        int i14 = e.f2855f;
        if ((i10 & i14) == i14) {
            e.b(sb4, "Right");
        }
        if ((i10 & 32) == 32) {
            e.b(sb4, "Bottom");
        }
        String sb5 = sb4.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
        sb3.append(sb5);
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
