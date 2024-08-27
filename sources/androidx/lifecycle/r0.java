package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tu.k1;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1961f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1962a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1963b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1964c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1965d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f1966e;

    public r0(HashMap initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1962a = linkedHashMap;
        this.f1963b = new LinkedHashMap();
        this.f1964c = new LinkedHashMap();
        this.f1965d = new LinkedHashMap();
        this.f1966e = new q0(this, 0);
        linkedHashMap.putAll(initialState);
    }

    public static Bundle a(r0 this$0) {
        e0 e0Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = vt.p0.k(this$0.f1963b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.f1962a;
            if (hasNext) {
                Map.Entry entry = (Map.Entry) it.next();
                String key = (String) entry.getKey();
                Bundle a10 = ((o7.c) entry.getValue()).a();
                Intrinsics.checkNotNullParameter(key, "key");
                if (a10 != null) {
                    Class[] clsArr = f1961f;
                    for (int i10 = 0; i10 < 29; i10++) {
                        Class cls = clsArr[i10];
                        Intrinsics.c(cls);
                        if (!cls.isInstance(a10)) {
                        }
                    }
                    throw new IllegalArgumentException("Can't put value with type " + a10.getClass() + " into saved state");
                }
                Object obj = this$0.f1964c.get(key);
                if (obj instanceof e0) {
                    e0Var = (e0) obj;
                } else {
                    e0Var = null;
                }
                if (e0Var != null) {
                    e0Var.setValue(a10);
                } else {
                    linkedHashMap.put(key, a10);
                }
                tu.q0 q0Var = (tu.q0) this$0.f1965d.get(key);
                if (q0Var != null) {
                    ((k1) q0Var).m(a10);
                }
            } else {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return hl.f.y(new Pair(UserMetadata.KEYDATA_FILENAME, arrayList), new Pair("values", arrayList2));
            }
        }
    }

    public r0() {
        this.f1962a = new LinkedHashMap();
        this.f1963b = new LinkedHashMap();
        this.f1964c = new LinkedHashMap();
        this.f1965d = new LinkedHashMap();
        this.f1966e = new q0(this, 1);
    }
}
