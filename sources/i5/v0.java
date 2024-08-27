package i5;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr.e f19656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f19657c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r5.n f19658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r5.s f19659e;

    public /* synthetic */ v0(tr.e eVar, Pair pair, r5.n nVar, r5.s sVar, int i10) {
        this.f19655a = i10;
        this.f19656b = eVar;
        this.f19657c = pair;
        this.f19658d = nVar;
        this.f19659e = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f19655a;
        r5.s sVar = this.f19659e;
        r5.n nVar = this.f19658d;
        Pair pair = this.f19657c;
        tr.e eVar = this.f19656b;
        switch (i10) {
            case 0:
                ((j5.w) ((a1) eVar.f36362c).f19352h).J(((Integer) pair.first).intValue(), (r5.w) pair.second, nVar, sVar);
                return;
            case 1:
                ((j5.w) ((a1) eVar.f36362c).f19352h).G(((Integer) pair.first).intValue(), (r5.w) pair.second, nVar, sVar);
                return;
            default:
                ((j5.w) ((a1) eVar.f36362c).f19352h).v(((Integer) pair.first).intValue(), (r5.w) pair.second, nVar, sVar);
                return;
        }
    }
}
