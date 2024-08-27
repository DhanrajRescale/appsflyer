package ld;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;
import t0.g1;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f24578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f24579c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Function1 function1, g1 g1Var, int i10) {
        super(0);
        this.f24577a = i10;
        this.f24578b = function1;
        this.f24579c = g1Var;
    }

    public final void a() {
        int i10 = this.f24577a;
        Function1 function1 = this.f24578b;
        g1 g1Var = this.f24579c;
        switch (i10) {
            case 0:
                function1.invoke(g1Var.getValue());
                return;
            case 1:
                function1.invoke(g1Var.getValue());
                return;
            case 2:
                function1.invoke(g1Var.getValue());
                return;
            case 3:
                g1Var.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                function1.invoke((String) g1Var.getValue());
                return;
            case 4:
                function1.invoke((String) g1Var.getValue());
                return;
            case 5:
                if (((String) g1Var.getValue()).length() > 2) {
                    function1.invoke((String) g1Var.getValue());
                    return;
                }
                return;
            default:
                function1.invoke((String) g1Var.getValue());
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f24577a) {
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
            default:
                a();
                return Unit.f23355a;
        }
    }
}
