package y2;

import c2.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f41090b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(q qVar, int i10) {
        super(0);
        this.f41089a = i10;
        this.f41090b = qVar;
    }

    public final void a() {
        t1 snapshotObserver;
        int i10 = this.f41089a;
        k kVar = this.f41090b;
        switch (i10) {
            case 0:
                kVar.getLayoutNode().x();
                return;
            default:
                if (kVar.f41096e && kVar.isAttachedToWindow() && kVar.getView().getParent() == kVar) {
                    snapshotObserver = kVar.getSnapshotObserver();
                    snapshotObserver.a(kVar, d.f41068b, kVar.getUpdate());
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f41089a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
