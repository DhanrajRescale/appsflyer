package bk;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c f7063a;

    /* renamed from: b, reason: collision with root package name */
    public int f7064b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f7065c;

    public m(c cVar) {
        this.f7063a = cVar;
    }

    @Override // bk.k
    public final void a() {
        this.f7063a.g(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f7064b != mVar.f7064b || !rk.k.a(this.f7065c, mVar.f7065c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f7064b * 31;
        Bitmap.Config config = this.f7065c;
        if (config != null) {
            i10 = config.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final String toString() {
        return n.e(this.f7064b, this.f7065c);
    }
}
