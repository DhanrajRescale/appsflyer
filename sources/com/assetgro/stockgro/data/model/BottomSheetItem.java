package com.assetgro.stockgro.data.model;

import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/data/model/BottomSheetItem;", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", HttpUrl.FRAGMENT_ENCODE_SET, "optionName", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "isSelected", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "setSelected", "(Z)V", "getOptionName", "component1", "component2", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BottomSheetItem {
    public static final int $stable = 8;

    @NotNull
    private final String displayName;
    private boolean isSelected;

    @NotNull
    private final String optionName;

    public BottomSheetItem(@NotNull String displayName, @NotNull String optionName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(optionName, "optionName");
        this.displayName = displayName;
        this.optionName = optionName;
    }

    public static /* synthetic */ BottomSheetItem copy$default(BottomSheetItem bottomSheetItem, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bottomSheetItem.displayName;
        }
        if ((i10 & 2) != 0) {
            str2 = bottomSheetItem.optionName;
        }
        return bottomSheetItem.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getOptionName() {
        return this.optionName;
    }

    @NotNull
    public final BottomSheetItem copy(@NotNull String displayName, @NotNull String optionName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(optionName, "optionName");
        return new BottomSheetItem(displayName, optionName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetItem)) {
            return false;
        }
        BottomSheetItem bottomSheetItem = (BottomSheetItem) other;
        return Intrinsics.a(this.displayName, bottomSheetItem.displayName) && Intrinsics.a(this.optionName, bottomSheetItem.optionName);
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getOptionName() {
        return this.optionName;
    }

    public int hashCode() {
        return this.optionName.hashCode() + (this.displayName.hashCode() * 31);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    @NotNull
    public String toString() {
        return h.s("BottomSheetItem(displayName=", this.displayName, ", optionName=", this.optionName, ")");
    }
}
