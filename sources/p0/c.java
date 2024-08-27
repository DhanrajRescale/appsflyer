package p0;

import c2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f30438b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f30439c = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30440a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(1);
        this.f30440a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f30440a) {
            case 0:
                return Unit.f23355a;
            default:
                j0 j0Var = (j0) ((p1.e) obj);
                p1.b bVar = j0Var.f7740a.f30501b;
                long b10 = bVar.b();
                bVar.a().h();
                bVar.f30498a.f30504a.a().q(-3.4028235E38f, s0.g.f34069a, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                j0Var.a();
                bVar.a().s();
                bVar.c(b10);
                return Unit.f23355a;
        }
    }
}
