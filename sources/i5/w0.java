package i5;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr.e f19662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f19663c;

    public /* synthetic */ w0(tr.e eVar, Pair pair, int i10) {
        this.f19661a = i10;
        this.f19662b = eVar;
        this.f19663c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f19661a;
        Pair pair = this.f19663c;
        tr.e eVar = this.f19662b;
        switch (i10) {
            case 0:
                ((j5.w) ((a1) eVar.f36362c).f19352h).d(((Integer) pair.first).intValue(), (r5.w) pair.second);
                return;
            case 1:
                ((j5.w) ((a1) eVar.f36362c).f19352h).k(((Integer) pair.first).intValue(), (r5.w) pair.second);
                return;
            case 2:
                ((j5.w) ((a1) eVar.f36362c).f19352h).s(((Integer) pair.first).intValue(), (r5.w) pair.second);
                return;
            default:
                ((j5.w) ((a1) eVar.f36362c).f19352h).g(((Integer) pair.first).intValue(), (r5.w) pair.second);
                return;
        }
    }
}
