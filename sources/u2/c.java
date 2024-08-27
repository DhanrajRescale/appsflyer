package u2;

import n1.t;
import ut.t;

/* loaded from: classes.dex */
public final class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public final long f36670a;

    public c(long j10) {
        this.f36670a = j10;
        if (j10 != 16) {
        } else {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    @Override // u2.n
    public final long a() {
        return this.f36670a;
    }

    @Override // u2.n
    public final n1.p b() {
        return null;
    }

    @Override // u2.n
    public final float c() {
        return t.e(this.f36670a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && t.d(this.f36670a, ((c) obj).f36670a);
    }

    public final int hashCode() {
        int i10 = t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return Long.hashCode(this.f36670a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) n1.t.j(this.f36670a)) + ')';
    }
}
