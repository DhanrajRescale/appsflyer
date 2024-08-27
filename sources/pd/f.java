package pd;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f30878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1.s f30879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Function1 function1, e1.s sVar, int i10) {
        super(0);
        this.f30877a = i10;
        this.f30878b = function1;
        this.f30879c = sVar;
    }

    public final void a() {
        int i10 = this.f30877a;
        e1.s sVar = this.f30879c;
        Function1 function1 = this.f30878b;
        switch (i10) {
            case 0:
                function1.invoke(sVar);
                return;
            case 1:
                function1.invoke(sVar);
                return;
            default:
                function1.invoke(sVar);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f30877a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
