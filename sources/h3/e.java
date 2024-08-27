package h3;

import g3.k;
import j3.j;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e extends g3.g {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public j3.g n0;

    /* renamed from: o0, reason: collision with root package name */
    public HashMap f17921o0;

    /* renamed from: p0, reason: collision with root package name */
    public HashMap f17922p0;

    /* renamed from: q0, reason: collision with root package name */
    public HashMap f17923q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f17924r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f17925s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f17926t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f17927u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f17928v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f17929w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f17930x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f17931y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f17932z0;

    public e(k kVar, int i10) {
        super(kVar, i10);
        this.f17924r0 = 0;
        this.f17925s0 = -1;
        this.f17926t0 = -1;
        this.f17927u0 = -1;
        this.f17928v0 = -1;
        this.f17929w0 = -1;
        this.f17930x0 = -1;
        this.f17931y0 = 2;
        this.f17932z0 = 2;
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = -1;
        this.H0 = 0;
        this.I0 = 0.5f;
        this.J0 = 0.5f;
        this.K0 = 0.5f;
        this.L0 = 0.5f;
        if (i10 == 8) {
            this.H0 = 1;
        }
    }

    @Override // g3.g, g3.b, g3.h
    public final void a() {
        t();
        b(this.n0);
        j3.g gVar = this.n0;
        gVar.X0 = this.H0;
        gVar.V0 = this.f17924r0;
        int i10 = this.G0;
        if (i10 != -1) {
            gVar.W0 = i10;
        }
        int i11 = this.C0;
        if (i11 != 0) {
            gVar.f20933y0 = i11;
        }
        int i12 = this.E0;
        if (i12 != 0) {
            gVar.f20929u0 = i12;
        }
        int i13 = this.D0;
        if (i13 != 0) {
            gVar.f20934z0 = i13;
        }
        int i14 = this.F0;
        if (i14 != 0) {
            gVar.f20930v0 = i14;
        }
        int i15 = this.B0;
        if (i15 != 0) {
            gVar.R0 = i15;
        }
        int i16 = this.A0;
        if (i16 != 0) {
            gVar.S0 = i16;
        }
        float f10 = this.f16450h;
        if (f10 != 0.5f) {
            gVar.L0 = f10;
        }
        float f11 = this.K0;
        if (f11 != 0.5f) {
            gVar.N0 = f11;
        }
        float f12 = this.L0;
        if (f12 != 0.5f) {
            gVar.P0 = f12;
        }
        float f13 = this.f16452i;
        if (f13 != 0.5f) {
            gVar.M0 = f13;
        }
        float f14 = this.I0;
        if (f14 != 0.5f) {
            gVar.O0 = f14;
        }
        float f15 = this.J0;
        if (f15 != 0.5f) {
            gVar.Q0 = f15;
        }
        int i17 = this.f17932z0;
        if (i17 != 2) {
            gVar.T0 = i17;
        }
        int i18 = this.f17931y0;
        if (i18 != 2) {
            gVar.U0 = i18;
        }
        int i19 = this.f17925s0;
        if (i19 != -1) {
            gVar.G0 = i19;
        }
        int i20 = this.f17926t0;
        if (i20 != -1) {
            gVar.I0 = i20;
        }
        int i21 = this.f17927u0;
        if (i21 != -1) {
            gVar.K0 = i21;
        }
        int i22 = this.f17928v0;
        if (i22 != -1) {
            gVar.F0 = i22;
        }
        int i23 = this.f17929w0;
        if (i23 != -1) {
            gVar.H0 = i23;
        }
        int i24 = this.f17930x0;
        if (i24 != -1) {
            gVar.J0 = i24;
        }
        s();
    }

    @Override // g3.g
    public final j t() {
        if (this.n0 == null) {
            this.n0 = new j3.g();
        }
        return this.n0;
    }
}
