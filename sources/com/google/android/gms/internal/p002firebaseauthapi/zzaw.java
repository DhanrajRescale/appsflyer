package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzaw extends zzam {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzaw(Object[] objArr, int i10, int i11) {
        this.zza = objArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzu.zza(i10, this.zzc, "index");
        Object obj = this.zza[i10 + i10 + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
