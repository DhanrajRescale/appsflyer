package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class zzcg {
    private final Class zza;
    private zzch zzd;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private final List zzc = new ArrayList();
    private zznz zze = zznz.zza;

    public /* synthetic */ zzcg(Class cls, zzcf zzcfVar) {
        this.zza = cls;
    }

    private final zzcg zze(Object obj, Object obj2, zztb zztbVar, boolean z10) throws GeneralSecurityException {
        byte[] array;
        if (this.zzb != null) {
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (zztbVar.zzk() == 3) {
                Integer valueOf = Integer.valueOf(zztbVar.zza());
                if (zztbVar.zze() == zztv.RAW) {
                    valueOf = null;
                }
                zzbl zza = zzkt.zzb().zza(zzln.zza(zztbVar.zzb().zzf(), zztbVar.zzb().zze(), zztbVar.zzb().zzb(), zztbVar.zze(), valueOf), zzcr.zza());
                int ordinal = zztbVar.zze().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            array = zzbh.zza;
                        }
                    }
                    array = ByteBuffer.allocate(5).put((byte) 0).putInt(zztbVar.zza()).array();
                } else {
                    array = ByteBuffer.allocate(5).put((byte) 1).putInt(zztbVar.zza()).array();
                }
                zzch zzchVar = new zzch(obj, obj2, array, zztbVar.zzk(), zztbVar.zze(), zztbVar.zza(), zztbVar.zzb().zzf(), zza);
                ConcurrentMap concurrentMap = this.zzb;
                List list = this.zzc;
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzchVar);
                zzcj zzcjVar = new zzcj(zzchVar.zzg(), null);
                List list2 = (List) concurrentMap.put(zzcjVar, Collections.unmodifiableList(arrayList));
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list2);
                    arrayList2.add(zzchVar);
                    concurrentMap.put(zzcjVar, Collections.unmodifiableList(arrayList2));
                }
                list.add(zzchVar);
                if (z10) {
                    if (this.zzd == null) {
                        this.zzd = zzchVar;
                    } else {
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                }
                return this;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addPrimitive cannot be called after build");
    }

    public final zzcg zza(Object obj, Object obj2, zztb zztbVar) throws GeneralSecurityException {
        zze(obj, obj2, zztbVar, false);
        return this;
    }

    public final zzcg zzb(Object obj, Object obj2, zztb zztbVar) throws GeneralSecurityException {
        zze(obj, obj2, zztbVar, true);
        return this;
    }

    public final zzcg zzc(zznz zznzVar) {
        if (this.zzb != null) {
            this.zze = zznzVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzcl zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzcl zzclVar = new zzcl(concurrentMap, this.zzc, this.zzd, this.zze, this.zza, null);
            this.zzb = null;
            return zzclVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
