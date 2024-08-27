package com.assetgro.stockgro.ui.social.domain.model;

import bu.a;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/assetgro/stockgro/ui/social/domain/model/SocialLanding;", HttpUrl.FRAGMENT_ENCODE_SET, "param", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "HOME_FEED", "GROUPS", "CHATS", "GROUP_FEED", "GROUP_CHAT", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SocialLanding {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SocialLanding[] $VALUES;
    public static final SocialLanding HOME_FEED = new SocialLanding("HOME_FEED", 0, "home_feed");
    public static final SocialLanding GROUPS = new SocialLanding("GROUPS", 1, "groups");
    public static final SocialLanding CHATS = new SocialLanding("CHATS", 2, "chats");
    public static final SocialLanding GROUP_FEED = new SocialLanding("GROUP_FEED", 3, "group_feed");
    public static final SocialLanding GROUP_CHAT = new SocialLanding("GROUP_CHAT", 4, "chat");

    private static final /* synthetic */ SocialLanding[] $values() {
        return new SocialLanding[]{HOME_FEED, GROUPS, CHATS, GROUP_FEED, GROUP_CHAT};
    }

    static {
        SocialLanding[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private SocialLanding(String str, int i10, String str2) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static SocialLanding valueOf(String str) {
        return (SocialLanding) Enum.valueOf(SocialLanding.class, str);
    }

    public static SocialLanding[] values() {
        return (SocialLanding[]) $VALUES.clone();
    }
}
