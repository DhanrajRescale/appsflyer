package d0;

import kotlin.jvm.functions.Function0;
import y.d2;

/* loaded from: classes.dex */
public final class h0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f13165b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(g0 g0Var, int i10) {
        super(0);
        this.f13164a = i10;
        this.f13165b = g0Var;
    }

    public final Float a() {
        boolean d10;
        float a10;
        int i10 = this.f13164a;
        g0 g0Var = this.f13165b;
        switch (i10) {
            case 0:
                return Float.valueOf(g0Var.a());
            default:
                g0Var.getClass();
                c0.e eVar = (c0.e) g0Var;
                int i11 = eVar.f7485a;
                d2 d2Var = eVar.f7487c;
                switch (i11) {
                    case 0:
                        d10 = ((c0.m0) d2Var).d();
                        break;
                    default:
                        d10 = ((e0.j0) d2Var).d();
                        break;
                }
                if (d10) {
                    a10 = g0Var.a() + 100;
                } else {
                    a10 = g0Var.a();
                }
                return Float.valueOf(a10);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f13164a) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
