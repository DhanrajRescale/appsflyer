package y8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import qu.b0;

/* loaded from: classes.dex */
public final class j {
    public final androidx.lifecycle.o A;
    public final z8.h B;
    public final z8.f C;
    public final n D;
    public final w8.c E;
    public final Integer F;
    public final Drawable G;
    public final Integer H;
    public final Drawable I;
    public final Integer J;
    public final Drawable K;
    public final d L;
    public final c M;

    /* renamed from: a, reason: collision with root package name */
    public final Context f41362a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41363b;

    /* renamed from: c, reason: collision with root package name */
    public final a9.a f41364c;

    /* renamed from: d, reason: collision with root package name */
    public final i f41365d;

    /* renamed from: e, reason: collision with root package name */
    public final w8.c f41366e;

    /* renamed from: f, reason: collision with root package name */
    public final String f41367f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f41368g;

    /* renamed from: h, reason: collision with root package name */
    public final ColorSpace f41369h;

    /* renamed from: i, reason: collision with root package name */
    public final z8.d f41370i;

    /* renamed from: j, reason: collision with root package name */
    public final Pair f41371j;

    /* renamed from: k, reason: collision with root package name */
    public final p8.c f41372k;

    /* renamed from: l, reason: collision with root package name */
    public final List f41373l;

    /* renamed from: m, reason: collision with root package name */
    public final c9.e f41374m;

    /* renamed from: n, reason: collision with root package name */
    public final Headers f41375n;

    /* renamed from: o, reason: collision with root package name */
    public final q f41376o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f41377p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f41378q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f41379r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f41380s;

    /* renamed from: t, reason: collision with root package name */
    public final b f41381t;

    /* renamed from: u, reason: collision with root package name */
    public final b f41382u;

    /* renamed from: v, reason: collision with root package name */
    public final b f41383v;

    /* renamed from: w, reason: collision with root package name */
    public final b0 f41384w;

    /* renamed from: x, reason: collision with root package name */
    public final b0 f41385x;

    /* renamed from: y, reason: collision with root package name */
    public final b0 f41386y;

    /* renamed from: z, reason: collision with root package name */
    public final b0 f41387z;

    public j(Context context, Object obj, a9.a aVar, i iVar, w8.c cVar, String str, Bitmap.Config config, ColorSpace colorSpace, z8.d dVar, Pair pair, p8.c cVar2, List list, c9.e eVar, Headers headers, q qVar, boolean z10, boolean z11, boolean z12, boolean z13, b bVar, b bVar2, b bVar3, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, androidx.lifecycle.o oVar, z8.h hVar, z8.f fVar, n nVar, w8.c cVar3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, d dVar2, c cVar4) {
        this.f41362a = context;
        this.f41363b = obj;
        this.f41364c = aVar;
        this.f41365d = iVar;
        this.f41366e = cVar;
        this.f41367f = str;
        this.f41368g = config;
        this.f41369h = colorSpace;
        this.f41370i = dVar;
        this.f41371j = pair;
        this.f41372k = cVar2;
        this.f41373l = list;
        this.f41374m = eVar;
        this.f41375n = headers;
        this.f41376o = qVar;
        this.f41377p = z10;
        this.f41378q = z11;
        this.f41379r = z12;
        this.f41380s = z13;
        this.f41381t = bVar;
        this.f41382u = bVar2;
        this.f41383v = bVar3;
        this.f41384w = b0Var;
        this.f41385x = b0Var2;
        this.f41386y = b0Var3;
        this.f41387z = b0Var4;
        this.A = oVar;
        this.B = hVar;
        this.C = fVar;
        this.D = nVar;
        this.E = cVar3;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = dVar2;
        this.M = cVar4;
    }

