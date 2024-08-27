package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzadz {
    private List zza;

    public zzadz() {
        this(null);
    }

    public final List zza() {
        return this.zza;
    }

    public zzadz(int i10, List list) {
        if (!list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.set(i11, Strings.emptyToNull((String) list.get(i11)));
            }
            this.zza = Collections.unmodifiableList(list);
            return;
        }
        this.zza = Collections.emptyList();
    }

    public zzadz(List list) {
        this.zza = new ArrayList();
    }
}
