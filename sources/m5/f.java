package m5;

import e5.x;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f27540a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27541b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27542c;

    public f(String str, String str2, String str3) {
        this.f27540a = str;
        this.f27541b = str2;
        this.f27542c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (x.a(this.f27540a, fVar.f27540a) && x.a(this.f27541b, fVar.f27541b) && x.a(this.f27542c, fVar.f27542c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f27540a.hashCode() * 31;
        int i11 = 0;
        String str = this.f27541b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f27542c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
