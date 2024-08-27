package z5;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final z f42138a;

    /* renamed from: b, reason: collision with root package name */
    public final z f42139b;

    public x(z zVar, z zVar2) {
        this.f42138a = zVar;
        this.f42139b = zVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f42138a.equals(xVar.f42138a) && this.f42139b.equals(xVar.f42139b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f42139b.hashCode() + (this.f42138a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        z zVar = this.f42138a;
        sb2.append(zVar);
        z zVar2 = this.f42139b;
        if (zVar.equals(zVar2)) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = ", " + zVar2;
        }
        return nn.d.o(sb2, str, "]");
    }
}
