package com.assetgro.stockgro.data.model;

import bu.a;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/assetgro/stockgro/data/model/InsightListType;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "TRENDING", "GAINERS", "LOSERS", "VOLUMESHOCKERS", "WEEKLY_TOP_PORTFOLIOS", "DAILY_TOP_PORTFOLIOS", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InsightListType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InsightListType[] $VALUES;
    public static final InsightListType TRENDING = new InsightListType("TRENDING", 0);
    public static final InsightListType GAINERS = new InsightListType("GAINERS", 1);
    public static final InsightListType LOSERS = new InsightListType("LOSERS", 2);
    public static final InsightListType VOLUMESHOCKERS = new InsightListType("VOLUMESHOCKERS", 3);
    public static final InsightListType WEEKLY_TOP_PORTFOLIOS = new InsightListType("WEEKLY_TOP_PORTFOLIOS", 4);
    public static final InsightListType DAILY_TOP_PORTFOLIOS = new InsightListType("DAILY_TOP_PORTFOLIOS", 5);

    private static final /* synthetic */ InsightListType[] $values() {
        return new InsightListType[]{TRENDING, GAINERS, LOSERS, VOLUMESHOCKERS, WEEKLY_TOP_PORTFOLIOS, DAILY_TOP_PORTFOLIOS};
    }

    static {
        InsightListType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private InsightListType(String str, int i10) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static InsightListType valueOf(String str) {
        return (InsightListType) Enum.valueOf(InsightListType.class, str);
    }

    public static InsightListType[] values() {
        return (InsightListType[]) $VALUES.clone();
    }
}
