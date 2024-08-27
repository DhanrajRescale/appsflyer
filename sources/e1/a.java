package e1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f14839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f14840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Function1 function1, Function1 function12, int i10) {
        super(1);
        this.f14838a = i10;
        this.f14839b = function1;
        this.f14840c = function12;
    }

    public final void a(Object obj) {
        int i10 = this.f14838a;
        Function1 function1 = this.f14840c;
        Function1 function12 = this.f14839b;
        switch (i10) {
            case 1:
                function12.invoke(obj);
                function1.invoke(obj);
                return;
            case 2:
                function12.invoke(obj);
                function1.invoke(obj);
                return;
            default:
                function12.invoke(obj);
                function1.invoke(obj);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f14838a) {
            case 0:
                n nVar = (n) obj;
                synchronized (p.f14905b) {
                    i10 = p.f14907d;
                    p.f14907d = i10 + 1;
                }
                return new c(i10, nVar, this.f14839b, this.f14840c);
            case 1:
                a(obj);
                return Unit.f23355a;
            case 2:
                a(obj);
                return Unit.f23355a;
            default:
                a(obj);
                return Unit.f23355a;
        }
    }
}
