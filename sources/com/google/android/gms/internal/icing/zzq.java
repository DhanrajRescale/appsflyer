package com.google.android.gms.internal.icing;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import v.e;

@ShowFirstParty
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzq {

    @VisibleForTesting
    static final String[] zza = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    private static final Map<String, Integer> zzb = new HashMap(10);

    static {
        int i10 = 0;
        while (true) {
            String[] strArr = zza;
            int length = strArr.length;
            if (i10 < 10) {
                zzb.put(strArr[i10], Integer.valueOf(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    public static String zza(int i10) {
        if (i10 >= 0) {
            String[] strArr = zza;
            int length = strArr.length;
            if (i10 < 10) {
                return strArr[i10];
            }
            return null;
        }
        return null;
    }

    public static int zzb(String str) {
        Integer num = zzb.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(e.j(new StringBuilder(str.length() + 44), "[", str, "] is not a valid global search section name"));
    }
}
