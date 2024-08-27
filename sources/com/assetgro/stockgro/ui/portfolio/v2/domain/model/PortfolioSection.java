package com.assetgro.stockgro.ui.portfolio.v2.domain.model;

import java.util.ArrayList;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0003J;\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R%\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/PortfolioSection;", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, "subTitle", "portfolios", "Ljava/util/ArrayList;", "Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/Portfolio;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getPortfolios", "()Ljava/util/ArrayList;", "getSubTitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PortfolioSection {
    public static final int $stable = 8;
    private final ArrayList<Portfolio> portfolios;

    @NotNull
    private final String subTitle;

    @NotNull
    private final String title;

    public PortfolioSection(@NotNull String title, @NotNull String subTitle, ArrayList<Portfolio> arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        this.title = title;
        this.subTitle = subTitle;
        this.portfolios = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PortfolioSection copy$default(PortfolioSection portfolioSection, String str, String str2, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = portfolioSection.title;
        }
        if ((i10 & 2) != 0) {
            str2 = portfolioSection.subTitle;
        }
        if ((i10 & 4) != 0) {
            arrayList = portfolioSection.portfolios;
        }
        return portfolioSection.copy(str, str2, arrayList);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    public final ArrayList<Portfolio> component3() {
        return this.portfolios;
    }

    @NotNull
    public final PortfolioSection copy(@NotNull String title, @NotNull String subTitle, ArrayList<Portfolio> portfolios) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        return new PortfolioSection(title, subTitle, portfolios);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioSection)) {
            return false;
        }
        PortfolioSection portfolioSection = (PortfolioSection) other;
        return Intrinsics.a(this.title, portfolioSection.title) && Intrinsics.a(this.subTitle, portfolioSection.subTitle) && Intrinsics.a(this.portfolios, portfolioSection.portfolios);
    }

    public final ArrayList<Portfolio> getPortfolios() {
        return this.portfolios;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.subTitle, this.title.hashCode() * 31, 31);
        ArrayList<Portfolio> arrayList = this.portfolios;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        return g10 + hashCode;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subTitle;
        ArrayList<Portfolio> arrayList = this.portfolios;
        StringBuilder l10 = e.l("PortfolioSection(title=", str, ", subTitle=", str2, ", portfolios=");
        l10.append(arrayList);
        l10.append(")");
        return l10.toString();
    }
}
