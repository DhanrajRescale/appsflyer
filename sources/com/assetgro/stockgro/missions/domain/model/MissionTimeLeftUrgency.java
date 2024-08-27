package com.assetgro.stockgro.missions.domain.model;

import bu.a;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/missions/domain/model/MissionTimeLeftUrgency;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "NONE", "LOW", "MEDIUM", "HIGH", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MissionTimeLeftUrgency {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MissionTimeLeftUrgency[] $VALUES;
    public static final MissionTimeLeftUrgency NONE = new MissionTimeLeftUrgency("NONE", 0);
    public static final MissionTimeLeftUrgency LOW = new MissionTimeLeftUrgency("LOW", 1);
    public static final MissionTimeLeftUrgency MEDIUM = new MissionTimeLeftUrgency("MEDIUM", 2);
    public static final MissionTimeLeftUrgency HIGH = new MissionTimeLeftUrgency("HIGH", 3);

    private static final /* synthetic */ MissionTimeLeftUrgency[] $values() {
        return new MissionTimeLeftUrgency[]{NONE, LOW, MEDIUM, HIGH};
    }

    static {
        MissionTimeLeftUrgency[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private MissionTimeLeftUrgency(String str, int i10) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MissionTimeLeftUrgency valueOf(String str) {
        return (MissionTimeLeftUrgency) Enum.valueOf(MissionTimeLeftUrgency.class, str);
    }

    public static MissionTimeLeftUrgency[] values() {
        return (MissionTimeLeftUrgency[]) $VALUES.clone();
    }
}
