package com.assetgro.stockgro.data.enums;

import bu.a;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/assetgro/stockgro/data/enums/GroupJoinStatus;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "Joined", "Requested", "Cancelled", "Exited", "None", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GroupJoinStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GroupJoinStatus[] $VALUES;
    public static final GroupJoinStatus Joined = new GroupJoinStatus("Joined", 0);
    public static final GroupJoinStatus Requested = new GroupJoinStatus("Requested", 1);
    public static final GroupJoinStatus Cancelled = new GroupJoinStatus("Cancelled", 2);
    public static final GroupJoinStatus Exited = new GroupJoinStatus("Exited", 3);
    public static final GroupJoinStatus None = new GroupJoinStatus("None", 4);

    private static final /* synthetic */ GroupJoinStatus[] $values() {
        return new GroupJoinStatus[]{Joined, Requested, Cancelled, Exited, None};
    }

    static {
        GroupJoinStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private GroupJoinStatus(String str, int i10) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GroupJoinStatus valueOf(String str) {
        return (GroupJoinStatus) Enum.valueOf(GroupJoinStatus.class, str);
    }

    public static GroupJoinStatus[] values() {
        return (GroupJoinStatus[]) $VALUES.clone();
    }
}
