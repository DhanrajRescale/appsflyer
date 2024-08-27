package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/LimitRowObject;", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, "columns", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/util/List;)V", "getColumns", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LimitRowObject {
    public static final int $stable = 8;

    @SerializedName("columns")
    @NotNull
    private final List<String> columns;

    @SerializedName("title")
    @NotNull
    private final String title;

    public LimitRowObject(@NotNull String title, @NotNull List<String> columns) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(columns, "columns");
        this.title = title;
        this.columns = columns;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LimitRowObject copy$default(LimitRowObject limitRowObject, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = limitRowObject.title;
        }
        if ((i10 & 2) != 0) {
            list = limitRowObject.columns;
        }
        return limitRowObject.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<String> component2() {
        return this.columns;
    }

    @NotNull
    public final LimitRowObject copy(@NotNull String title, @NotNull List<String> columns) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(columns, "columns");
        return new LimitRowObject(title, columns);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitRowObject)) {
            return false;
        }
        LimitRowObject limitRowObject = (LimitRowObject) other;
        return Intrinsics.a(this.title, limitRowObject.title) && Intrinsics.a(this.columns, limitRowObject.columns);
    }

    @NotNull
    public final List<String> getColumns() {
        return this.columns;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.columns.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LimitRowObject(title=" + this.title + ", columns=" + this.columns + ")";
    }
}
