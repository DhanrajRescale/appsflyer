package r5;

import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import b5.i1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import lp.j1;

/* loaded from: classes.dex */
public final class g0 extends h {

    /* renamed from: r, reason: collision with root package name */
    public static final b5.k0 f33165r;

    /* renamed from: k, reason: collision with root package name */
    public final a[] f33166k;

    /* renamed from: l, reason: collision with root package name */
    public final i1[] f33167l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f33168m;

    /* renamed from: n, reason: collision with root package name */
    public final mt.p f33169n;

    /* renamed from: o, reason: collision with root package name */
    public int f33170o;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f33171p;

    /* renamed from: q, reason: collision with root package name */
    public MergingMediaSource$IllegalMergeException f33172q;

    /* JADX WARN: Type inference failed for: r13v0, types: [b5.z, b5.a0] */
    static {
        b5.y yVar = new b5.y();
        lp.l0 l0Var = lp.o0.f25025b;
        j1 j1Var = j1.f24998e;
        Collections.emptyList();
        j1 j1Var2 = j1.f24998e;
        f33165r = new b5.k0("MergingMediaSource", new b5.z(yVar), null, new b5.e0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), b5.n0.I, b5.g0.f3304c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mt.p] */
    public g0(a... aVarArr) {
        ?? obj = new Object();
        this.f33166k = aVarArr;
        this.f33169n = obj;
        this.f33168m = new ArrayList(Arrays.asList(aVarArr));
        this.f33170o = -1;
        this.f33167l = new i1[aVarArr.length];
        this.f33171p = new long[0];
        new HashMap();
        kp.j.A(8, "expectedKeys");
        new lp.b1().m().t0();
    }

    @Override // r5.a
    public final u b(w wVar, v5.e eVar, long j10) {
        a[] aVarArr = this.f33166k;
        int length = aVarArr.length;
        u[] uVarArr = new u[length];
        i1[] i1VarArr = this.f33167l;
        int b10 = i1VarArr[0].b(wVar.f3556a);
        for (int i10 = 0; i10 < length; i10++) {
            uVarArr[i10] = aVarArr[i10].b(wVar.b(i1VarArr[i10].m(b10)), eVar, j10 - this.f33171p[b10][i10]);
        }
        return new f0(this.f33169n, this.f33171p[b10], uVarArr);
    }

    @Override // r5.a
    public final b5.k0 h() {
        a[] aVarArr = this.f33166k;
        if (aVarArr.length > 0) {
            return aVarArr[0].h();
        }
        return f33165r;
    }

    @Override // r5.h, r5.a
    public final void j() {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.f33172q;
        if (mergingMediaSource$IllegalMergeException == null) {
            super.j();
            return;
        }
        throw mergingMediaSource$IllegalMergeException;
    }

    @Override // r5.a
    public final void l(g5.u uVar) {
        this.f33175j = uVar;
        this.f33174i = e5.x.l(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f33166k;
            if (i10 < aVarArr.length) {
                w(Integer.valueOf(i10), aVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // r5.a
    public final void n(u uVar) {
        f0 f0Var = (f0) uVar;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f33166k;
            if (i10 < aVarArr.length) {
                a aVar = aVarArr[i10];
                u uVar2 = f0Var.f33152a[i10];
                if (uVar2 instanceof d0) {
                    uVar2 = ((d0) uVar2).f33120a;
                }
                aVar.n(uVar2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // r5.h, r5.a
    public final void p() {
        super.p();
        Arrays.fill(this.f33167l, (Object) null);
        this.f33170o = -1;
        this.f33172q = null;
        ArrayList arrayList = this.f33168m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f33166k);
    }

    @Override // r5.h
    public final w s(Object obj, w wVar) {
        if (((Integer) obj).intValue() != 0) {
            return null;
        }
        return wVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException, java.io.IOException] */
    @Override // r5.h
    public final void v(Object obj, a aVar, i1 i1Var) {
        Integer num = (Integer) obj;
        if (this.f33172q == null) {
            if (this.f33170o == -1) {
                this.f33170o = i1Var.i();
            } else if (i1Var.i() != this.f33170o) {
                this.f33172q = new IOException();
                return;
            }
            int length = this.f33171p.length;
            i1[] i1VarArr = this.f33167l;
            if (length == 0) {
                this.f33171p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f33170o, i1VarArr.length);
            }
            ArrayList arrayList = this.f33168m;
            arrayList.remove(aVar);
            i1VarArr[num.intValue()] = i1Var;
            if (arrayList.isEmpty()) {
                m(i1VarArr[0]);
            }
        }
    }
}
