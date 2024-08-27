package dv;

import java.util.HashSet;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f14574a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14575b;

    /* renamed from: i, reason: collision with root package name */
    public final int f14582i;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f14587n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f14588o;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f14576c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f14577d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f14578e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f14579f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f14580g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f14581h = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f14583j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f14584k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    public String f14585l = null;

    /* renamed from: m, reason: collision with root package name */
    public String f14586m = null;

    public r(String str, int i10, int i11, boolean z10, boolean z11) {
        this.f14582i = 3;
        this.f14574a = str;
        this.f14575b = i10;
        this.f14582i = i11;
        this.f14587n = z10;
        this.f14588o = z11;
    }

    public final boolean a(b bVar) {
        int i10 = this.f14575b;
        if (i10 != 2 && (bVar instanceof u) && "script".equals(((u) bVar).c())) {
            return true;
        }
        int e10 = w.k.e(i10);
        if (e10 != 0) {
            if (e10 != 1) {
                if (e10 == 2) {
                    return !(bVar instanceof u);
                }
                return false;
            }
            if (bVar instanceof g) {
                return ((g) bVar).f14534c;
            }
            if (!(bVar instanceof u)) {
                return true;
            }
            return false;
        }
        HashSet hashSet = this.f14578e;
        if (!hashSet.isEmpty()) {
            if (bVar instanceof u) {
                return hashSet.contains(((u) bVar).c());
            }
        } else {
            if (!this.f14579f.isEmpty() && (bVar instanceof u)) {
                return !r0.contains(((u) bVar).c());
            }
        }
        return true;
    }

    public final void b(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.f14578e.add(stringTokenizer.nextToken());
        }
    }

    public final void c(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            this.f14580g.add(nextToken);
            this.f14576c.add(nextToken);
        }
    }

    public final void d(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.f14576c.add(stringTokenizer.nextToken());
        }
    }

    public final void e(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.f14581h.add(stringTokenizer.nextToken());
        }
    }

    public final void f(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            this.f14584k.add(nextToken);
            this.f14577d.add(nextToken);
        }
    }

    public final void g(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.f14579f.add(stringTokenizer.nextToken());
        }
    }

    public final void h(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.f14577d.add(stringTokenizer.nextToken());
        }
    }

    public final void i(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            this.f14583j.add(nextToken);
            this.f14577d.add(nextToken);
        }
    }
}
