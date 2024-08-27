package wc;

import com.assetgro.stockgro.data.model.arenaV2.Option;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f39008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Option f39009c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f39010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Function1 function1, Option option, Function0 function0, int i10) {
        super(0);
        this.f39007a = i10;
        this.f39008b = function1;
        this.f39009c = option;
        this.f39010d = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Function1 function1 = this.f39008b;
        Option option = this.f39009c;
        Function0 function0 = this.f39010d;
        int i10 = this.f39007a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        function1.invoke(option);
                        function0.mo2invoke();
                        break;
                    default:
                        function1.invoke(option);
                        function0.mo2invoke();
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        function1.invoke(option);
                        function0.mo2invoke();
                        break;
                    default:
                        function1.invoke(option);
                        function0.mo2invoke();
                        break;
                }
                return Unit.f23355a;
        }
    }
}
