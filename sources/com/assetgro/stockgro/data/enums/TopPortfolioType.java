package com.assetgro.stockgro.data.enums;

import bu.a;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/assetgro/stockgro/data/enums/TopPortfolioType;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "WEEKLY", "TODAY", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TopPortfolioType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TopPortfolioType[] $VALUES;
    public static final TopPortfolioType WEEKLY = new TopPortfolioType("WEEKLY", 0);
    public static final TopPortfolioType TODAY = new TopPortfolioType("TODAY", 1);

    private static final /* synthetic */ TopPortfolioType[] $values() {
        return new TopPortfolioType[]{WEEKLY, TODAY};
    }

    static {
        TopPortfolioType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private TopPortfolioType(String str, int i10) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TopPortfolioType valueOf(String str) {
        return (TopPortfolioType) Enum.valueOf(TopPortfolioType.class, str);
    }

    public static TopPortfolioType[] values() {
        return (TopPortfolioType[]) $VALUES.clone();
    }
}
