package r1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import t0.n1;
import t0.o3;

/* loaded from: classes.dex */
public final class e0 extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public final c f32887b;

    /* renamed from: c, reason: collision with root package name */
    public String f32888c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32889d;

    /* renamed from: e, reason: collision with root package name */
    public final a f32890e;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f32891f;

    /* renamed from: g, reason: collision with root package name */
    public final n1 f32892g;

    /* renamed from: h, reason: collision with root package name */
    public n1.m f32893h;

    /* renamed from: i, reason: collision with root package name */
    public final n1 f32894i;

    /* renamed from: j, reason: collision with root package name */
    public long f32895j;

    /* renamed from: k, reason: collision with root package name */
    public float f32896k;

    /* renamed from: l, reason: collision with root package name */
    public float f32897l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f32898m;

    public e0(c cVar) {
        this.f32887b = cVar;
        cVar.f32852i = new d0(this, 0);
        this.f32888c = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f32889d = true;
        this.f32890e = new a();
        this.f32891f = g.f32914c;
        o3 o3Var = o3.f35116a;
        this.f32892g = t0.t.n0(null, o3Var);
        this.f32894i = t0.t.n0(new m1.f(m1.f.f27251b), o3Var);
        this.f32895j = m1.f.f27252c;
        this.f32896k = 1.0f;
        this.f32897l = 1.0f;
        this.f32898m = new d0(this, 1);
    }

    @Override // r1.c0
    public final void a(p1.h hVar) {
        e(hVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(p1.h r31, float r32, n1.u r33) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.e0.e(p1.h, float, n1.u):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f32888c);
        sb2.append("\n\tviewportWidth: ");
        n1 n1Var = this.f32894i;
        sb2.append(m1.f.e(((m1.f) n1Var.getValue()).f27254a));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(m1.f.c(((m1.f) n1Var.getValue()).f27254a));
        sb2.append("\n");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
