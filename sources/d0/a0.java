package d0;

import a2.k1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a0 implements z, a2.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f13135a;

    /* renamed from: b, reason: collision with root package name */
    public final k1 f13136b;

    /* renamed from: c, reason: collision with root package name */
    public final u f13137c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f13138d = new HashMap();

    public a0(s sVar, k1 k1Var) {
        this.f13135a = sVar;
        this.f13136b = k1Var;
        this.f13137c = (u) sVar.f13214b.mo2invoke();
    }

    @Override // w2.b
    public final long H(float f10) {
        return this.f13136b.H(f10);
    }

    @Override // w2.b
    public final float N(int i10) {
        return this.f13136b.N(i10);
    }

    @Override // w2.b
    public final float P(float f10) {
        return this.f13136b.P(f10);
    }

    @Override // w2.b
    public final float Y() {
        return this.f13136b.Y();
    }

    public final List a(int i10, long j10) {
        HashMap hashMap = this.f13138d;
        List list = (List) hashMap.get(Integer.valueOf(i10));
        if (list == null) {
            u uVar = this.f13137c;
            Object a10 = uVar.a(i10);
            List k10 = this.f13136b.k(a10, this.f13135a.a(i10, a10, uVar.d(i10)));
            int size = k10.size();
            ArrayList arrayList = new ArrayList(size);
            int i11 = 0;
            while (i11 < size) {
                i11 = nn.d.d((a2.l0) k10.get(i11), j10, arrayList, i11, 1);
            }
            hashMap.put(Integer.valueOf(i10), arrayList);
            return arrayList;
        }
        return list;
    }

    @Override // a2.r
    public final boolean a0() {
        return this.f13136b.a0();
    }

    @Override // w2.b
    public final float b() {
        return this.f13136b.b();
    }

    @Override // w2.b
    public final float c0(float f10) {
        return this.f13136b.c0(f10);
    }

    @Override // a2.r
    public final w2.k getLayoutDirection() {
        return this.f13136b.getLayoutDirection();
    }

    @Override // w2.b
    public final int h0(long j10) {
        return this.f13136b.h0(j10);
    }

    @Override // w2.b
    public final int m0(float f10) {
        return this.f13136b.m0(f10);
    }

    @Override // a2.o0
    public final a2.n0 n0(int i10, int i11, Map map, Function1 function1) {
        return this.f13136b.n0(i10, i11, map, function1);
    }

    @Override // w2.b
    public final long o(float f10) {
        return this.f13136b.o(f10);
    }

    @Override // w2.b
    public final long p(long j10) {
        return this.f13136b.p(j10);
    }

    @Override // w2.b
    public final long s0(long j10) {
        return this.f13136b.s0(j10);
    }

    @Override // a2.o0
    public final a2.n0 u(int i10, int i11, Map map, Function1 function1) {
        return this.f13136b.u(i10, i11, map, function1);
    }

    @Override // w2.b
    public final float x(long j10) {
        return this.f13136b.x(j10);
    }

    @Override // w2.b
    public final float x0(long j10) {
        return this.f13136b.x0(j10);
    }
}
