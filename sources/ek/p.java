package ek;

import android.text.TextUtils;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p implements m {

    /* renamed from: b, reason: collision with root package name */
    public final Map f15613b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f15614c;

    public p(Map map) {
        this.f15613b = Collections.unmodifiableMap(map);
    }

    @Override // ek.m
    public final Map a() {
        if (this.f15614c == null) {
            synchronized (this) {
                try {
                    if (this.f15614c == null) {
                        this.f15614c = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.f15614c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f15613b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = ((o) list.get(i10)).f15612a;
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    if (i10 != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put(entry.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f15613b.equals(((p) obj).f15613b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15613b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f15613b + UrlTreeKt.componentParamSuffixChar;
    }
}
