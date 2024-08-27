package r1;

import android.graphics.Path;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public n1.p f32926b;

    /* renamed from: f, reason: collision with root package name */
    public float f32930f;

    /* renamed from: g, reason: collision with root package name */
    public n1.p f32931g;

    /* renamed from: k, reason: collision with root package name */
    public float f32935k;

    /* renamed from: m, reason: collision with root package name */
    public float f32937m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32940p;

    /* renamed from: q, reason: collision with root package name */
    public p1.m f32941q;

    /* renamed from: r, reason: collision with root package name */
    public final n1.h f32942r;

    /* renamed from: s, reason: collision with root package name */
    public n1.h f32943s;

    /* renamed from: t, reason: collision with root package name */
    public final ut.g f32944t;

    /* renamed from: c, reason: collision with root package name */
    public float f32927c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public List f32928d = h0.f32945a;

    /* renamed from: e, reason: collision with root package name */
    public float f32929e = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f32932h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f32933i = 0;

    /* renamed from: j, reason: collision with root package name */
    public float f32934j = 4.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f32936l = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32938n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f32939o = true;

    public h() {
        n1.h h10 = androidx.compose.ui.graphics.a.h();
        this.f32942r = h10;
        this.f32943s = h10;
        ut.i iVar = ut.i.f37392a;
        this.f32944t = ut.h.b(g.f32913b);
    }

    @Override // r1.c0
    public final void a(p1.h hVar) {
        if (this.f32938n) {
            b.b(this.f32928d, this.f32942r);
            e();
        } else if (this.f32940p) {
            e();
        }
        this.f32938n = false;
        this.f32940p = false;
        n1.p pVar = this.f32926b;
        if (pVar != null) {
            p1.h.o0(hVar, this.f32943s, pVar, this.f32927c, null, 56);
        }
        n1.p pVar2 = this.f32931g;
        if (pVar2 != null) {
            p1.m mVar = this.f32941q;
            if (this.f32939o || mVar == null) {
                mVar = new p1.m(this.f32930f, this.f32934j, this.f32932h, this.f32933i, null, 16);
                this.f32941q = mVar;
                this.f32939o = false;
            }
            p1.h.o0(hVar, this.f32943s, pVar2, this.f32929e, mVar, 48);
        }
    }

    public final void e() {
        int i10;
        Path path;
        float f10 = this.f32935k;
        n1.h hVar = this.f32942r;
        if (f10 == s0.g.f34069a && this.f32936l == 1.0f) {
            this.f32943s = hVar;
            return;
        }
        if (Intrinsics.a(this.f32943s, hVar)) {
            this.f32943s = androidx.compose.ui.graphics.a.h();
        } else {
            if (this.f32943s.f28138a.getFillType() == Path.FillType.EVEN_ODD) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f32943s.f28138a.rewind();
            this.f32943s.i(i10);
        }
        ut.g gVar = this.f32944t;
        n1.j jVar = (n1.j) gVar.getValue();
        if (hVar != null) {
            jVar.getClass();
            path = hVar.f28138a;
        } else {
            path = null;
        }
        jVar.f28145a.setPath(path, false);
        float length = ((n1.j) gVar.getValue()).f28145a.getLength();
        float f11 = this.f32935k;
        float f12 = this.f32937m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f32936l + f12) % 1.0f) * length;
        if (f13 > f14) {
            ((n1.j) gVar.getValue()).a(f13, length, this.f32943s);
            ((n1.j) gVar.getValue()).a(s0.g.f34069a, f14, this.f32943s);
        } else {
            ((n1.j) gVar.getValue()).a(f13, f14, this.f32943s);
        }
    }

    public final String toString() {
        return this.f32942r.toString();
    }
}
