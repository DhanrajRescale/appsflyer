package com.assetgro.stockgro.ui.home.homepage.domain;

import a3.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/domain/MainHomeDomain;", HttpUrl.FRAGMENT_ENCODE_SET, "section", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/home/homepage/domain/SectionHomeDomain;", "(Ljava/util/List;)V", "getSection", "()Ljava/util/List;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MainHomeDomain {
    public static final int $stable = 0;

    @NotNull
    private final List<SectionHomeDomain> section;

    public MainHomeDomain(@NotNull List<SectionHomeDomain> section) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.section = section;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MainHomeDomain copy$default(MainHomeDomain mainHomeDomain, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = mainHomeDomain.section;
        }
        return mainHomeDomain.copy(list);
    }

    @NotNull
    public final List<SectionHomeDomain> component1() {
        return this.section;
    }

    @NotNull
    public final MainHomeDomain copy(@NotNull List<SectionHomeDomain> section) {
        Intrinsics.checkNotNullParameter(section, "section");
        return new MainHomeDomain(section);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MainHomeDomain) && Intrinsics.a(this.section, ((MainHomeDomain) other).section);
    }

    @NotNull
    public final List<SectionHomeDomain> getSection() {
        return this.section;
    }

    public int hashCode() {
        return this.section.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("MainHomeDomain(section=", this.section, ")");
    }
}
