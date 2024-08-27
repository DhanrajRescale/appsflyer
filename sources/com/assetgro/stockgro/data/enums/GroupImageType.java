package com.assetgro.stockgro.data.enums;

import bu.a;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/assetgro/stockgro/data/enums/GroupImageType;", HttpUrl.FRAGMENT_ENCODE_SET, "paramName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "getParamName", "()Ljava/lang/String;", "Display", "Cover", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GroupImageType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GroupImageType[] $VALUES;

    @NotNull
    private final String paramName;
    public static final GroupImageType Display = new GroupImageType("Display", 0, "display");
    public static final GroupImageType Cover = new GroupImageType("Cover", 1, "cover");

    private static final /* synthetic */ GroupImageType[] $values() {
        return new GroupImageType[]{Display, Cover};
    }

    static {
        GroupImageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private GroupImageType(String str, int i10, String str2) {
        this.paramName = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GroupImageType valueOf(String str) {
        return (GroupImageType) Enum.valueOf(GroupImageType.class, str);
    }

    public static GroupImageType[] values() {
        return (GroupImageType[]) $VALUES.clone();
    }

    @NotNull
    public final String getParamName() {
        return this.paramName;
    }
}
