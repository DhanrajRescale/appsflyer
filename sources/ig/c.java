package ig;

import com.assetgro.stockgro.data.enums.LeagueStatus;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19969a;

    static {
        int[] iArr = new int[LeagueStatus.values().length];
        try {
            iArr[LeagueStatus.LEAGUE_NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LeagueStatus.LEAGUE_TRADING_NOT_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LeagueStatus.LEAGUE_TRADING_STARTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LeagueStatus.LEAGUE_WINNER_NOT_DECLARED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LeagueStatus.LEAGUE_WINNER_DECLARED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LeagueStatus.LEAGUE_CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f19969a = iArr;
    }
}
