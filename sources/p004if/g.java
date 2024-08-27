package p004if;

import com.assetgro.stockgro.data.enums.TopPortfolioType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19962a;

    static {
        int[] iArr = new int[TopPortfolioType.values().length];
        try {
            iArr[TopPortfolioType.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TopPortfolioType.TODAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f19962a = iArr;
    }
}
