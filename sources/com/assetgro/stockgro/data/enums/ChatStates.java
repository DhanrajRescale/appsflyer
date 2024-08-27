package com.assetgro.stockgro.data.enums;

import bu.a;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/assetgro/stockgro/data/enums/ChatStates;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "TOOLBAR", "FAB", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChatStates {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ChatStates[] $VALUES;
    public static final ChatStates TOOLBAR = new ChatStates("TOOLBAR", 0);
    public static final ChatStates FAB = new ChatStates("FAB", 1);

    private static final /* synthetic */ ChatStates[] $values() {
        return new ChatStates[]{TOOLBAR, FAB};
    }

    static {
        ChatStates[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private ChatStates(String str, int i10) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ChatStates valueOf(String str) {
        return (ChatStates) Enum.valueOf(ChatStates.class, str);
    }

    public static ChatStates[] values() {
        return (ChatStates[]) $VALUES.clone();
    }
}
