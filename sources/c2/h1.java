package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h1 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f7715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(int i10, Function1 function1) {
        super(0);
        this.f7714a = i10;
        this.f7715b = function1;
    }

    public final void a() {
        int i10 = this.f7714a;
        Function1 function1 = this.f7715b;
        switch (i10) {
            case 0:
                function1.invoke(i1.D);
                return;
            case 1:
                function1.invoke(null);
                return;
            case 2:
                function1.invoke(null);
                return;
            case 3:
                if (function1 != null) {
                    function1.invoke(hb.y.f18244d);
                    return;
                }
                return;
            case 4:
                if (function1 != null) {
                    function1.invoke(hb.y.f18245e);
                    return;
                }
                return;
            case 5:
                if (function1 != null) {
                    function1.invoke(hb.y.f18241a);
                    return;
                }
                return;
            case 6:
                function1.invoke(hb.y.f18242b);
                return;
            case 7:
                function1.invoke(hb.y.f18242b);
                return;
            case 8:
                function1.invoke(yd.f.f41542d);
                return;
            case 9:
                function1.invoke(Boolean.TRUE);
                return;
            case 10:
                function1.invoke(Boolean.FALSE);
                return;
            case 11:
                function1.invoke("accept");
                return;
            case 12:
                function1.invoke("reject");
                return;
            case 13:
                function1.invoke("reject");
                return;
            case 14:
                function1.invoke("accept");
                return;
            default:
                function1.invoke("reject");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f7714a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            case 2:
                a();
                return Unit.f23355a;
            case 3:
                a();
                return Unit.f23355a;
            case 4:
                a();
                return Unit.f23355a;
            case 5:
                a();
                return Unit.f23355a;
            case 6:
                a();
                return Unit.f23355a;
            case 7:
                a();
                return Unit.f23355a;
            case 8:
                a();
                return Unit.f23355a;
            case 9:
                a();
                return Unit.f23355a;
            case 10:
                a();
                return Unit.f23355a;
            case 11:
                a();
                return Unit.f23355a;
            case 12:
                a();
                return Unit.f23355a;
            case 13:
                a();
                return Unit.f23355a;
            case 14:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
