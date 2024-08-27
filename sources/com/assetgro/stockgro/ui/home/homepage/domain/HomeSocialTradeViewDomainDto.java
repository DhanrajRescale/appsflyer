package com.assetgro.stockgro.ui.home.homepage.domain;

import a3.a;
import hb.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeViewDomainDto;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;", HttpUrl.FRAGMENT_ENCODE_SET, "Lhb/u;", "component1", "listItems", "copy", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Ljava/util/List;", "getListItems", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class HomeSocialTradeViewDomainDto implements WidgetDataInterface {
    public static final int $stable = 0;

    @NotNull
    private final List<u> listItems;

    public HomeSocialTradeViewDomainDto(@NotNull List<u> listItems) {
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.listItems = listItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeSocialTradeViewDomainDto copy$default(HomeSocialTradeViewDomainDto homeSocialTradeViewDomainDto, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = homeSocialTradeViewDomainDto.listItems;
        }
        return homeSocialTradeViewDomainDto.copy(list);
    }

    @NotNull
    public final List<u> component1() {
        return this.listItems;
    }

    @NotNull
    public final HomeSocialTradeViewDomainDto copy(@NotNull List<u> listItems) {
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        return new HomeSocialTradeViewDomainDto(listItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HomeSocialTradeViewDomainDto) && Intrinsics.a(this.listItems, ((HomeSocialTradeViewDomainDto) other).listItems);
    }

    @NotNull
    public final List<u> getListItems() {
        return this.listItems;
    }

    public int hashCode() {
        return this.listItems.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("HomeSocialTradeViewDomainDto(listItems=", this.listItems, ")");
    }
}
