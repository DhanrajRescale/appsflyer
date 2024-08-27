package iu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class u extends c implements ou.g {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20555g;

    public u() {
        this.f20555g = false;
    }

    public final ou.a e() {
        if (this.f20555g) {
            return this;
        }
        ou.a aVar = this.f20538a;
        if (aVar == null) {
            ou.a a10 = a();
            this.f20538a = a10;
            return a10;
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (d().equals(uVar.d()) && this.f20541d.equals(uVar.f20541d) && this.f20542e.equals(uVar.f20542e) && Intrinsics.a(this.f20539b, uVar.f20539b)) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof ou.g)) {
            return false;
        }
        return obj.equals(e());
    }

    public final int hashCode() {
        return this.f20542e.hashCode() + jr.h.g(this.f20541d, d().hashCode() * 31, 31);
    }

    public final String toString() {
        ou.a e10 = e();
        if (e10 != this) {
            return e10.toString();
        }
        return nn.d.o(new StringBuilder("property "), this.f20541d, " (Kotlin reflection is not available)");
    }

    public u(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f20555g = (i10 & 2) == 2;
    }
}
