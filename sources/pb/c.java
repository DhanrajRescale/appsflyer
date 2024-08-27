package pb;

import gb.d;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f30832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f30833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Function1 function1, d dVar, int i10) {
        super(0);
        this.f30831a = i10;
        this.f30832b = function1;
        this.f30833c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Function1 function1 = this.f30832b;
        d dVar = this.f30833c;
        int i10 = this.f30831a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        function1.invoke(dVar);
                        break;
                    default:
                        function1.invoke(dVar);
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        function1.invoke(dVar);
                        break;
                    default:
                        function1.invoke(dVar);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
