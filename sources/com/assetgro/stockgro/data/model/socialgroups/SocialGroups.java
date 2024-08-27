package com.assetgro.stockgro.data.model.socialgroups;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/assetgro/stockgro/data/model/socialgroups/SocialGroups;", "Ljava/util/ArrayList;", "Lcom/assetgro/stockgro/data/model/socialgroups/SocialGroupsItem;", "Lkotlin/collections/ArrayList;", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SocialGroups extends ArrayList<SocialGroupsItem> {
    public static final int $stable = 0;

    public /* bridge */ boolean contains(SocialGroupsItem socialGroupsItem) {
        return super.contains((Object) socialGroupsItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(SocialGroupsItem socialGroupsItem) {
        return super.indexOf((Object) socialGroupsItem);
    }

    public /* bridge */ int lastIndexOf(SocialGroupsItem socialGroupsItem) {
        return super.lastIndexOf((Object) socialGroupsItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ SocialGroupsItem remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ SocialGroupsItem removeAt(int i10) {
        return remove(i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SocialGroupsItem) {
            return contains((SocialGroupsItem) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof SocialGroupsItem) {
            return indexOf((SocialGroupsItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof SocialGroupsItem) {
            return lastIndexOf((SocialGroupsItem) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(SocialGroupsItem socialGroupsItem) {
        return super.remove((Object) socialGroupsItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof SocialGroupsItem) {
            return remove((SocialGroupsItem) obj);
        }
        return false;
    }
}
