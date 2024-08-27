package com.assetgro.stockgro.data.enums;

import bu.a;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/assetgro/stockgro/data/enums/UserRoles;", HttpUrl.FRAGMENT_ENCODE_SET, "paramName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "getParamName", "()Ljava/lang/String;", "Admin", "Moderator", "Influencer", "User", "Viewer", "Rogue", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserRoles {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserRoles[] $VALUES;

    @NotNull
    private final String paramName;
    public static final UserRoles Admin = new UserRoles("Admin", 0, "Admin");
    public static final UserRoles Moderator = new UserRoles("Moderator", 1, "Moderator");
    public static final UserRoles Influencer = new UserRoles("Influencer", 2, "Influencer");
    public static final UserRoles User = new UserRoles("User", 3, "User");
    public static final UserRoles Viewer = new UserRoles("Viewer", 4, "Viewer");
    public static final UserRoles Rogue = new UserRoles("Rogue", 5, "Rogue");

    private static final /* synthetic */ UserRoles[] $values() {
        return new UserRoles[]{Admin, Moderator, Influencer, User, Viewer, Rogue};
    }

    static {
        UserRoles[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private UserRoles(String str, int i10, String str2) {
        this.paramName = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static UserRoles valueOf(String str) {
        return (UserRoles) Enum.valueOf(UserRoles.class, str);
    }

    public static UserRoles[] values() {
        return (UserRoles[]) $VALUES.clone();
    }

    @NotNull
    public final String getParamName() {
        return this.paramName;
    }
}
