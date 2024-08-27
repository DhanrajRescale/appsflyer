package pg;

import com.assetgro.stockgro.feature_market.data.remote.OptionValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f31029b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OptionValue f31030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Function1 function1, OptionValue optionValue, int i10) {
        super(0);
        this.f31028a = i10;
        this.f31029b = function1;
        this.f31030c = optionValue;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Function1 function1 = this.f31029b;
        OptionValue optionValue = this.f31030c;
        int i10 = this.f31028a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        function1.invoke(optionValue);
                        break;
                    default:
                        function1.invoke(optionValue);
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        function1.invoke(optionValue);
                        break;
                    default:
                        function1.invoke(optionValue);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
