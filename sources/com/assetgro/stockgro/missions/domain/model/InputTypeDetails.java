package com.assetgro.stockgro.missions.domain.model;

import a3.a;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/missions/domain/model/InputTypeDetails;", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, "validation", "subText", "placeholder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "getSubText", "getTitle", "getValidation", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InputTypeDetails {
    public static final int $stable = 0;
    private final String placeholder;

    @NotNull
    private final String subText;

    @NotNull
    private final String title;
    private final String validation;

    public InputTypeDetails(@NotNull String title, String str, @NotNull String subText, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subText, "subText");
        this.title = title;
        this.validation = str;
        this.subText = subText;
        this.placeholder = str2;
    }

    public static /* synthetic */ InputTypeDetails copy$default(InputTypeDetails inputTypeDetails, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputTypeDetails.title;
        }
        if ((i10 & 2) != 0) {
            str2 = inputTypeDetails.validation;
        }
        if ((i10 & 4) != 0) {
            str3 = inputTypeDetails.subText;
        }
        if ((i10 & 8) != 0) {
            str4 = inputTypeDetails.placeholder;
        }
        return inputTypeDetails.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValidation() {
        return this.validation;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final InputTypeDetails copy(@NotNull String title, String validation, @NotNull String subText, String placeholder) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subText, "subText");
        return new InputTypeDetails(title, validation, subText, placeholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputTypeDetails)) {
            return false;
        }
        InputTypeDetails inputTypeDetails = (InputTypeDetails) other;
        return Intrinsics.a(this.title, inputTypeDetails.title) && Intrinsics.a(this.validation, inputTypeDetails.validation) && Intrinsics.a(this.subText, inputTypeDetails.subText) && Intrinsics.a(this.placeholder, inputTypeDetails.placeholder);
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final String getSubText() {
        return this.subText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final String getValidation() {
        return this.validation;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.title.hashCode() * 31;
        String str = this.validation;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g10 = h.g(this.subText, (hashCode2 + hashCode) * 31, 31);
        String str2 = this.placeholder;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return g10 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.validation;
        return a.k(e.l("InputTypeDetails(title=", str, ", validation=", str2, ", subText="), this.subText, ", placeholder=", this.placeholder, ")");
    }
}
