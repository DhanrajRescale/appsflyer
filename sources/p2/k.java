package p2;

import d2.w0;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final w f30582a;

    /* renamed from: b, reason: collision with root package name */
    public int f30583b;

    /* renamed from: c, reason: collision with root package name */
    public int f30584c;

    /* renamed from: d, reason: collision with root package name */
    public int f30585d;

    /* renamed from: e, reason: collision with root package name */
    public int f30586e;

    /* JADX WARN: Type inference failed for: r0v0, types: [p2.w, java.lang.Object] */
    public k(j2.e eVar, long j10) {
        String str = eVar.f20699a;
        ?? obj = new Object();
        obj.f30607a = str;
        obj.f30609c = -1;
        obj.f30610d = -1;
        this.f30582a = obj;
        this.f30583b = j2.f0.e(j10);
        this.f30584c = j2.f0.d(j10);
        this.f30585d = -1;
        this.f30586e = -1;
        int e10 = j2.f0.e(j10);
        int d10 = j2.f0.d(j10);
        String str2 = eVar.f20699a;
        if (e10 >= 0 && e10 <= str2.length()) {
            if (d10 >= 0 && d10 <= str2.length()) {
                if (e10 <= d10) {
                    return;
                } else {
                    throw new IllegalArgumentException(da.e.m("Do not set reversed range: ", e10, " > ", d10));
                }
            } else {
                StringBuilder n10 = a3.a.n("end (", d10, ") offset is outside of text region ");
                n10.append(str2.length());
                throw new IndexOutOfBoundsException(n10.toString());
            }
        }
        StringBuilder n11 = a3.a.n("start (", e10, ") offset is outside of text region ");
        n11.append(str2.length());
        throw new IndexOutOfBoundsException(n11.toString());
    }

    public final void a(int i10, int i11) {
        long b10 = w0.b(i10, i11);
        this.f30582a.b(i10, i11, HttpUrl.FRAGMENT_ENCODE_SET);
        long z10 = w0.z(w0.b(this.f30583b, this.f30584c), b10);
        h(j2.f0.e(z10));
        g(j2.f0.d(z10));
        int i12 = this.f30585d;
        if (i12 != -1) {
            long z11 = w0.z(w0.b(i12, this.f30586e), b10);
            if (j2.f0.b(z11)) {
                this.f30585d = -1;
                this.f30586e = -1;
            } else {
                this.f30585d = j2.f0.e(z11);
                this.f30586e = j2.f0.d(z11);
            }
        }
    }

    public final char b(int i10) {
        w wVar = this.f30582a;
        m mVar = wVar.f30608b;
        if (mVar == null) {
            return wVar.f30607a.charAt(i10);
        }
        if (i10 < wVar.f30609c) {
            return wVar.f30607a.charAt(i10);
        }
        int c10 = mVar.f30589b - mVar.c();
        int i11 = wVar.f30609c;
        if (i10 < c10 + i11) {
            int i12 = i10 - i11;
            int i13 = mVar.f30590c;
            if (i12 < i13) {
                return ((char[]) mVar.f30592e)[i12];
            }
            return ((char[]) mVar.f30592e)[(i12 - i13) + mVar.f30591d];
        }
        return wVar.f30607a.charAt(i10 - ((c10 - wVar.f30610d) + i11));
    }

    public final j2.f0 c() {
        int i10 = this.f30585d;
        if (i10 != -1) {
            return new j2.f0(w0.b(i10, this.f30586e));
        }
        return null;
    }

    public final void d(int i10, int i11, String str) {
        w wVar = this.f30582a;
        if (i10 >= 0 && i10 <= wVar.a()) {
            if (i11 >= 0 && i11 <= wVar.a()) {
                if (i10 <= i11) {
                    wVar.b(i10, i11, str);
                    h(str.length() + i10);
                    g(str.length() + i10);
                    this.f30585d = -1;
                    this.f30586e = -1;
                    return;
                }
                throw new IllegalArgumentException(da.e.m("Do not set reversed range: ", i10, " > ", i11));
            }
            StringBuilder n10 = a3.a.n("end (", i11, ") offset is outside of text region ");
            n10.append(wVar.a());
            throw new IndexOutOfBoundsException(n10.toString());
        }
        StringBuilder n11 = a3.a.n("start (", i10, ") offset is outside of text region ");
        n11.append(wVar.a());
        throw new IndexOutOfBoundsException(n11.toString());
    }

    public final void e(int i10, int i11) {
        w wVar = this.f30582a;
        if (i10 >= 0 && i10 <= wVar.a()) {
            if (i11 >= 0 && i11 <= wVar.a()) {
                if (i10 < i11) {
                    this.f30585d = i10;
                    this.f30586e = i11;
                    return;
                }
                throw new IllegalArgumentException(da.e.m("Do not set reversed or empty range: ", i10, " > ", i11));
            }
            StringBuilder n10 = a3.a.n("end (", i11, ") offset is outside of text region ");
            n10.append(wVar.a());
            throw new IndexOutOfBoundsException(n10.toString());
        }
        StringBuilder n11 = a3.a.n("start (", i10, ") offset is outside of text region ");
        n11.append(wVar.a());
        throw new IndexOutOfBoundsException(n11.toString());
    }

    public final void f(int i10, int i11) {
        w wVar = this.f30582a;
        if (i10 >= 0 && i10 <= wVar.a()) {
            if (i11 >= 0 && i11 <= wVar.a()) {
                if (i10 <= i11) {
                    h(i10);
                    g(i11);
                    return;
                }
                throw new IllegalArgumentException(da.e.m("Do not set reversed range: ", i10, " > ", i11));
            }
            StringBuilder n10 = a3.a.n("end (", i11, ") offset is outside of text region ");
            n10.append(wVar.a());
            throw new IndexOutOfBoundsException(n10.toString());
        }
        StringBuilder n11 = a3.a.n("start (", i10, ") offset is outside of text region ");
        n11.append(wVar.a());
        throw new IndexOutOfBoundsException(n11.toString());
    }

    public final void g(int i10) {
        if (i10 >= 0) {
            this.f30584c = i10;
            return;
        }
        throw new IllegalArgumentException(jr.h.n("Cannot set selectionEnd to a negative value: ", i10).toString());
    }

    public final void h(int i10) {
        if (i10 >= 0) {
            this.f30583b = i10;
            return;
        }
        throw new IllegalArgumentException(jr.h.n("Cannot set selectionStart to a negative value: ", i10).toString());
    }

    public final String toString() {
        return this.f30582a.toString();
    }
}
