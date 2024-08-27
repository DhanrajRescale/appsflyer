package t0;

/* loaded from: classes.dex */
public final class q implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35133b;

    public /* synthetic */ q(Object obj, int i10) {
        this.f35132a = i10;
        this.f35133b = obj;
    }

    public final void a() {
        int i10 = this.f35132a;
        Object obj = this.f35133b;
        switch (i10) {
            case 0:
                r rVar = (r) obj;
                rVar.f35191z--;
                return;
            default:
                e1.u uVar = (e1.u) obj;
                uVar.f14929j--;
                return;
        }
    }

    public final void b() {
        int i10 = this.f35132a;
        Object obj = this.f35133b;
        switch (i10) {
            case 0:
                ((r) obj).f35191z++;
                return;
            default:
                ((e1.u) obj).f14929j++;
                return;
        }
    }
}
