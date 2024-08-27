package i5;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr.e f19651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f19652c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r5.s f19653d;

    public /* synthetic */ u0(tr.e eVar, Pair pair, r5.s sVar, int i10) {
        this.f19650a = i10;
        this.f19651b = eVar;
        this.f19652c = pair;
        this.f19653d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f19650a;
        r5.s sVar = this.f19653d;
        Pair pair = this.f19652c;
        tr.e eVar = this.f19651b;
        switch (i10) {
            case 0:
                j5.a aVar = ((a1) eVar.f36362c).f19352h;
                int intValue = ((Integer) pair.first).intValue();
                r5.w wVar = (r5.w) pair.second;
                wVar.getClass();
                ((j5.w) aVar).L(intValue, wVar, sVar);
                return;
            default:
                ((j5.w) ((a1) eVar.f36362c).f19352h).o(((Integer) pair.first).intValue(), (r5.w) pair.second, sVar);
                return;
        }
    }
}
