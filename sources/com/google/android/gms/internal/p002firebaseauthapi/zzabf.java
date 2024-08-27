package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Pair;
import aq.c;
import aq.g0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import java.util.ArrayList;
import java.util.List;
import pp.g;
import zp.c0;
import zp.d;
import zp.h;
import zp.l;
import zp.t;

/* loaded from: classes2.dex */
public final class zzabf implements zzaaw {
    private final zzabg zza;
    private final TaskCompletionSource zzb;

    public zzabf(zzabg zzabgVar, TaskCompletionSource taskCompletionSource) {
        this.zza = zzabgVar;
        this.zzb = taskCompletionSource;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [aq.d, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaaw
    public final void zza(Object obj, Status status) {
        h hVar;
        Preconditions.checkNotNull(this.zzb, "completion source cannot be null");
        if (status != null) {
            zzabg zzabgVar = this.zza;
            if (zzabgVar.zzw != null) {
                TaskCompletionSource taskCompletionSource = this.zzb;
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzabgVar.zzg);
                zzabg zzabgVar2 = this.zza;
                zzwn zzwnVar = zzabgVar2.zzw;
                if (!"reauthenticateWithCredential".equals(zzabgVar2.zza()) && !"reauthenticateWithCredentialWithData".equals(this.zza.zza())) {
                    hVar = null;
                } else {
                    hVar = this.zza.zzh;
                }
                int i10 = zzaag.zzb;
                firebaseAuth.getClass();
                zzwnVar.getClass();
                Pair pair = (Pair) zzaag.zza.get(17078);
                String str = (String) pair.first;
                String str2 = (String) pair.second;
                List<l> zzc = zzwnVar.zzc();
                ArrayList arrayList = new ArrayList();
                for (l lVar : zzc) {
                    if (lVar instanceof t) {
                        arrayList.add((t) lVar);
                    }
                }
                List<l> zzc2 = zzwnVar.zzc();
                ArrayList arrayList2 = new ArrayList();
                for (l lVar2 : zzc2) {
                    if (lVar2 instanceof c0) {
                        arrayList2.add((c0) lVar2);
                    }
                }
                List<l> zzc3 = zzwnVar.zzc();
                String zzb = zzwnVar.zzb();
                Preconditions.checkNotNull(zzc3);
                Preconditions.checkNotEmpty(zzb);
                ?? abstractSafeParcelable = new AbstractSafeParcelable();
                abstractSafeParcelable.f2695c = new ArrayList();
                abstractSafeParcelable.f2696d = new ArrayList();
                for (l lVar3 : zzc3) {
                    if (lVar3 instanceof t) {
                        abstractSafeParcelable.f2695c.add((t) lVar3);
                    } else if (lVar3 instanceof c0) {
                        abstractSafeParcelable.f2696d.add((c0) lVar3);
                    } else {
                        throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: ".concat(String.valueOf(lVar3.J())));
                    }
                }
                abstractSafeParcelable.f2694b = zzb;
                g gVar = firebaseAuth.f11627a;
                gVar.a();
                new c(arrayList, abstractSafeParcelable, gVar.f31272b, zzwnVar.zza(), (g0) hVar, arrayList2);
                taskCompletionSource.setException(new FirebaseAuthException(str, str2));
                return;
            }
            d dVar = zzabgVar.zzt;
            if (dVar != null) {
                this.zzb.setException(zzaag.zzb(status, dVar, zzabgVar.zzu, zzabgVar.zzv));
                return;
            } else {
                this.zzb.setException(zzaag.zza(status));
                return;
            }
        }
        this.zzb.setResult(obj);
    }
}
