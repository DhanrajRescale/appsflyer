package ka;

import com.assetgro.stockgro.feature_market.domain.model.OptionMarketType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22938a;

    static {
        int[] iArr = new int[OptionMarketType.values().length];
        try {
            iArr[OptionMarketType.Market.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OptionMarketType.Limit.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f22938a = iArr;
    }
}
