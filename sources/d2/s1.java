package d2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0.m3 f13616a = new t0.a0(m0.f13531m);

    /* renamed from: b, reason: collision with root package name */
    public static final t0.m3 f13617b = new t0.a0(m0.f13532n);

    /* renamed from: c, reason: collision with root package name */
    public static final t0.m3 f13618c = new t0.a0(m0.f13533o);

    /* renamed from: d, reason: collision with root package name */
    public static final t0.m3 f13619d = new t0.a0(m0.f13534p);

    /* renamed from: e, reason: collision with root package name */
    public static final t0.m3 f13620e = new t0.a0(m0.f13535q);

    /* renamed from: f, reason: collision with root package name */
    public static final t0.m3 f13621f = new t0.a0(m0.f13536r);

    /* renamed from: g, reason: collision with root package name */
    public static final t0.m3 f13622g = new t0.a0(m0.f13538t);

    /* renamed from: h, reason: collision with root package name */
    public static final t0.m3 f13623h = new t0.a0(m0.f13537s);

    /* renamed from: i, reason: collision with root package name */
    public static final t0.m3 f13624i = new t0.a0(m0.f13539u);

    /* renamed from: j, reason: collision with root package name */
    public static final t0.m3 f13625j = new t0.a0(m0.f13540v);

    /* renamed from: k, reason: collision with root package name */
    public static final t0.m3 f13626k = new t0.a0(m0.f13541w);

    /* renamed from: l, reason: collision with root package name */
    public static final t0.m3 f13627l = new t0.a0(m0.f13544z);

    /* renamed from: m, reason: collision with root package name */
    public static final t0.m3 f13628m = new t0.a0(m0.f13543y);

    /* renamed from: n, reason: collision with root package name */
    public static final t0.m3 f13629n = new t0.a0(m0.A);

    /* renamed from: o, reason: collision with root package name */
    public static final t0.m3 f13630o = new t0.a0(m0.B);

    /* renamed from: p, reason: collision with root package name */
    public static final t0.m3 f13631p = new t0.a0(m0.C);

    /* renamed from: q, reason: collision with root package name */
    public static final t0.m3 f13632q = new t0.a0(m0.D);

    /* renamed from: r, reason: collision with root package name */
    public static final t0.m3 f13633r = new t0.a0(m0.f13542x);

    public static final void a(c2.r1 r1Var, g3 g3Var, Function2 function2, t0.n nVar, int i10) {
        int i11;
        int i12;
        boolean j10;
        int i13;
        boolean j11;
        int i14;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(874662829);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                j11 = rVar.h(r1Var);
            } else {
                j11 = rVar.j(r1Var);
            }
            if (j11) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                j10 = rVar.h(g3Var);
            } else {
                j10 = rVar.j(g3Var);
            }
            if (j10) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (rVar.j(function2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else {
            a0 a0Var = (a0) r1Var;
            t0.v1 b10 = f13616a.b(a0Var.getAccessibilityManager());
            t0.v1 b11 = f13617b.b(a0Var.getAutofill());
            t0.v1 b12 = f13618c.b(a0Var.getAutofillTree());
            t0.v1 b13 = f13619d.b(a0Var.m23getClipboardManager());
            t0.v1 b14 = f13620e.b(a0Var.getDensity());
            t0.v1 b15 = f13621f.b(a0Var.getFocusOwner());
            o2.p fontLoader = a0Var.getFontLoader();
            t0.m3 m3Var = f13622g;
            m3Var.getClass();
            t0.v1 v1Var = new t0.v1(m3Var, fontLoader, false);
            o2.r fontFamilyResolver = a0Var.getFontFamilyResolver();
            t0.m3 m3Var2 = f13623h;
            m3Var2.getClass();
            dp.b.q(new t0.v1[]{b10, b11, b12, b13, b14, b15, v1Var, new t0.v1(m3Var2, fontFamilyResolver, false), f13624i.b(a0Var.getHapticFeedBack()), f13625j.b(a0Var.getInputModeManager()), f13626k.b(a0Var.getLayoutDirection()), f13627l.b(a0Var.getTextInputService()), f13628m.b(a0Var.getSoftwareKeyboardController()), f13629n.b(a0Var.getTextToolbar()), f13630o.b(g3Var), f13631p.b(a0Var.getViewConfiguration()), f13632q.b(a0Var.getWindowInfo()), f13633r.b(a0Var.getPointerIconService())}, function2, rVar, (i11 >> 3) & 112);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.n0(r1Var, g3Var, function2, i10, 5);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
