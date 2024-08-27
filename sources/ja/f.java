package ja;

import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f21261b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f21262c = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21263a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(1);
        this.f21263a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21263a) {
            case 0:
                return ((FnoOption) obj).getImageUrl();
            default:
                return ((FnoOption) obj).getChange();
        }
    }
}
