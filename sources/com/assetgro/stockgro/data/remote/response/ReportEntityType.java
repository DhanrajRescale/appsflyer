package com.assetgro.stockgro.data.remote.response;

import bu.a;
import in.juspay.hyper.constants.LogSubCategory;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/ReportEntityType;", HttpUrl.FRAGMENT_ENCODE_SET, "paramName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "getParamName", "()Ljava/lang/String;", "User", "Message", "Post", "Comment", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReportEntityType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ReportEntityType[] $VALUES;

    @NotNull
    private final String paramName;
    public static final ReportEntityType User = new ReportEntityType("User", 0, LogSubCategory.Action.USER);
    public static final ReportEntityType Message = new ReportEntityType("Message", 1, "message");
    public static final ReportEntityType Post = new ReportEntityType("Post", 2, "post");
    public static final ReportEntityType Comment = new ReportEntityType("Comment", 3, "comment");

    private static final /* synthetic */ ReportEntityType[] $values() {
        return new ReportEntityType[]{User, Message, Post, Comment};
    }

    static {
        ReportEntityType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private ReportEntityType(String str, int i10, String str2) {
        this.paramName = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ReportEntityType valueOf(String str) {
        return (ReportEntityType) Enum.valueOf(ReportEntityType.class, str);
    }

    public static ReportEntityType[] values() {
        return (ReportEntityType[]) $VALUES.clone();
    }

    @NotNull
    public final String getParamName() {
        return this.paramName;
    }
}
