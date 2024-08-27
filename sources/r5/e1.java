package r5;

import b5.j1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e1 implements b5.k {

    /* renamed from: d, reason: collision with root package name */
    public static final e1 f33145d = new e1(new j1[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final String f33146e;

    /* renamed from: a, reason: collision with root package name */
    public final int f33147a;

    /* renamed from: b, reason: collision with root package name */
    public final lp.j1 f33148b;

    /* renamed from: c, reason: collision with root package name */
    public int f33149c;

    static {
        int i10 = e5.x.f15050a;
        f33146e = Integer.toString(0, 36);
    }

    public e1(j1... j1VarArr) {
        this.f33148b = lp.o0.r(j1VarArr);
        this.f33147a = j1VarArr.length;
        int i10 = 0;
        while (true) {
            lp.j1 j1Var = this.f33148b;
            if (i10 < j1Var.size()) {
                int i11 = i10 + 1;
                for (int i12 = i11; i12 < j1Var.size(); i12++) {
                    if (((j1) j1Var.get(i10)).equals(j1Var.get(i12))) {
                        e5.m.d("TrackGroupArray", HttpUrl.FRAGMENT_ENCODE_SET, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i10 = i11;
            } else {
                return;
            }
        }
    }

    public final j1 a(int i10) {
        return (j1) this.f33148b.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e1.class != obj.getClass()) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (this.f33147a == e1Var.f33147a && this.f33148b.equals(e1Var.f33148b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f33149c == 0) {
            this.f33149c = this.f33148b.hashCode();
        }
        return this.f33149c;
    }
}
