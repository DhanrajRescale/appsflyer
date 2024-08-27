package com.assetgro.stockgro.data.enums;

import bu.a;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/assetgro/stockgro/data/enums/LeagueStatus;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "LEAGUE_CANCELLED", "LEAGUE_NOT_STARTED", "LEAGUE_TRADING_NOT_STARTED", "LEAGUE_TRADING_STARTED", "LEAGUE_WINNER_NOT_DECLARED", "LEAGUE_WINNER_DECLARED", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LeagueStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LeagueStatus[] $VALUES;
    public static final LeagueStatus LEAGUE_CANCELLED = new LeagueStatus("LEAGUE_CANCELLED", 0);
    public static final LeagueStatus LEAGUE_NOT_STARTED = new LeagueStatus("LEAGUE_NOT_STARTED", 1);
    public static final LeagueStatus LEAGUE_TRADING_NOT_STARTED = new LeagueStatus("LEAGUE_TRADING_NOT_STARTED", 2);
    public static final LeagueStatus LEAGUE_TRADING_STARTED = new LeagueStatus("LEAGUE_TRADING_STARTED", 3);
    public static final LeagueStatus LEAGUE_WINNER_NOT_DECLARED = new LeagueStatus("LEAGUE_WINNER_NOT_DECLARED", 4);
    public static final LeagueStatus LEAGUE_WINNER_DECLARED = new LeagueStatus("LEAGUE_WINNER_DECLARED", 5);

    private static final /* synthetic */ LeagueStatus[] $values() {
        return new LeagueStatus[]{LEAGUE_CANCELLED, LEAGUE_NOT_STARTED, LEAGUE_TRADING_NOT_STARTED, LEAGUE_TRADING_STARTED, LEAGUE_WINNER_NOT_DECLARED, LEAGUE_WINNER_DECLARED};
    }

    static {
        LeagueStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private LeagueStatus(String str, int i10) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static LeagueStatus valueOf(String str) {
        return (LeagueStatus) Enum.valueOf(LeagueStatus.class, str);
    }

    public static LeagueStatus[] values() {
        return (LeagueStatus[]) $VALUES.clone();
    }
}
