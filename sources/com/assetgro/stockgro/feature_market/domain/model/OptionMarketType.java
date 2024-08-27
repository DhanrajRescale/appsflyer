package com.assetgro.stockgro.feature_market.domain.model;

import bu.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/OptionMarketType;", HttpUrl.FRAGMENT_ENCODE_SET, "tabName", HttpUrl.FRAGMENT_ENCODE_SET, "tabIndex", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;I)V", "Market", "Limit", "Companion", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OptionMarketType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OptionMarketType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int tabIndex;

    @NotNull
    private final String tabName;
    public static final OptionMarketType Market = new OptionMarketType("Market", 0, "Market", 0);
    public static final OptionMarketType Limit = new OptionMarketType("Limit", 1, "Limit", 1);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/OptionMarketType$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "getOptionMarketTypeByName", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionMarketType;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "getOptionMarketTypeTabName", "optionMarketType", "getTabIndexOf", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OptionMarketType getOptionMarketTypeByName(@NotNull String name) {
            OptionMarketType optionMarketType;
            Intrinsics.checkNotNullParameter(name, "name");
            OptionMarketType[] values = OptionMarketType.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    optionMarketType = values[i10];
                    if (Intrinsics.a(optionMarketType.tabName, name)) {
                        break;
                    }
                    i10++;
                } else {
                    optionMarketType = null;
                    break;
                }
            }
            if (optionMarketType == null) {
                return OptionMarketType.Market;
            }
            return optionMarketType;
        }

        @NotNull
        public final String getOptionMarketTypeTabName(@NotNull OptionMarketType optionMarketType) {
            Intrinsics.checkNotNullParameter(optionMarketType, "optionMarketType");
            return optionMarketType.tabName;
        }

        public final int getTabIndexOf(@NotNull OptionMarketType optionMarketType) {
            Intrinsics.checkNotNullParameter(optionMarketType, "optionMarketType");
            return optionMarketType.tabIndex;
        }
    }

    private static final /* synthetic */ OptionMarketType[] $values() {
        return new OptionMarketType[]{Market, Limit};
    }

    static {
        OptionMarketType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
        INSTANCE = new Companion(null);
    }

    private OptionMarketType(String str, int i10, String str2, int i11) {
        this.tabName = str2;
        this.tabIndex = i11;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static OptionMarketType valueOf(String str) {
        return (OptionMarketType) Enum.valueOf(OptionMarketType.class, str);
    }

    public static OptionMarketType[] values() {
        return (OptionMarketType[]) $VALUES.clone();
    }
}
