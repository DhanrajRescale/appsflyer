package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f19072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19073b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f19074c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.c0 f19075d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(boolean z10, boolean z11, q1 q1Var, h2.v vVar, p2.c0 c0Var) {
        super(1);
        this.f19072a = z10;
        this.f19073b = z11;
        this.f19074c = q1Var;
        this.f19075d = c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j2.e eVar = (j2.e) obj;
        if (!this.f19072a && this.f19073b) {
            q1 q1Var = this.f19074c;
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
                p2.c0 c0Var = this.f19075d;
                String str = c0Var.f30522a.f20699a;
                int i10 = j2.f0.f20711c;
                long j10 = c0Var.f30523b;
                int i11 = (int) (j10 >> 32);
                String obj2 = kotlin.text.w.L(str, i11, (int) (j10 & 4294967295L), eVar).toString();
                int length = eVar.f20699a.length() + i11;
                h0Var.invoke(new p2.c0(obj2, d2.w0.b(length, length), 4));
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
