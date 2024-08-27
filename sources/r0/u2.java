package r0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final h0.a f32753a;

    /* renamed from: b, reason: collision with root package name */
    public final h0.a f32754b;

    /* renamed from: c, reason: collision with root package name */
    public final h0.a f32755c;

    /* renamed from: d, reason: collision with root package name */
    public final h0.a f32756d;

    /* renamed from: e, reason: collision with root package name */
    public final h0.a f32757e;

    public u2() {
        h0.g gVar = t2.f32743a;
        h0.g gVar2 = t2.f32744b;
        h0.g gVar3 = t2.f32745c;
        h0.g gVar4 = t2.f32746d;
        h0.g gVar5 = t2.f32747e;
        this.f32753a = gVar;
        this.f32754b = gVar2;
        this.f32755c = gVar3;
        this.f32756d = gVar4;
        this.f32757e = gVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        if (Intrinsics.a(this.f32753a, u2Var.f32753a) && Intrinsics.a(this.f32754b, u2Var.f32754b) && Intrinsics.a(this.f32755c, u2Var.f32755c) && Intrinsics.a(this.f32756d, u2Var.f32756d) && Intrinsics.a(this.f32757e, u2Var.f32757e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32757e.hashCode() + ((this.f32756d.hashCode() + ((this.f32755c.hashCode() + ((this.f32754b.hashCode() + (this.f32753a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f32753a + ", small=" + this.f32754b + ", medium=" + this.f32755c + ", large=" + this.f32756d + ", extraLarge=" + this.f32757e + ')';
    }
}
