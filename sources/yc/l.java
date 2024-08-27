package yc;

import com.assetgro.stockgro.data.enums.LeagueStatus;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f41519a;

    static {
        int[] iArr = new int[LeagueStatus.values().length];
        try {
            iArr[LeagueStatus.LEAGUE_WINNER_DECLARED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LeagueStatus.LEAGUE_WINNER_NOT_DECLARED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LeagueStatus.LEAGUE_CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f41519a = iArr;
    }
}
