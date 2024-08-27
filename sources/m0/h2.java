package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h2 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f26232b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Function0 function0, int i10) {
        super(1);
        this.f26231a = i10;
        this.f26232b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function0 function0 = this.f26232b;
        int i10 = this.f26231a;
        switch (i10) {
            case 0:
                long j10 = ((m1.c) obj).f27237a;
                switch (i10) {
                    case 0:
                        function0.mo2invoke();
                        break;
                    default:
                        function0.mo2invoke();
                        break;
                }
                return Unit.f23355a;
            case 1:
                long j11 = ((m1.c) obj).f27237a;
                switch (i10) {
                    case 0:
                        function0.mo2invoke();
                        break;
                    default:
                        function0.mo2invoke();
                        break;
                }
                return Unit.f23355a;
            default:
                return new w2.h(hl.f.j(ku.c.b(((Number) function0.mo2invoke()).floatValue()), 0));
        }
    }
}
