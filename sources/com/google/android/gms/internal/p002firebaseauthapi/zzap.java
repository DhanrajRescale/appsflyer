package com.google.android.gms.internal.p002firebaseauthapi;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import jr.h;

/* loaded from: classes2.dex */
public abstract class zzap implements Map, Serializable {
    private transient zzaq zza;
    private transient zzaq zzb;
    private transient zzai zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public static zzap zzc(Iterable iterable) {
        int i10;
        if (iterable instanceof Collection) {
            i10 = iterable.size();
        } else {
            i10 = 4;
        }
        zzao zzaoVar = new zzao(i10);
        zzaoVar.zza(iterable);
        zzan zzanVar = zzaoVar.zzc;
        if (zzanVar == null) {
            zzax zzg = zzax.zzg(zzaoVar.zzb, zzaoVar.zza, zzaoVar);
            zzan zzanVar2 = zzaoVar.zzc;
            if (zzanVar2 == null) {
                return zzg;
            }
            throw zzanVar2.zza();
        }
        throw zzanVar.zza();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzay.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzaq zzaqVar = this.zzb;
        if (zzaqVar == null) {
            zzaq zze = zze();
            this.zzb = zze;
            return zze;
        }
        return zzaqVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb2.append(UrlTreeKt.componentParamPrefixChar);
            boolean z10 = true;
            for (Map.Entry entry : entrySet()) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
                z10 = false;
            }
            sb2.append(UrlTreeKt.componentParamSuffixChar);
            return sb2.toString();
        }
        throw new IllegalArgumentException(h.n("size cannot be negative but was: ", size));
    }

    public abstract zzai zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzai values() {
        zzai zzaiVar = this.zzc;
        if (zzaiVar == null) {
            zzai zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzaiVar;
    }

    public abstract zzaq zzd();

    public abstract zzaq zze();

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzaq entrySet() {
        zzaq zzaqVar = this.zza;
        if (zzaqVar == null) {
            zzaq zzd = zzd();
            this.zza = zzd;
            return zzd;
        }
        return zzaqVar;
    }
}
