package bk;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c f7033a;

    /* renamed from: b, reason: collision with root package name */
    public int f7034b;

    /* renamed from: c, reason: collision with root package name */
    public int f7035c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap.Config f7036d;

    public b(c cVar) {
        this.f7033a = cVar;
    }

    @Override // bk.k
    public final void a() {
        this.f7033a.g(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f7034b != bVar.f7034b || this.f7035c != bVar.f7035c || this.f7036d != bVar.f7036d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11 = ((this.f7034b * 31) + this.f7035c) * 31;
        Bitmap.Config config = this.f7036d;
        if (config != null) {
            i10 = config.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final String toString() {
        return da.d.p(this.f7034b, this.f7035c, this.f7036d);
    }
}
