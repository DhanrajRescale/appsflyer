package zb;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f42268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f42269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f42270c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1.o f42271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42272e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z10, boolean z11, List list, g1.o oVar, int i10) {
        super(2);
        this.f42268a = z10;
        this.f42269b = z11;
        this.f42270c = list;
        this.f42271d = oVar;
        this.f42272e = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kp.j.k(this.f42268a, this.f42269b, this.f42270c, this.f42271d, (t0.n) obj, t0.t.H0(this.f42272e | 1));
        return Unit.f23355a;
    }
}
