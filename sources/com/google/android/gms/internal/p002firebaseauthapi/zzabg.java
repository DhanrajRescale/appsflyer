package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import pp.g;
import zp.d;
import zp.h;
import zp.r;
import zp.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzabg implements zzabi {

    @VisibleForTesting
    Status zzA;
    private boolean zza;
    protected final int zze;
    protected g zzg;
    protected h zzh;
    protected Object zzi;
    protected aq.h zzj;
    protected zzaaw zzk;
    protected Executor zzm;
    protected zzade zzn;
    protected zzacv zzo;
    protected zzacj zzp;
    protected zzadn zzq;
    protected String zzr;
    protected String zzs;
    protected d zzt;
    protected String zzu;
    protected String zzv;
    protected zzwn zzw;
    protected zzadd zzx;
    protected zzada zzy;

    @VisibleForTesting
    Object zzz;

    @VisibleForTesting
    final zzabd zzf = new zzabd(this);
    protected final List zzl = new ArrayList();

    public zzabg(int i10) {
        this.zze = i10;
    }

    public static /* bridge */ /* synthetic */ void zzj(zzabg zzabgVar) {
        zzabgVar.zzb();
        Preconditions.checkState(zzabgVar.zza, "no success or failure set on method implementation");
    }

    public static /* bridge */ /* synthetic */ void zzk(zzabg zzabgVar, Status status) {
        aq.h hVar = zzabgVar.zzj;
        if (hVar != null) {
            ((z) hVar).b(status);
        }
    }

    public abstract void zzb();

    public final zzabg zzd(Object obj) {
        this.zzi = Preconditions.checkNotNull(obj, "external callback cannot be null");
        return this;
    }

    public final zzabg zze(aq.h hVar) {
        this.zzj = (aq.h) Preconditions.checkNotNull(hVar, "external failure callback cannot be null");
        return this;
    }

    public final zzabg zzf(g gVar) {
        this.zzg = (g) Preconditions.checkNotNull(gVar, "firebaseApp cannot be null");
        return this;
    }

    public final zzabg zzg(h hVar) {
        this.zzh = (h) Preconditions.checkNotNull(hVar, "firebaseUser cannot be null");
        return this;
    }

    public final zzabg zzh(r rVar, Activity activity, Executor executor, String str) {
        r zza = zzabu.zza(str, rVar, this);
        synchronized (this.zzl) {
            this.zzl.add((r) Preconditions.checkNotNull(zza));
        }
        if (activity != null) {
            zzaax.zza(activity, this.zzl);
        }
        this.zzm = (Executor) Preconditions.checkNotNull(executor);
        return this;
    }

    public final void zzl(Status status) {
        this.zza = true;
        this.zzA = status;
        this.zzk.zza(null, status);
    }

    public final void zzm(Object obj) {
        this.zza = true;
        this.zzz = obj;
        this.zzk.zza(obj, null);
    }
}
