package com.assetgro.stockgro.ui.home.homepage.data;

import a3.a;
import com.assetgro.stockgro.ui.home.homepage.domain.WidgetDataInterface;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomeExpertViewDto;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;", "listItems", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/home/homepage/data/SocialExpertGroup;", "(Ljava/util/List;)V", "getListItems", "()Ljava/util/List;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HomeExpertViewDto implements WidgetDataInterface {
    public static final int $stable = 0;

    @SerializedName("elements")
    private final List<SocialExpertGroup> listItems;

    public HomeExpertViewDto(List<SocialExpertGroup> list) {
        this.listItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeExpertViewDto copy$default(HomeExpertViewDto homeExpertViewDto, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = homeExpertViewDto.listItems;
        }
        return homeExpertViewDto.copy(list);
    }

    public final List<SocialExpertGroup> component1() {
        return this.listItems;
    }

    @NotNull
    public final HomeExpertViewDto copy(List<SocialExpertGroup> listItems) {
        return new HomeExpertViewDto(listItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HomeExpertViewDto) && Intrinsics.a(this.listItems, ((HomeExpertViewDto) other).listItems);
    }

    public final List<SocialExpertGroup> getListItems() {
        return this.listItems;
    }

    public int hashCode() {
        List<SocialExpertGroup> list = this.listItems;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("HomeExpertViewDto(listItems=", this.listItems, ")");
    }
}
