package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import org.jetbrains.annotations.NotNull;
import vt.y;
import vt.z;

/* loaded from: classes2.dex */
public final class zzdb {

    @NotNull
    public static final zzdb zza = new zzdb();

    @NotNull
    private static final List zzb = zzc(y.g("www.recaptcha.net", "www.gstatic.com/recaptcha"));

    private zzdb() {
    }

    public static final boolean zza(@NotNull Uri uri) {
        if (!TextUtils.isEmpty(uri.toString()) && Intrinsics.a("https", uri.getScheme()) && !TextUtils.isEmpty(uri.getHost()) && zzb(uri.toString())) {
            return true;
        }
        return false;
    }

    private static final boolean zzb(String str) {
        List list = zzb;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (s.r(str, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    private static final List zzc(List list) {
        ArrayList arrayList = new ArrayList(z.k(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }
}
