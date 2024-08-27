package i5;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f19481a;

    /* renamed from: b, reason: collision with root package name */
    public final b5.v f19482b;

    /* renamed from: c, reason: collision with root package name */
    public final b5.v f19483c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19484d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19485e;

    public h(String str, b5.v vVar, b5.v vVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        yk.j.E0(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f19481a = str;
            vVar.getClass();
            this.f19482b = vVar;
            vVar2.getClass();
            this.f19483c = vVar2;
            this.f19484d = i10;
            this.f19485e = i11;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f19484d == hVar.f19484d && this.f19485e == hVar.f19485e && this.f19481a.equals(hVar.f19481a) && this.f19482b.equals(hVar.f19482b) && this.f19483c.equals(hVar.f19483c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19483c.hashCode() + ((this.f19482b.hashCode() + jr.h.g(this.f19481a, (((527 + this.f19484d) * 31) + this.f19485e) * 31, 31)) * 31);
    }
}
