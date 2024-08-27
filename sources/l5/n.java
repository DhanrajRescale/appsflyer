package l5;

import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.List;
import u5.s;

/* loaded from: classes.dex */
public final class n implements a {

    /* renamed from: a, reason: collision with root package name */
    public final v5.p f24058a;

    /* renamed from: b, reason: collision with root package name */
    public final h8.h f24059b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f24060c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24061d;

    /* renamed from: e, reason: collision with root package name */
    public final g5.f f24062e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24063f;

    /* renamed from: g, reason: collision with root package name */
    public final q f24064g;

    /* renamed from: h, reason: collision with root package name */
    public final l[] f24065h;

    /* renamed from: i, reason: collision with root package name */
    public s f24066i;

    /* renamed from: j, reason: collision with root package name */
    public m5.c f24067j;

    /* renamed from: k, reason: collision with root package name */
    public int f24068k;

    /* renamed from: l, reason: collision with root package name */
    public BehindLiveWindowException f24069l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24070m;

    public n(v5.p pVar, m5.c cVar, h8.h hVar, int i10, int[] iArr, s sVar, int i11, g5.f fVar, long j10, boolean z10, ArrayList arrayList, q qVar) {
        this.f24058a = pVar;
        this.f24067j = cVar;
        this.f24059b = hVar;
        this.f24060c = iArr;
        this.f24066i = sVar;
        this.f24061d = i11;
        this.f24062e = fVar;
        this.f24068k = i10;
        this.f24063f = j10;
        this.f24064g = qVar;
        long c10 = cVar.c(i10);
        ArrayList a10 = a();
        this.f24065h = new l[sVar.length()];
        int i12 = 0;
        while (i12 < this.f24065h.length) {
            m5.m mVar = (m5.m) a10.get(sVar.i(i12));
            m5.b l10 = hVar.l(mVar.f27565b);
            int i13 = i12;
            this.f24065h[i13] = new l(c10, mVar, l10 == null ? (m5.b) mVar.f27565b.get(0) : l10, j5.d.e(i11, mVar.f27564a, z10, arrayList, qVar), 0L, mVar.c());
            i12 = i13 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.f24067j.a(this.f24068k).f27549c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f24060c) {
            arrayList.addAll(((m5.a) list.get(i10)).f27505c);
        }
        return arrayList;
    }

    public final l b(int i10) {
        l[] lVarArr = this.f24065h;
        l lVar = lVarArr[i10];
        m5.b l10 = this.f24059b.l(lVar.f24049b.f27565b);
        if (l10 != null && !l10.equals(lVar.f24050c)) {
            l lVar2 = new l(lVar.f24052e, lVar.f24049b, l10, lVar.f24048a, lVar.f24053f, lVar.f24051d);
            lVarArr[i10] = lVar2;
            return lVar2;
        }
        return lVar;
    }
}
