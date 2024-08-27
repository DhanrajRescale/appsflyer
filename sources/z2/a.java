package z2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f41906b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(p pVar, int i10) {
        super(1);
        this.f41905a = i10;
        this.f41906b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f41905a;
        p pVar = this.f41906b;
        switch (i10) {
            case 0:
                pVar.show();
                return new c.c(pVar, 10);
            default:
                if (pVar.f41946e.f41942a) {
                    pVar.f41945d.mo2invoke();
                }
                return Unit.f23355a;
        }
    }
}
