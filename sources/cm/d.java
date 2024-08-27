package cm;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f8231b;

    public /* synthetic */ d(e eVar, int i10) {
        this.f8230a = i10;
        this.f8231b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8230a;
        e eVar = this.f8231b;
        switch (i10) {
            case 0:
                eVar.f8234e = 0L;
                eVar.f8233d.setVisibility(8);
                return;
            default:
                eVar.finish();
                return;
        }
    }
}
