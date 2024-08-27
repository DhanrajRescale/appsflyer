package s9;

import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f34377a;

    /* renamed from: b, reason: collision with root package name */
    public final j9.i f34378b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34379c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34380d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34381e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34382f;

    /* renamed from: g, reason: collision with root package name */
    public final String f34383g;

    /* renamed from: h, reason: collision with root package name */
    public final List f34384h;

    /* renamed from: i, reason: collision with root package name */
    public final q9.d f34385i;

    /* renamed from: j, reason: collision with root package name */
    public final int f34386j;

    /* renamed from: k, reason: collision with root package name */
    public final int f34387k;

    /* renamed from: l, reason: collision with root package name */
    public final int f34388l;

    /* renamed from: m, reason: collision with root package name */
    public final float f34389m;

    /* renamed from: n, reason: collision with root package name */
    public final float f34390n;

    /* renamed from: o, reason: collision with root package name */
    public final float f34391o;

    /* renamed from: p, reason: collision with root package name */
    public final float f34392p;

    /* renamed from: q, reason: collision with root package name */
    public final bk.c f34393q;

    /* renamed from: r, reason: collision with root package name */
    public final h8.h f34394r;

    /* renamed from: s, reason: collision with root package name */
    public final q9.a f34395s;

    /* renamed from: t, reason: collision with root package name */
    public final List f34396t;

    /* renamed from: u, reason: collision with root package name */
    public final int f34397u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f34398v;

    /* renamed from: w, reason: collision with root package name */
    public final hr.c f34399w;

    /* renamed from: x, reason: collision with root package name */
    public final q.h f34400x;

    public e(List list, j9.i iVar, String str, long j10, int i10, long j11, String str2, List list2, q9.d dVar, int i11, int i12, int i13, float f10, float f11, float f12, float f13, bk.c cVar, h8.h hVar, List list3, int i14, q9.a aVar, boolean z10, hr.c cVar2, q.h hVar2) {
        this.f34377a = list;
        this.f34378b = iVar;
        this.f34379c = str;
        this.f34380d = j10;
        this.f34381e = i10;
        this.f34382f = j11;
        this.f34383g = str2;
        this.f34384h = list2;
        this.f34385i = dVar;
        this.f34386j = i11;
        this.f34387k = i12;
        this.f34388l = i13;
        this.f34389m = f10;
        this.f34390n = f11;
        this.f34391o = f12;
        this.f34392p = f13;
        this.f34393q = cVar;
        this.f34394r = hVar;
        this.f34396t = list3;
        this.f34397u = i14;
        this.f34395s = aVar;
        this.f34398v = z10;
        this.f34399w = cVar2;
        this.f34400x = hVar2;
    }

    public final String a(String str) {
        int i10;
        StringBuilder p10 = da.e.p(str);
        p10.append(this.f34379c);
        p10.append("\n");
        j9.i iVar = this.f34378b;
        e eVar = (e) iVar.f21173h.c(this.f34382f);
        if (eVar != null) {
            p10.append("\t\tParents: ");
            p10.append(eVar.f34379c);
            for (e eVar2 = (e) iVar.f21173h.c(eVar.f34382f); eVar2 != null; eVar2 = (e) iVar.f21173h.c(eVar2.f34382f)) {
                p10.append("->");
                p10.append(eVar2.f34379c);
            }
            p10.append(str);
            p10.append("\n");
        }
        List list = this.f34384h;
        if (!list.isEmpty()) {
            p10.append(str);
            p10.append("\tMasks: ");
            p10.append(list.size());
            p10.append("\n");
        }
        int i11 = this.f34386j;
        if (i11 != 0 && (i10 = this.f34387k) != 0) {
            p10.append(str);
            p10.append("\tBackground: ");
            p10.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f34388l)));
        }
        List list2 = this.f34377a;
        if (!list2.isEmpty()) {
            p10.append(str);
            p10.append("\tShapes:\n");
            for (Object obj : list2) {
                p10.append(str);
                p10.append("\t\t");
                p10.append(obj);
                p10.append("\n");
            }
        }
        return p10.toString();
    }

    public final String toString() {
        return a(HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
