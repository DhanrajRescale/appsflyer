package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f19051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f19053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(boolean z10, boolean z11, q1 q1Var, h2.v vVar) {
        super(1);
        this.f19051a = z10;
        this.f19052b = z11;
        this.f19053c = q1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j2.e eVar = (j2.e) obj;
        if (!this.f19051a && this.f19052b) {
            q1 q1Var = this.f19053c;
            p2.i0 i0Var = q1Var.f19138e;
            h0 h0Var = q1Var.f19153t;
            Unit unit = null;
            if (i0Var != null) {
                p2.c0 a10 = q1Var.f19137d.a(vt.y.g(new Object(), new p2.a(eVar, 1)));
                i0Var.a(null, a10);
                h0Var.invoke(a10);
                unit = Unit.f23355a;
            }
            if (unit == null) {
                String str = eVar.f20699a;
                int length = str.length();
                h0Var.invoke(new p2.c0(str, d2.w0.b(length, length), 4));
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
