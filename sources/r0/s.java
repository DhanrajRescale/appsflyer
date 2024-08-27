package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        super(0);
        this.f32696a = i10;
        this.f32697b = obj;
        this.f32698c = obj2;
    }

    public final void a() {
        int i10 = this.f32696a;
        Object obj = this.f32698c;
        Object obj2 = this.f32697b;
        switch (i10) {
            case 0:
                t tVar = (t) obj2;
                p pVar = tVar.f32728m;
                float c10 = tVar.d().c(obj);
                if (!Float.isNaN(c10)) {
                    t tVar2 = pVar.f32664a;
                    tVar2.f32724i.j(c10);
                    tVar2.f32725j.j(s0.g.f34069a);
                    tVar.i(null);
                }
                tVar.h(obj);
                return;
            default:
                ((z2) obj2).f32834d = (w2.b) obj;
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f32696a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            default:
                z2 z2Var = (z2) this.f32697b;
                if (((Boolean) z2Var.f32833c.f32718c.invoke(a3.f32326c)).booleanValue()) {
                    yk.g.H((qu.f0) this.f32698c, null, null, new r1(z2Var, null), 3);
                }
                return Boolean.TRUE;
        }
    }
}
