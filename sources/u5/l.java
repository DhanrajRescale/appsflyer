package u5;

import b5.j1;
import com.google.android.gms.common.api.Api;
import java.util.Comparator;
import lp.e0;
import lp.h1;
import lp.o0;
import lp.q1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class l extends n implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f36800e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f36801f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f36802g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f36803h;

    /* renamed from: i, reason: collision with root package name */
    public final int f36804i;

    /* renamed from: j, reason: collision with root package name */
    public final int f36805j;

    /* renamed from: k, reason: collision with root package name */
    public final int f36806k;

    /* renamed from: l, reason: collision with root package name */
    public final int f36807l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f36808m;

    public l(int i10, j1 j1Var, int i11, i iVar, int i12, String str) {
        super(i10, i11, j1Var);
        boolean z10;
        boolean z11;
        o0 o0Var;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14 = 0;
        this.f36801f = p.f(i12, false);
        int i15 = this.f36812d.f3644d & (~iVar.f3483u);
        if ((i15 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36802g = z10;
        if ((i15 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f36803h = z11;
        o0 o0Var2 = iVar.f3481s;
        if (o0Var2.isEmpty()) {
            o0Var = o0.v(HttpUrl.FRAGMENT_ENCODE_SET);
        } else {
            o0Var = o0Var2;
        }
        int i16 = 0;
        while (true) {
            if (i16 < o0Var.size()) {
                i13 = p.d(this.f36812d, (String) o0Var.get(i16), iVar.f3484v);
                if (i13 > 0) {
                    break;
                } else {
                    i16++;
                }
            } else {
                i16 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i13 = 0;
                break;
            }
        }
        this.f36804i = i16;
        this.f36805j = i13;
        int a10 = p.a(this.f36812d.f3645e, iVar.f3482t);
        this.f36806k = a10;
        if ((this.f36812d.f3645e & 1088) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f36808m = z12;
        if (p.h(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int d10 = p.d(this.f36812d, str, z13);
        this.f36807l = d10;
        if (i13 <= 0 && ((!o0Var2.isEmpty() || a10 <= 0) && !this.f36802g && (!this.f36803h || d10 <= 0))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (p.f(i12, iVar.X) && z14) {
            i14 = 1;
        }
        this.f36800e = i14;
    }

    @Override // u5.n
    public final int a() {
        return this.f36800e;
    }

    @Override // u5.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        e0 c10 = e0.f24968a.c(this.f36801f, lVar.f36801f);
        Integer valueOf = Integer.valueOf(this.f36804i);
        Integer valueOf2 = Integer.valueOf(lVar.f36804i);
        Comparator comparator = h1.f24991a;
        comparator.getClass();
        q1 q1Var = q1.f25045a;
        e0 b10 = c10.b(valueOf, valueOf2, q1Var);
        int i10 = this.f36805j;
        e0 a10 = b10.a(i10, lVar.f36805j);
        int i11 = this.f36806k;
        e0 c11 = a10.a(i11, lVar.f36806k).c(this.f36802g, lVar.f36802g);
        Boolean valueOf3 = Boolean.valueOf(this.f36803h);
        Boolean valueOf4 = Boolean.valueOf(lVar.f36803h);
        if (i10 != 0) {
            comparator = q1Var;
        }
        e0 a11 = c11.b(valueOf3, valueOf4, comparator).a(this.f36807l, lVar.f36807l);
        if (i11 == 0) {
            a11 = a11.d(this.f36808m, lVar.f36808m);
        }
        return a11.e();
    }
}
