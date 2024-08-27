package m0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e6 {

    /* renamed from: a, reason: collision with root package name */
    public final h0.a f26103a;

    /* renamed from: b, reason: collision with root package name */
    public final h0.a f26104b;

    /* renamed from: c, reason: collision with root package name */
    public final h0.a f26105c;

    public e6() {
        h0.g b10 = h0.h.b(4);
        h0.g b11 = h0.h.b(4);
        h0.g b12 = h0.h.b(0);
        this.f26103a = b10;
        this.f26104b = b11;
        this.f26105c = b12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        if (Intrinsics.a(this.f26103a, e6Var.f26103a) && Intrinsics.a(this.f26104b, e6Var.f26104b) && Intrinsics.a(this.f26105c, e6Var.f26105c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26105c.hashCode() + ((this.f26104b.hashCode() + (this.f26103a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f26103a + ", medium=" + this.f26104b + ", large=" + this.f26105c + ')';
    }
}
