package com.assetgro.stockgro.feature_market.domain.model;

import bu.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/OptionType;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "CALL", "PUT", "Companion", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OptionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OptionType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final OptionType CALL = new OptionType("CALL", 0);
    public static final OptionType PUT = new OptionType("PUT", 1);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/OptionType$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "getOptionType", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionType;", "stringType", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OptionType getOptionType(@NotNull String stringType) {
            Intrinsics.checkNotNullParameter(stringType, "stringType");
            if (Intrinsics.a(stringType, "CE")) {
                return OptionType.CALL;
            }
            return OptionType.PUT;
        }
    }

    private static final /* synthetic */ OptionType[] $values() {
        return new OptionType[]{CALL, PUT};
    }

    static {
        OptionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
        INSTANCE = new Companion(null);
    }

    private OptionType(String str, int i10) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static OptionType valueOf(String str) {
        return (OptionType) Enum.valueOf(OptionType.class, str);
    }

    public static OptionType[] values() {
        return (OptionType[]) $VALUES.clone();
    }
}
