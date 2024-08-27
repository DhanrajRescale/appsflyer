package com.assetgro.stockgro.data.model.arenaV2;

import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006&"}, d2 = {"Lcom/assetgro/stockgro/data/model/arenaV2/ArenaSection;", HttpUrl.FRAGMENT_ENCODE_SET, "currentPage", HttpUrl.FRAGMENT_ENCODE_SET, "arenaGames", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/arenaV2/ArenaGame;", "scroll", HttpUrl.FRAGMENT_ENCODE_SET, "title", "totalPages", "type", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getArenaGames", "()Ljava/util/List;", "setArenaGames", "(Ljava/util/List;)V", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "getScroll", "()Ljava/lang/String;", "getTitle", "getTotalPages", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ArenaSection {
    public static final int $stable = 8;

    @SerializedName("games")
    @NotNull
    private List<ArenaGame> arenaGames;

    @SerializedName("current_page")
    private int currentPage;

    @SerializedName("scroll")
    @NotNull
    private final String scroll;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("total_pages")
    private final int totalPages;

    @SerializedName("type")
    @NotNull
    private final String type;

    public ArenaSection(int i10, @NotNull List<ArenaGame> arenaGames, @NotNull String scroll, @NotNull String title, int i11, @NotNull String type) {
        Intrinsics.checkNotNullParameter(arenaGames, "arenaGames");
        Intrinsics.checkNotNullParameter(scroll, "scroll");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.currentPage = i10;
        this.arenaGames = arenaGames;
        this.scroll = scroll;
        this.title = title;
        this.totalPages = i11;
        this.type = type;
    }

    public static /* synthetic */ ArenaSection copy$default(ArenaSection arenaSection, int i10, List list, String str, String str2, int i11, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = arenaSection.currentPage;
        }
        if ((i12 & 2) != 0) {
            list = arenaSection.arenaGames;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            str = arenaSection.scroll;
        }
        String str4 = str;
        if ((i12 & 8) != 0) {
            str2 = arenaSection.title;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            i11 = arenaSection.totalPages;
        }
        int i13 = i11;
        if ((i12 & 32) != 0) {
            str3 = arenaSection.type;
        }
        return arenaSection.copy(i10, list2, str4, str5, i13, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    @NotNull
    public final List<ArenaGame> component2() {
        return this.arenaGames;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getScroll() {
        return this.scroll;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final ArenaSection copy(int currentPage, @NotNull List<ArenaGame> arenaGames, @NotNull String scroll, @NotNull String title, int totalPages, @NotNull String type) {
        Intrinsics.checkNotNullParameter(arenaGames, "arenaGames");
        Intrinsics.checkNotNullParameter(scroll, "scroll");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ArenaSection(currentPage, arenaGames, scroll, title, totalPages, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArenaSection)) {
            return false;
        }
        ArenaSection arenaSection = (ArenaSection) other;
        return this.currentPage == arenaSection.currentPage && Intrinsics.a(this.arenaGames, arenaSection.arenaGames) && Intrinsics.a(this.scroll, arenaSection.scroll) && Intrinsics.a(this.title, arenaSection.title) && this.totalPages == arenaSection.totalPages && Intrinsics.a(this.type, arenaSection.type);
    }

    @NotNull
    public final List<ArenaGame> getArenaGames() {
        return this.arenaGames;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    @NotNull
    public final String getScroll() {
        return this.scroll;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + e.f(this.totalPages, h.g(this.title, h.g(this.scroll, d.e(this.arenaGames, Integer.hashCode(this.currentPage) * 31, 31), 31), 31), 31);
    }

    public final void setArenaGames(@NotNull List<ArenaGame> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.arenaGames = list;
    }

    public final void setCurrentPage(int i10) {
        this.currentPage = i10;
    }

    @NotNull
    public String toString() {
        int i10 = this.currentPage;
        List<ArenaGame> list = this.arenaGames;
        String str = this.scroll;
        String str2 = this.title;
        int i11 = this.totalPages;
        String str3 = this.type;
        StringBuilder sb2 = new StringBuilder("ArenaSection(currentPage=");
        sb2.append(i10);
        sb2.append(", arenaGames=");
        sb2.append(list);
        sb2.append(", scroll=");
        v.e.v(sb2, str, ", title=", str2, ", totalPages=");
        sb2.append(i11);
        sb2.append(", type=");
        sb2.append(str3);
        sb2.append(")");
        return sb2.toString();
    }
}
