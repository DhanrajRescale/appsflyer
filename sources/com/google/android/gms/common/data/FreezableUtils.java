package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.assetgro.stockgro.data.model.socialgroups.SocialGroups;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        SocialGroups socialGroups = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            socialGroups.add(arrayList.get(i10).freeze());
        }
        return socialGroups;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        SocialGroups socialGroups = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            socialGroups.add(it.next().freeze());
        }
        return socialGroups;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        SocialGroups socialGroups = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e10 : eArr) {
            socialGroups.add(e10.freeze());
        }
        return socialGroups;
    }
}
