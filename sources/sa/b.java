package sa;

import com.assetgro.stockgro.data.model.InsightListType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f34405a;

    static {
        int[] iArr = new int[InsightListType.values().length];
        try {
            iArr[InsightListType.TRENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InsightListType.VOLUMESHOCKERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InsightListType.GAINERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InsightListType.LOSERS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InsightListType.WEEKLY_TOP_PORTFOLIOS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InsightListType.DAILY_TOP_PORTFOLIOS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f34405a = iArr;
    }
}
