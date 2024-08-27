package lh;

import iu.k;
import kh.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f24849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f24850c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f24851d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Function1 function1, m mVar, Function0 function0, int i10) {
        super(0);
        this.f24848a = i10;
        this.f24849b = function1;
        this.f24850c = mVar;
        this.f24851d = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Function1 function1 = this.f24849b;
        m mVar = this.f24850c;
        Function0 function0 = this.f24851d;
        int i10 = this.f24848a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        function1.invoke(mVar);
                        function0.mo2invoke();
                        break;
                    default:
                        function1.invoke(mVar);
                        function0.mo2invoke();
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        function1.invoke(mVar);
                        function0.mo2invoke();
                        break;
                    default:
                        function1.invoke(mVar);
                        function0.mo2invoke();
                        break;
                }
                return Unit.f23355a;
        }
    }
}
