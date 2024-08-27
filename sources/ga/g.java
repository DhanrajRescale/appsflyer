package ga;

import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f17187a = new iu.k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((OptionContract) obj).getChange();
    }
}
