package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/WithdrawableLimitDto;", HttpUrl.FRAGMENT_ENCODE_SET, "columns", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/remote/response/LimitColumnObjects;", "rows", "Lcom/assetgro/stockgro/data/remote/response/LimitRowObject;", "notes", HttpUrl.FRAGMENT_ENCODE_SET, "ctaTitle", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getColumns", "()Ljava/util/List;", "getCtaTitle", "()Ljava/lang/String;", "getNotes", "getRows", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WithdrawableLimitDto {
    public static final int $stable = 8;

    @SerializedName("columns")
    @NotNull
    private final List<LimitColumnObjects> columns;

    @SerializedName("cta_title")
    @NotNull
    private final String ctaTitle;

    @SerializedName("notes")
    @NotNull
    private final List<String> notes;

    @SerializedName("rows")
    @NotNull
    private final List<LimitRowObject> rows;

    public WithdrawableLimitDto(@NotNull List<LimitColumnObjects> columns, @NotNull List<LimitRowObject> rows, @NotNull List<String> notes, @NotNull String ctaTitle) {
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(notes, "notes");
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        this.columns = columns;
        this.rows = rows;
        this.notes = notes;
        this.ctaTitle = ctaTitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawableLimitDto copy$default(WithdrawableLimitDto withdrawableLimitDto, List list, List list2, List list3, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = withdrawableLimitDto.columns;
        }
        if ((i10 & 2) != 0) {
            list2 = withdrawableLimitDto.rows;
        }
        if ((i10 & 4) != 0) {
            list3 = withdrawableLimitDto.notes;
        }
        if ((i10 & 8) != 0) {
            str = withdrawableLimitDto.ctaTitle;
        }
        return withdrawableLimitDto.copy(list, list2, list3, str);
    }

    @NotNull
    public final List<LimitColumnObjects> component1() {
        return this.columns;
    }

    @NotNull
    public final List<LimitRowObject> component2() {
        return this.rows;
    }

    @NotNull
    public final List<String> component3() {
        return this.notes;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    @NotNull
    public final WithdrawableLimitDto copy(@NotNull List<LimitColumnObjects> columns, @NotNull List<LimitRowObject> rows, @NotNull List<String> notes, @NotNull String ctaTitle) {
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(notes, "notes");
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        return new WithdrawableLimitDto(columns, rows, notes, ctaTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawableLimitDto)) {
            return false;
        }
        WithdrawableLimitDto withdrawableLimitDto = (WithdrawableLimitDto) other;
        return Intrinsics.a(this.columns, withdrawableLimitDto.columns) && Intrinsics.a(this.rows, withdrawableLimitDto.rows) && Intrinsics.a(this.notes, withdrawableLimitDto.notes) && Intrinsics.a(this.ctaTitle, withdrawableLimitDto.ctaTitle);
    }

    @NotNull
    public final List<LimitColumnObjects> getColumns() {
        return this.columns;
    }

    @NotNull
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    @NotNull
    public final List<String> getNotes() {
        return this.notes;
    }

    @NotNull
    public final List<LimitRowObject> getRows() {
        return this.rows;
    }

    public int hashCode() {
        return this.ctaTitle.hashCode() + d.e(this.notes, d.e(this.rows, this.columns.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "WithdrawableLimitDto(columns=" + this.columns + ", rows=" + this.rows + ", notes=" + this.notes + ", ctaTitle=" + this.ctaTitle + ")";
    }
}