    public static h a(j jVar) {
        Context context = jVar.f41362a;
        jVar.getClass();
        return new h(jVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (Intrinsics.a(this.f41362a, jVar.f41362a) && Intrinsics.a(this.f41363b, jVar.f41363b) && Intrinsics.a(this.f41364c, jVar.f41364c) && Intrinsics.a(this.f41365d, jVar.f41365d) && Intrinsics.a(this.f41366e, jVar.f41366e) && Intrinsics.a(this.f41367f, jVar.f41367f) && this.f41368g == jVar.f41368g && ((Build.VERSION.SDK_INT < 26 || Intrinsics.a(this.f41369h, jVar.f41369h)) && this.f41370i == jVar.f41370i && Intrinsics.a(this.f41371j, jVar.f41371j) && Intrinsics.a(this.f41372k, jVar.f41372k) && Intrinsics.a(this.f41373l, jVar.f41373l) && Intrinsics.a(this.f41374m, jVar.f41374m) && Intrinsics.a(this.f41375n, jVar.f41375n) && Intrinsics.a(this.f41376o, jVar.f41376o) && this.f41377p == jVar.f41377p && this.f41378q == jVar.f41378q && this.f41379r == jVar.f41379r && this.f41380s == jVar.f41380s && this.f41381t == jVar.f41381t && this.f41382u == jVar.f41382u && this.f41383v == jVar.f41383v && Intrinsics.a(this.f41384w, jVar.f41384w) && Intrinsics.a(this.f41385x, jVar.f41385x) && Intrinsics.a(this.f41386y, jVar.f41386y) && Intrinsics.a(this.f41387z, jVar.f41387z) && Intrinsics.a(this.E, jVar.E) && Intrinsics.a(this.F, jVar.F) && Intrinsics.a(this.G, jVar.G) && Intrinsics.a(this.H, jVar.H) && Intrinsics.a(this.I, jVar.I) && Intrinsics.a(this.J, jVar.J) && Intrinsics.a(this.K, jVar.K) && Intrinsics.a(this.A, jVar.A) && Intrinsics.a(this.B, jVar.B) && this.C == jVar.C && Intrinsics.a(this.D, jVar.D) && Intrinsics.a(this.L, jVar.L) && Intrinsics.a(this.M, jVar.M))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int hashCode = (this.f41363b.hashCode() + (this.f41362a.hashCode() * 31)) * 31;
        int i23 = 0;
        a9.a aVar = this.f41364c;
        if (aVar != null) {
            i10 = aVar.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (hashCode + i10) * 31;
        i iVar = this.f41365d;
        if (iVar != null) {
            i11 = iVar.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 31;
        w8.c cVar = this.f41366e;
        if (cVar != null) {
            i12 = cVar.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (i25 + i12) * 31;
        String str = this.f41367f;
        if (str != null) {
            i13 = str.hashCode();
        } else {
            i13 = 0;
        }
        int hashCode2 = (this.f41368g.hashCode() + ((i26 + i13) * 31)) * 31;
        ColorSpace colorSpace = this.f41369h;
        if (colorSpace != null) {
            i14 = colorSpace.hashCode();
        } else {
            i14 = 0;
        }
        int hashCode3 = (this.f41370i.hashCode() + ((hashCode2 + i14) * 31)) * 31;
        Pair pair = this.f41371j;
        if (pair != null) {
            i15 = pair.hashCode();
        } else {
            i15 = 0;
        }
        int i27 = (hashCode3 + i15) * 31;
        if (this.f41372k != null) {
            i16 = p8.c.class.hashCode();
        } else {
            i16 = 0;
        }
        int hashCode4 = (this.D.f41405a.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.f41387z.hashCode() + ((this.f41386y.hashCode() + ((this.f41385x.hashCode() + ((this.f41384w.hashCode() + ((this.f41383v.hashCode() + ((this.f41382u.hashCode() + ((this.f41381t.hashCode() + v.e.d(this.f41380s, v.e.d(this.f41379r, v.e.d(this.f41378q, v.e.d(this.f41377p, (this.f41376o.f41414a.hashCode() + ((this.f41375n.hashCode() + ((this.f41374m.hashCode() + nn.d.e(this.f41373l, (i27 + i16) * 31, 31)) * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        w8.c cVar2 = this.E;
        if (cVar2 != null) {
            i17 = cVar2.hashCode();
        } else {
            i17 = 0;
        }
        int i28 = (hashCode4 + i17) * 31;
        Integer num = this.F;
        if (num != null) {
            i18 = num.hashCode();
        } else {
            i18 = 0;
        }
        int i29 = (i28 + i18) * 31;
        Drawable drawable = this.G;
        if (drawable != null) {
            i19 = drawable.hashCode();
        } else {
            i19 = 0;
        }
        int i30 = (i29 + i19) * 31;
        Integer num2 = this.H;
        if (num2 != null) {
            i20 = num2.hashCode();
        } else {
            i20 = 0;
        }
        int i31 = (i30 + i20) * 31;
        Drawable drawable2 = this.I;
        if (drawable2 != null) {
            i21 = drawable2.hashCode();
        } else {
            i21 = 0;
        }
        int i32 = (i31 + i21) * 31;
        Integer num3 = this.J;
        if (num3 != null) {
            i22 = num3.hashCode();
        } else {
            i22 = 0;
        }
        int i33 = (i32 + i22) * 31;
        Drawable drawable3 = this.K;
        if (drawable3 != null) {
            i23 = drawable3.hashCode();
        }
        return this.M.hashCode() + ((this.L.hashCode() + ((i33 + i23) * 31)) * 31);
    }
}
