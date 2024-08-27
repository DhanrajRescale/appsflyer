package bk;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c f7043a;

    /* renamed from: b, reason: collision with root package name */
    public int f7044b;

    /* renamed from: c, reason: collision with root package name */
    public Class f7045c;

    public g(c cVar) {
        this.f7043a = cVar;
    }

    @Override // bk.k
    public final void a() {
        this.f7043a.g(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f7044b != gVar.f7044b || this.f7045c != gVar.f7045c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f7044b * 31;
        Class cls = this.f7045c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final String toString() {
        return "Key{size=" + this.f7044b + "array=" + this.f7045c + UrlTreeKt.componentParamSuffixChar;
    }
}
