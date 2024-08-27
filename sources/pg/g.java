package pg;

import com.assetgro.stockgro.feature_market.data.remote.OptionValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionValue f31032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f31033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(OptionValue optionValue, Function2 function2, int i10) {
        super(0);
        this.f31031a = i10;
        this.f31032b = optionValue;
        this.f31033c = function2;
    }

    public final void a() {
        int i10 = this.f31031a;
        Function2 function2 = this.f31033c;
        OptionValue optionValue = this.f31032b;
        switch (i10) {
            case 0:
                if (optionValue.isLong()) {
                    function2.invoke(Boolean.TRUE, optionValue);
                    return;
                } else {
                    function2.invoke(Boolean.FALSE, optionValue);
                    return;
                }
            default:
                if (optionValue.isLong()) {
                    function2.invoke(Boolean.FALSE, optionValue);
                    return;
                } else {
                    function2.invoke(Boolean.TRUE, optionValue);
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f31031a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
