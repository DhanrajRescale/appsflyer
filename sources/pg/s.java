package pg;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f31080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f31081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Function1 function1, c cVar, int i10) {
        super(0);
        this.f31079a = i10;
        this.f31080b = function1;
        this.f31081c = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Function1 function1 = this.f31080b;
        c cVar = this.f31081c;
        int i10 = this.f31079a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        function1.invoke(cVar);
                        break;
                    default:
                        function1.invoke(cVar);
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        function1.invoke(cVar);
                        break;
                    default:
                        function1.invoke(cVar);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
