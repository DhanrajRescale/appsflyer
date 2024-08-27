package pd;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class a0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.n f30848b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(c.n nVar, int i10) {
        super(0);
        this.f30847a = i10;
        this.f30848b = nVar;
    }

    public final void a() {
        f.d dVar = f.d.f15871a;
        int i10 = this.f30847a;
        c.n nVar = this.f30848b;
        switch (i10) {
            case 0:
                nVar.a(qu.i0.e(dVar));
                return;
            case 1:
                nVar.a(qu.i0.e(dVar));
                return;
            case 2:
                nVar.a(qu.i0.e(dVar));
                return;
            case 3:
                nVar.a(qu.i0.e(f.e.f15872a));
                return;
            default:
                nVar.a(new String[]{"application/pdf"});
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f30847a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            case 2:
                a();
                return Unit.f23355a;
            case 3:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
