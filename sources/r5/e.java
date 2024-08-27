package r5;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import b5.h1;
import b5.i1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends f1 {

    /* renamed from: l, reason: collision with root package name */
    public final long f33132l;

    /* renamed from: m, reason: collision with root package name */
    public final long f33133m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f33134n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f33135o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f33136p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f33137q;

    /* renamed from: r, reason: collision with root package name */
    public final h1 f33138r;

    /* renamed from: s, reason: collision with root package name */
    public d f33139s;

    /* renamed from: t, reason: collision with root package name */
    public ClippingMediaSource$IllegalClippingException f33140t;

    /* renamed from: u, reason: collision with root package name */
    public long f33141u;

    /* renamed from: v, reason: collision with root package name */
    public long f33142v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super(aVar);
        boolean z13;
        aVar.getClass();
        if (j10 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        yk.j.E0(z13);
        this.f33132l = j10;
        this.f33133m = j11;
        this.f33134n = z10;
        this.f33135o = z11;
        this.f33136p = z12;
        this.f33137q = new ArrayList();
        this.f33138r = new h1();
    }

    public final void A(i1 i1Var) {
        long j10;
        long j11;
        long j12;
        h1 h1Var = this.f33138r;
        i1Var.o(0, h1Var);
        long j13 = h1Var.f3348q;
        d dVar = this.f33139s;
        ArrayList arrayList = this.f33137q;
        long j14 = this.f33133m;
        long j15 = Long.MIN_VALUE;
        if (dVar != null && !arrayList.isEmpty() && !this.f33135o) {
            long j16 = this.f33141u - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f33142v - j13;
            }
            j12 = j15;
            j11 = j16;
        } else {
            boolean z10 = this.f33136p;
            long j17 = this.f33132l;
            if (z10) {
                long j18 = h1Var.f3344m;
                j17 += j18;
                j10 = j18 + j14;
            } else {
                j10 = j14;
            }
            this.f33141u = j13 + j17;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j10;
            }
            this.f33142v = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = (c) arrayList.get(i10);
                long j19 = this.f33141u;
                long j20 = this.f33142v;
                cVar.f33097e = j19;
                cVar.f33098f = j20;
            }
            j11 = j17;
            j12 = j10;
        }
        try {
            d dVar2 = new d(i1Var, j11, j12);
            this.f33139s = dVar2;
            m(dVar2);
        } catch (ClippingMediaSource$IllegalClippingException e10) {
            this.f33140t = e10;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((c) arrayList.get(i11)).f33099g = this.f33140t;
            }
        }
    }

    @Override // r5.a
    public final u b(w wVar, v5.e eVar, long j10) {
        c cVar = new c(this.f33161k.b(wVar, eVar, j10), this.f33134n, this.f33141u, this.f33142v);
        this.f33137q.add(cVar);
        return cVar;
    }

    @Override // r5.h, r5.a
    public final void j() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f33140t;
        if (clippingMediaSource$IllegalClippingException == null) {
            super.j();
            return;
        }
        throw clippingMediaSource$IllegalClippingException;
    }

    @Override // r5.a
    public final void n(u uVar) {
        ArrayList arrayList = this.f33137q;
        yk.j.H0(arrayList.remove(uVar));
        this.f33161k.n(((c) uVar).f33093a);
        if (arrayList.isEmpty() && !this.f33135o) {
            d dVar = this.f33139s;
            dVar.getClass();
            A(dVar.f33206b);
        }
    }

    @Override // r5.h, r5.a
    public final void p() {
        super.p();
        this.f33140t = null;
        this.f33139s = null;
    }

    @Override // r5.f1
    public final void y(i1 i1Var) {
        if (this.f33140t != null) {
            return;
        }
        A(i1Var);
    }
}
