package z2;

import iu.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f41950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f41951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2.i f41952c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f41953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f41954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y yVar, r rVar, w2.i iVar, long j10, long j11) {
        super(0);
        this.f41950a = yVar;
        this.f41951b = rVar;
        this.f41952c = iVar;
        this.f41953d = j10;
        this.f41954e = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        r rVar = this.f41951b;
        this.f41950a.f20559a = rVar.getPositionProvider().a(this.f41952c, this.f41953d, rVar.getParentLayoutDirection(), this.f41954e);
        return Unit.f23355a;
    }
}
