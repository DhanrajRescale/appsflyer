package ha;

import com.assetgro.stockgro.feature_market.domain.model.OptionType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18101a;

    static {
        int[] iArr = new int[OptionType.values().length];
        try {
            iArr[OptionType.CALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OptionType.PUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f18101a = iArr;
    }
}
