package ka;

import com.assetgro.stockgro.feature_market.domain.model.OptionOrderType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22786a;

    static {
        int[] iArr = new int[OptionOrderType.values().length];
        try {
            iArr[OptionOrderType.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OptionOrderType.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f22786a = iArr;
    }
}
