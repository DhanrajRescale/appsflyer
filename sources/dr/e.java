package dr;

import fr.i;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f14486c;

    public /* synthetic */ e(f fVar, i iVar, int i10) {
        this.f14484a = i10;
        this.f14485b = fVar;
        this.f14486c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14484a;
        i iVar = this.f14486c;
        f fVar = this.f14485b;
        switch (i10) {
            case 0:
                gr.d b10 = fVar.b(iVar);
                if (b10 != null) {
                    fVar.f14489b.add(b10);
                    return;
                }
                return;
            default:
                gr.d b11 = fVar.b(iVar);
                if (b11 != null) {
                    fVar.f14489b.add(b11);
                    return;
                }
                return;
        }
    }
}
