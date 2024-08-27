package dr;

import fr.i;
import gr.k;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f14467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f14468c;

    public /* synthetic */ a(b bVar, i iVar, int i10) {
        this.f14466a = i10;
        this.f14467b = bVar;
        this.f14468c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14466a;
        i iVar = this.f14468c;
        b bVar = this.f14467b;
        switch (i10) {
            case 0:
                k b10 = bVar.b(iVar);
                if (b10 != null) {
                    bVar.f14471a.add(b10);
                    return;
                }
                return;
            default:
                k b11 = bVar.b(iVar);
                if (b11 != null) {
                    bVar.f14471a.add(b11);
                    return;
                }
                return;
        }
    }
}
