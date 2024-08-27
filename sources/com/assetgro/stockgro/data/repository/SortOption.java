package com.assetgro.stockgro.data.repository;

import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/assetgro/stockgro/data/repository/SortOption;", HttpUrl.FRAGMENT_ENCODE_SET, "paramName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "getParamName", "()Ljava/lang/String;", "Price", "Percentage", "Alphabets", "Trending", "Volume", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SortOption {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ SortOption[] $VALUES;

    @NotNull
    private final String paramName;
    public static final SortOption Price = new SortOption("Price", 0, "price");
    public static final SortOption Percentage = new SortOption("Percentage", 1, "percentage");
    public static final SortOption Alphabets = new SortOption("Alphabets", 2, "alphabets");
    public static final SortOption Trending = new SortOption("Trending", 3, "trending");
    public static final SortOption Volume = new SortOption("Volume", 4, "volume");

    private static final /* synthetic */ SortOption[] $values() {
        return new SortOption[]{Price, Percentage, Alphabets, Trending, Volume};
    }

    static {
        SortOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private SortOption(String str, int i10, String str2) {
        this.paramName = str2;
    }

    @NotNull
    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static SortOption valueOf(String str) {
        return (SortOption) Enum.valueOf(SortOption.class, str);
    }

    public static SortOption[] values() {
        return (SortOption[]) $VALUES.clone();
    }

    @NotNull
    public final String getParamName() {
        return this.paramName;
    }
}
