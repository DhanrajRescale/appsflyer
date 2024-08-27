package iu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class h extends c implements g, ou.c {

    /* renamed from: g, reason: collision with root package name */
    public final int f20550g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20551h;

    public h(int i10, Class cls, String str, String str2, int i11) {
        super(b.f20537a, cls, str, str2, (i11 & 1) == 1);
        this.f20550g = i10;
        this.f20551h = i11 >> 1;
    }

    @Override // iu.c
    public final ou.a a() {
        a0.f20536a.getClass();
        return this;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f20541d.equals(hVar.f20541d) && this.f20542e.equals(hVar.f20542e) && this.f20551h == hVar.f20551h && this.f20550g == hVar.f20550g && Intrinsics.a(this.f20539b, hVar.f20539b) && Intrinsics.a(d(), hVar.d())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof ou.c)) {
            return false;
        }
        ou.a aVar = this.f20538a;
        if (aVar == null) {
            a();
            this.f20538a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int hashCode;
        if (d() == null) {
            hashCode = 0;
        } else {
            hashCode = d().hashCode() * 31;
        }
        return this.f20542e.hashCode() + jr.h.g(this.f20541d, hashCode, 31);
    }

    @Override // iu.g
    public final int getArity() {
        return this.f20550g;
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        ou.a aVar = this.f20538a;
        if (aVar == null) {
            a();
            this.f20538a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f20541d;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return nn.d.k("function ", str, " (Kotlin reflection is not available)");
    }

    public h(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f20550g = i10;
        this.f20551h = i11 >> 1;
    }
}
