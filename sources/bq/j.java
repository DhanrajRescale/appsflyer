package bq;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final p f7260a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7261b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7262c;

    public j(int i10, int i11, Class cls) {
        this(p.a(cls), i10, i11);
    }

    public static j b(Class cls) {
        return new j(0, 1, cls);
    }

    public static j c(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean a() {
        return this.f7261b == 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.f7260a.equals(jVar.f7260a) || this.f7261b != jVar.f7261b || this.f7262c != jVar.f7262c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f7260a.hashCode() ^ 1000003) * 1000003) ^ this.f7261b) * 1000003) ^ this.f7262c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f7260a);
        sb2.append(", type=");
        int i10 = this.f7261b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f7262c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(jr.h.n("Unsupported injection: ", i11));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return nn.d.o(sb2, str2, UrlTreeKt.componentParamSuffix);
    }

    public j(p pVar, int i10, int i11) {
        this.f7260a = pVar;
        this.f7261b = i10;
        this.f7262c = i11;
    }
}
