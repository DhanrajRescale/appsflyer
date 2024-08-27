package m0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c2 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2 f25971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(p2 p2Var, int i10) {
        super(1);
        this.f25970a = i10;
        this.f25971b = p2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f25970a;
        p2 p2Var = this.f25971b;
        switch (i10) {
            case 0:
                return new w2.h(hl.f.j(ku.c.b(p2Var.f26627a.g()), 0));
            default:
                ((Number) obj).floatValue();
                return Float.valueOf(p2.a(p2Var).c0(m2.f26476b));
        }
    }
}
