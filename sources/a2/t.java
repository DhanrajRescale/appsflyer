package a2;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class t implements o0, r {

    /* renamed from: a, reason: collision with root package name */
    public final w2.k f122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f123b;

    public t(r rVar, w2.k kVar) {
        this.f122a = kVar;
        this.f123b = rVar;
    }

    @Override // w2.b
    public final long H(float f10) {
        return this.f123b.H(f10);
    }

    @Override // w2.b
    public final float N(int i10) {
        return this.f123b.N(i10);
    }

    @Override // w2.b
    public final float P(float f10) {
        return this.f123b.P(f10);
    }

    @Override // w2.b
    public final float Y() {
        return this.f123b.Y();
    }

    @Override // a2.r
    public final boolean a0() {
        return this.f123b.a0();
    }

    @Override // w2.b
    public final float b() {
        return this.f123b.b();
    }

    @Override // w2.b
    public final float c0(float f10) {
        return this.f123b.c0(f10);
    }

    @Override // a2.r
    public final w2.k getLayoutDirection() {
        return this.f122a;
    }

    @Override // w2.b
    public final int h0(long j10) {
        return this.f123b.h0(j10);
    }

    @Override // w2.b
    public final int m0(float f10) {
        return this.f123b.m0(f10);
    }

    @Override // w2.b
    public final long o(float f10) {
        return this.f123b.o(f10);
    }

    @Override // w2.b
    public final long p(long j10) {
        return this.f123b.p(j10);
    }

    @Override // w2.b
    public final long s0(long j10) {
        return this.f123b.s0(j10);
    }

    @Override // a2.o0
    public final n0 u(int i10, int i11, Map map, Function1 function1) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new s(i10, i11, map);
        }
        t0.t.C0("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // w2.b
    public final float x(long j10) {
        return this.f123b.x(j10);
    }

    @Override // w2.b
    public final float x0(long j10) {
        return this.f123b.x0(j10);
    }
}
